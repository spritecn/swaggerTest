package github.spritecn.swaggerTest.service

import github.spritecn.swaggerTest.bean.AppConfig
import github.spritecn.swaggerTest.constants.SwaggerTestException
import github.spritecn.swaggerTest.repository.tables.daos.SourceDao
import github.spritecn.swaggerTest.repository.tables.pojos.SourceEntity
import github.spritecn.swaggerTest.util.DaoFactory
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
        SourceEntity entity = new SourceEntity().setBasePath(swaggerModel.getBasePath()).setHost(swaggerModel.getHost())
                .setUrl(url)
                .setLastUpdateTime(new Date().getTime() as Integer)
                .setLastFetchTime()
        new DaoFactory(SourceDao).withCloseable {
            it.getDao().insert(entity)
        }
    }

    static SwaggerModel parseApiDocByUrl(String url){
        def swaggerJson = HttpUtil.get(url)
        new SwaggerParser().parse(swaggerJson)
    }


}