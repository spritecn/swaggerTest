package github.spritecn.swaggerTest.repository

import github.spritecn.swaggerTest.repository.tables.daos.SourceDao
import github.spritecn.swaggerTest.repository.tables.pojos.SourceEntity
import github.spritecn.swaggerTest.util.DaoFactory
import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class ConnectUtilTest extends Specification {
    def "test getDao"() {
        given:
            def sourceEntity = new SourceEntity().setHost("test").setBasePath("test").setUrl("..")
        expect:
            def test = new DaoFactory(SourceDao).withCloseable {
                it.getDao().insert(sourceEntity)
            }
            log.info("test")
    }
}
