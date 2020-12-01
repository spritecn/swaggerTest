# 更新/设计 记录

## 2020/11/29
- 表结构设计
    - config 全局配置表
        - id
        - last_update_time
        - type (headers,pass_condition等)
        - name 
        - value
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
    - group 测试组表,统一配置一组测试，所有task至少归于一个测试组
        - id
        - last_update_time
        - name
        - corn 执行时间表达式
        - next_time 下一次执行的时间
        - report //结果邮件报告,json数组 [{type:mail,to:,}],可以配置多个，暂只支持出件，标题默认，发件人走全局配置
    - task 测试任务表
        - id
        - last_update_time
        - api_id //对应api id
        - group_id //归属测试组id
        - request_body //请求体
        - headers //请求头json
        - pass_condition //测试通过条件,逗号分割，支持多个条件，默认status=200,可以写 response.json.msg = success 
    - result 测试结果
         - id
         - last_update_time
         - task_id
         - passed //是否通过
         - 
    - request 请求记录，所有请求都会在这里记一个日志
## 2020/11/24
- 数据库ORM从JDBI更新到JOOQ
    1. 喜欢JOOQ链式语法
    2. SpringBoot已原生支持JOOQ,有spring-boot-starter-jooq
    3. JDBI我也没玩会,但标了一眼(其实研究了蛮久)和myBatis的注解sql没太大区别啊
        - 在xml里写sql是无法接受，同样直接注解sql也没有链式直接写在代码里来的利索

        