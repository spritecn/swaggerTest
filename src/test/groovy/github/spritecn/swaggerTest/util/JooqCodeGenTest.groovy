package github.spritecn.swaggerTest.util

class JooqCodeGenTest {
    def gen(){
        def writer = new StringWriter()
        new groovy.xml.MarkupBuilder(writer)
                .configuration('xmlns': 'http://www.jooq.org/xsd/jooq-codegen-3.13.0.xsd') {
                    jdbc() {
                        url('jdbc:sqlite:src/main/resources/data/main.db') // src/main/resources/database.db为数据库路径
                        //user() //不需要用户名，省略
                        //password() //不需要密码，省略
                    }
                    generator() {
                        database() {
                            includes('.*') //包括的数据表
                            excludes("sqlite_sequence") //排除系统自增id表
                            inputSchema() //默认数据库
                        }
                        generate([:]) {
                            pojos true,['postfix':"Entity"]
                            daos true
                            fluentSetters true
                            javaBeansGettersAndSetters true
                        }
                        target() {
                            packageName('github.spritecn.swaggerTest.repository') //计划用于存储生成结果的包名
                            directory('src/main/groovy') //将生成结果储存于src/main/java
                        }
                    }
                }
        org.jooq.codegen.GenerationTool.generate(writer.toString())
    }
}
