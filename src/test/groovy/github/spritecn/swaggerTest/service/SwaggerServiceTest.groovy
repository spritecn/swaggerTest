package github.spritecn.swaggerTest.service

import spock.lang.Specification

class SwaggerServiceTest extends Specification {
    def "test saveSwagger"() {
        given:
            def url  = "http://qfcc.qiaofangyun.com/api/call/swagger-ui.html"
        when:
            SwaggerService.saveSwagger(url)
        then:
            true
    }
}
