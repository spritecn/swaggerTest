package github.spritecn.swaggerTest.util

import github.spritecn.swaggerTest.bean.AppConfig
import org.jooq.Configuration
import org.jooq.ConnectionProvider
import org.jooq.SQLDialect
import org.jooq.TransactionContext
import org.jooq.TransactionProvider
import org.jooq.impl.DAOImpl
import org.jooq.impl.DefaultConfiguration
import org.jooq.impl.DefaultConnectionProvider
import org.jooq.impl.DefaultTransactionContext
import org.jooq.impl.DefaultTransactionProvider
import java.sql.Connection
import java.sql.DriverManager

class DaoFactory<T extends DAOImpl>  implements Closeable {
    Class<T> dao
    private static final AppConfig appConfig = AppConfig.getConfig()
    private Connection conn = DriverManager.getConnection(appConfig.jdbcUrl)
    private  TransactionProvider transactionProvider = null
    private TransactionContext transactionContext = null

    private DaoFactory(){}
    DaoFactory(Class<T> dao){
        this.dao = dao
    }
    //default dao
    T  getDao(){
        dao.newInstance( new DefaultConfiguration().set(conn).set(SQLDialect.SQLITE))
    }


    //dao with Transactional
    //only commit on DaoFactory close
    //example
    //new DaoFactory(SourceDao).withCloseable {
    //    it.geTransactionalDao().insert(sourceEntity)
    //}
    T  geTransactionalDao(){
        ConnectionProvider connectionProvider = new DefaultConnectionProvider(conn)
        transactionProvider = new DefaultTransactionProvider(connectionProvider)
        Configuration configuration = new DefaultConfiguration().set(SQLDialect.SQLITE)
        transactionContext = new DefaultTransactionContext(configuration)
        transactionProvider.begin(transactionContext)
        configuration.set(transactionProvider)
        dao.newInstance(configuration)
    }

    @Override
    void close(){
        if(transactionProvider){
            transactionProvider.commit(transactionContext)
        }
        conn.close()
    }
}