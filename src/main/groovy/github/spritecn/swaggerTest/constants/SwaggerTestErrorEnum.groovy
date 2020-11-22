package github.spritecn.swaggerTest.constants

enum SwaggerTestErrorEnum {
    SWAGGER_URL_ERROR("001","SWAGGER_URL_ERROR"),


    private String code
    private String msg
    SwaggerTestErrorEnum(String code, String msg){
        this.code = code
        this.msg = msg
    }

    String getCode() {
        return code
    }

    String getMsg() {
        return msg
    }
}