package github.spritecn.swaggerTest.service

import github.spritecn.swaggerTest.bean.AppConfig
import groovy.util.logging.Slf4j

import static github.spritecn.swaggerTest.constants.SwaggerTestErrorEnum.*
import github.spritecn.swaggerTest.constants.SwaggerTestException
import io.swagger.models.Swagger
import io.swagger.parser.SwaggerParser
import github.spritecn.swaggerTest.util.HttpUtil

@Slf4j
class ApiDocService {

    static Swagger parseApiDocByUrl(String url,AppConfig appConfig){
        //support url like swagger-ui.html
        if(url.endsWith(appConfig.swaggerPath)){
            url = url.replace(appConfig.swaggerPath,appConfig.apiDocPath)
        }
        def swaggerJson = HttpUtil.get(url)
        new SwaggerParser().parse(swaggerJson)
    }


}