package github.spritecn.swaggerTest.repository


import org.jooq.SQLDialect
import org.jooq.impl.DAOImpl
import org.jooq.impl.DefaultConfiguration

import java.sql.Connection
import java.sql.DriverManager

class DaoConnectUtil implements Closeable {
    private String url = "jdbc:sqlite:src/main/resources/data/main.db";
    private Connection conn = DriverManager.getConnection(url)

    def <T extends DAOImpl> T  getDao( Class<T> tClass){
        tClass.newInstance( new DefaultConfiguration().set(conn).set(SQLDialect.SQLITE))
    }

    @Override
    void close(){
        conn.close()
    }
}