package github.spritecn.swaggerTest.util

import github.spritecn.swaggerTest.bean.AppConfig
import org.jooq.SQLDialect
import org.jooq.impl.DAOImpl
import org.jooq.impl.DefaultConfiguration
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
        dao.newInstance(new DefaultConfiguration().set(conn).set(SQLDialect.SQLITE))
    }



    @Override
    void close(){
        conn.close()
    }
}