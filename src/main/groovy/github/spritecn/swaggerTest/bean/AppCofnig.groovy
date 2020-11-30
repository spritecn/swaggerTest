package github.spritecn.swaggerTest.bean

import cn.hutool.setting.dialect.Props
import groovy.transform.Immutable


/**
 * @author: spriteCn*
 * @Date: 2020/11/19.
 * @Description: api-docs/v2&swaggerUi  Url
 */

@Immutable
class AppConfig{
    String swaggerPath
    String apiDocPath
    String jdbcUrl

    static AppConfig getConfig(){
        Props props = new Props("app.properties")
        new AppConfig(props.getProperty("apiDoc.swaggerPath"),props.getProperty("apiDoc.apiDocPath"),props.getProperty("jdbc.url"))
    }
}



