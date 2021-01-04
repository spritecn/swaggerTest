package github.spritecn.swaggerTest.service

import github.spritecn.swaggerTest.constants.SwaggerTestException
import github.spritecn.swaggerTest.repository.tables.daos.SourceDao
import github.spritecn.swaggerTest.repository.tables.pojos.SourceEntity
import github.spritecn.swaggerTest.util.DaoFactory
import groovy.util.logging.Slf4j

import io.swagger.models.Swagger
import io.swagger.parser.SwaggerParser
import github.spritecn.swaggerTest.util.HttpUtil

@Slf4j
class SwaggerService {

    static saveSwagger(String url){
        Swagger swagger = parseApiDocByUrl(url)
        if(!swagger){
            throw new SwaggerTestException("swagger parse error")
        }
        SourceEntity entity = new SourceEntity().setBasePath(swagger.getBasePath())
                .setUrl(url)
                .setLastUpdateTime(new Date().getTime() as Integer)
                .setLastFetchTime()
        new DaoFactory(SourceDao).withCloseable {
            it.getDao().insert(entity)
        }
    }

    static Swagger parseApiDocByUrl(String url){
        def swaggerJson = HttpUtil.get(url)
        Swagger swagger = new SwaggerParser().parse(swaggerJson)
        return swagger
    }

}