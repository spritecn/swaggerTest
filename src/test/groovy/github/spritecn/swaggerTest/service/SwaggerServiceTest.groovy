package github.spritecn.swaggerTest.service

import spock.lang.Specification

class SwaggerServiceTest extends Specification {
    def "test saveSwagger"() {
        given:
            def url  = "http://doc-route.dev.qiaofangyun.com/api/cccallbff/swagger-ui.html"
        when:
            SwaggerService.saveSwagger(url)
        then:
            true
    }
}
