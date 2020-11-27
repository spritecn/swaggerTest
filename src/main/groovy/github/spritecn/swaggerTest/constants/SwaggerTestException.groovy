package github.spritecn.swaggerTest.constants

class SwaggerTestException extends Exception {
    protected String errorCode;

    public SwaggerTestException(String msg, Throwable t) {
        super(msg, t);
    }

    public SwaggerTestException(String errorCode, String msg) {
        super(msg);
        this.errorCode = errorCode;
    }


    public SwaggerTestException(String msg) {
        super(msg);
    }

    public SwaggerTestException(Throwable cause) {
        super(cause);
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
