package github.spritecn.swaggerTest.start

import static spark.Spark.*
class Application {

    static void main(String[] args) {
        staticFiles.location("/public")
        port(9090)
        get("/hello", (req, res) -> "Hello World")
        //api group
        get("/api",()->{

        })
    }
}
