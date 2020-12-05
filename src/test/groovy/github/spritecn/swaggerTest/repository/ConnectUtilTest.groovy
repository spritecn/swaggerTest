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
            def sourceEntity = new SourceEntity().setHost("test").setBasePath("test").setUrl("..").setLastUpdateTime(new Date().getTime())
        expect:
            def test = new DaoFactory(SourceDao).withCloseable {
                def dao = it.getDao()
                dao.insert(sourceEntity)
                //dao.insert(sourceEntity2)
            }
            log.info("test")
    }
}
