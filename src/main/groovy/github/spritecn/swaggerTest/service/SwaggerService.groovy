package github.spritecn.swaggerTest.service

import github.spritecn.swaggerTest.bean.AppConfig
import github.spritecn.swaggerTest.constants.SwaggerTestException
import github.spritecn.swaggerTest.repository.DaoConnectUtil
import github.spritecn.swaggerTest.repository.tables.daos.SwaggerDao
import github.spritecn.swaggerTest.repository.tables.pojos.SwaggerEntity
import groovy.util.logging.Slf4j

import io.swagger.models.Swagger as SwaggerModel
import io.swagger.parser.SwaggerParser
import github.spritecn.swaggerTest.util.HttpUtil

@Slf4j
class SwaggerService {
    static final AppConfig appConfig = AppConfig.getConfig()

    static saveSwagger(String url){
        if(url.endsWith(appConfig.swaggerPath)){
            url = url.replace(appConfig.swaggerPath,appConfig.apiDocPath)
        }
        SwaggerModel swaggerModel = parseApiDocByUrl(url)
        if(!swaggerModel){
            throw new SwaggerTestException("swagger parse error")
        }
        SwaggerEntity entity = new SwaggerEntity().setBasePath(swaggerModel.getBasePath()).setHost(swaggerModel.getHost()).setSchemes(swaggerModel.getSchemes()?swaggerModel.getSchemes().join(","):"HTTP").setSourceUrl(url)
        new DaoConnectUtil().withCloseable {
            it.getDao(SwaggerDao).insert(entity)
        }
    }

    static SwaggerModel parseApiDocByUrl(String url){
        def swaggerJson = HttpUtil.get(url)
        new SwaggerParser().parse(swaggerJson)
    }


}