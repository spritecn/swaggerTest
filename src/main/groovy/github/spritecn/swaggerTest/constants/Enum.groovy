package github.spritecn.swaggerTest.constants

class Enum {
}


enum ConfigType{
    INIT_TYPE(0,'初始TYPE'),

    private Integer code
    private String msg

    ConfigType(Integer code, String msg){
        this.code = code
        this.msg = msg
    }
}


enum ApiMethod{
    GET,
    POST
}

enum ApiRequestType{
    TEXT,
    JSON,
    FORM,

}

enum ApiResponseType{
    TEXT,
    JSON,
}