package github.spritecn.swaggerTest.bean

import spock.lang.Specification

class ConfigLoadTest extends Specification {
    def "test getconfig"() {
        given:
            AppConfig appConfig = AppConfig.getConfig()

        expect:
            appConfig.swaggerPath == 'swagger-ui.html'

    }
}
