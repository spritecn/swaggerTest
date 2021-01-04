package github.spritecn.swaggerTest.service

import spock.lang.Specification

class SwaggerServiceTest extends Specification {
    def "test saveSwagger"() {
        given:
            def url  = "https://petstore.swagger.io/v2/swagger.json"
        when:
            SwaggerService.saveSwagger(url)
        then:
            true
    }
}
