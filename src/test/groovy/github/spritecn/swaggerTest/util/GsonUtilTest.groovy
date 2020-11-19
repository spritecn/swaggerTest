package github.spritecn.swaggerTest.util

import spock.lang.Specification

class GsonUtilTest extends Specification {
    def "GsonUtil.getList"() {
        expect:
            GsonUtil.getList('["1","2"]',String).size() == 2
            GsonUtil.getList('["1","2"]',String.class).size() == 2
    }
}
