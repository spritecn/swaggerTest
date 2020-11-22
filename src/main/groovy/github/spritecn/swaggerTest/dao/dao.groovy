package github.spritecn.swaggerTest.dao

import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.sqlite3.SQLitePlugin
import org.jdbi.v3.sqlobject.SqlObject
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper

interface BaseDao<T> extends SqlObject {
     T getById()
}
