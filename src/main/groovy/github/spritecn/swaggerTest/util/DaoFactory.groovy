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
import org.jooq.impl.DefaultTransactionProvider
import java.sql.Connection
import java.sql.DriverManager

class DaoFactory<T extends DAOImpl>  implements Closeable {
    Class<T> dao
    private static final AppConfig appConfig = AppConfig.getConfig()
    private Connection conn = DriverManager.getConnection(appConfig.jdbcUrl)

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

    @Override
    void close(){
        conn.close()
    }
}