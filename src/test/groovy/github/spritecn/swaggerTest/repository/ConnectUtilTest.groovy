package github.spritecn.swaggerTest.repository

import github.spritecn.swaggerTest.repository.tables.daos.SwaggerDao
import github.spritecn.swaggerTest.repository.tables.pojos.SwaggerEntity
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class ConnectUtilTest extends Specification {
    def "test getDao"() {
        expect:
            SwaggerEntity swaggerEntity = new SwaggerEntity().setHost("test").setBasePath("test").setSourceUrl("..")
            def test = new DaoConnectUtil().withCloseable {
                it.getDao(SwaggerDao).insert(swaggerEntity)
            }
            log.info(test)
    }
}
