package github.spritecn.swaggerTest.util

import groovy.util.logging.Slf4j
import spock.lang.Specification

@Slf4j
class HttpUtilTest extends Specification {
    def "Get"() {
        given:
        def httpUtil = new HttpUtil();
        expect:
            httpUtil.asyncGet("http://www.qq.coms", {String s-> log.info(s.length().toString()) })
    }
}