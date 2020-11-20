package github.spritecn.swaggerTest.util

import groovy.util.logging.Slf4j
import io.itit.itf.okhttp.Response
import spock.lang.Specification

@Slf4j
class HttpUtilTest extends Specification {
    def "Get"() {
        given:
        def httpUtil = new HttpUtil();
        expect:
            2.times {
                httpUtil.asyncGet("http://www.qq.com", { String response, int id -> log.info("response size:{},tag:{}", response.length(), id) })
            }
            Thread.sleep(1000)
    }
}