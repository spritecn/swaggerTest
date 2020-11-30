# 更新/设计 记录

## 2020/11/29
- 表结构设计
    - source 来源表，记录swagger来源
        - id
        private String  url; //来源apiDocs地址
        private String  name; //自定义名称
        private Integer invalid; // 是否失效，失效后不更新
        private Integer lastUpdateTime; //最后修改时间
        private Integer lastFetchTime; //最获取时间
        private Integer autoFetchInterval; //自动更新间隔时间(单位分钟,在输入时设置)
        private String  basePath; //解析后文档swagger里的basePath
        private String  host; //解析后文档swagger里的host
    - api  api表，记录所有解析出来的api
        - id
        - last_update_time
        - url //完整url
        - tags //
        - headers
        - operation //请求类型 get post 
        - request_template //请求模板 json类型存json,非json类型存form格式数据或text
        - request_type  //请求类型json,form,text
        - response_type //结果类型，主要示别返回是不是json
    - task 测试任务表
    - 
## 2020/11/24
- 数据库ORM从JDBI更新到JOOQ
    1. 喜欢JOOQ链式语法
    2. SpringBoot已原生支持JOOQ,有spring-boot-starter-jooq
    3. JDBI我也没玩会,但标了一眼(其实研究了蛮久)和myBatis的注解sql没太大区别啊
        - 在xml里写sql是无法接受，同样直接注解sql也没有链式直接写在代码里来的利索

        