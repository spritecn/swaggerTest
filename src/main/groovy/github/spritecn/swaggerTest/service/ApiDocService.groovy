package github.spritecn.swaggerTest.service

import github.spritecn.swaggerTest.bean.ApiDocUrlBean
import github.spritecn.swaggerTest.constants.SwaggerTestException
import io.swagger.models.Swagger
import io.swagger.parser.SwaggerParser
import github.spritecn.swaggerTest.util.HttpUtil

class ApiDocService {
    static Swagger parseApiDocByUrl(String url, ApiDocUrlBean apiDocUrlBean){
        //support url like swagger-ui.html
        if(url.endsWith(apiDocUrlBean.swaggerPath)){
            url.replace(apiDocUrlBean.swaggerPath,apiDocUrlBean.apiDocPath)
        }
        //ending with list
        if(apiDocUrlBean.supportPathEndingList.any({url.endsWith(it)})){
            throw new SwaggerTestException("001","not support url")
        }
        def swaggerJson = HttpUtil.get(url)
        new SwaggerParser().parse(swaggerJson)
    }
}