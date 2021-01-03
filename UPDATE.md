# 更新/设计 记录
## 2020/12/5
- 测试可用api:http://api.vikingship.xyz/public/swagger/swagger.json


## 2020/11/29
- 表结构设计
    - config 全局配置表
        - id
        - last_update_time
        - type  //(headers,pass_condition等)
        - name  //配置名
        - value //配置值
        ```sql
            CREATE TABLE "config" (
                "id"	INTEGER NOT NULL,
                "last_update_time"	INT8,
                "type"	INT2 DEFAULT 0,
                "name"	TEXT,
                "value"	TEXT,
                PRIMARY KEY("id" AUTOINCREMENT)
            );
        ```
    - source 来源表，记录swagger来源
        - id
        - url; //来源apiDocs地址
        - name; //自定义名称
        - invalid; // 是否失效，失效后不更新
        - lastUpdateTime; //最后修改时间
        - lastFetchTime; //最获取时间
        - autoFetchInterval; //自动更新间隔时间(单位分钟,在输入时设置)
        - basePath; //解析后文档swagger里的basePath,http://ssss.com/api
        ```sql
                CREATE TABLE "source" (
            "id"	INTEGER NOT NULL,
            "url"	TEXT NOT NULL,
            "name"	TEXT,
            "invalid"	INT2 NOT NULL DEFAULT 0,
            "last_update_time"	INT8,
            "last_fetch_time"	INT8,
            "auto_fetch_interval"	INT2 DEFAULT 0,
            "base_path"	TEXT,
            PRIMARY KEY("id" AUTOINCREMENT)
            );
        ```
    - api  api表，记录所有解析出来的api
        - id
        - last_update_time
        - source_id
        - url //完整url
        - tags //
        - method //请求类型 get post 
        - request_template //请求模板 json类型存json,非json类型存form格式数据或text
        - request_type  //请求类型json,form,text
        - response_type //结果类型，主要示别返回是不是json
          ```sql
          CREATE TABLE "api" (
          "id"	INTEGER NOT NULL,
          "last_update_time"	INT8,
          "source_id"	INTEGER NOT NULL,
          "url"	TEXT,
          "tags"	TEXT,
          "method"	INT2 DEFAULT 0,
          "request_type"	INT2 DEFAULT 0,
          "response_type"	INT2 DEFAULT 0,
          "request_template"	TEXT,
          PRIMARY KEY("id" AUTOINCREMENT)
          );
        ```
    - group 测试组表,统一配置一组测试，所有task至少归于一个测试组
        - id
        - last_update_time
        - name
        - corn 执行时间表达式
        - next_execute_time 下一次执行的时间
        - report_json //结果邮件报告,json数组 [{type:mail,to:,}],可以配置多个，暂只支持邮件，标题默认，发件人走全局配置，收件可多选
       ```sql
          CREATE TABLE "api" (
          "id"	INTEGER NOT NULL,
          "last_update_time"	INT8,
          "name"	TEXT,
          "corn"	TEXT,
          "next_execute_time"	INT8,
          "report_json"	TEXT,
          PRIMARY KEY("id" AUTOINCREMENT)
          );
        ```
    - running 执行表
        - id
        - last_update_time
        - group_id
        - fail_count
        - pass_count
        - start_time /整个group开始时间
        - end_time //整个group结束时间
          ```sql
          CREATE TABLE "running" (
          "id"	INTEGER NOT NULL,
          "last_update_time"	INT8,
          "group_id"	INTEGER NOT NULL,
           "fail_count"	INTEGER,
          "pass_count"	INTEGER,
          "start_time"	INT8,
          "end_time"	INT8,
          PRIMARY KEY("id" AUTOINCREMENT)
          );
          ```
    - task 测试任务表
        - id
        - last_update_time
        - api_id //对应api id
        - group_id //归属测试组id
        - request_body //请求体
        - request_headers //请求头json
        - pass_condition //测试通过条件,逗号分割，支持多个条件，默认status=200,可以写 response.json.msg = success
        - last_passed //最后一次测试是否通过
        - last_query_time //最后一次测试用的时间
          ```sql
          CREATE TABLE "task" (
          "id"	INTEGER NOT NULL,
          "last_update_time"	INT8,
          "request_body"	TEXT,
          "fail_count"	INTEGER,
          "pass_count"	INTEGER,
          "start_time"	INT8,
          "end_time"	INT8,
          PRIMARY KEY("id" AUTOINCREMENT)
          );
          ```
    - request 请求记录，所有请求都会在这里记一个日志
           - id
           - last_update_time 
           - running_id //执行表id
           - task_id //任务表id
           - start_time //请求开始时间
           - end_time //请求结束时间
           - request  //包含内容和头
           - response //包含内容和头
           - status_code  //状态码
           
           ``` sql
             CREATE TABLE "task" (
             "id"	INTEGER NOT NULL,
             "last_update_time"	INT8,
             "task_id"	INTEGER,
             "start_time"	INT8,
             "end_time"	INT8,
             "request"	TEXT,
             "response"	TEXT,
             "status_code"	INTEGER,
             PRIMARY KEY("id" AUTOINCREMENT)
             );
             ```
## 2020/11/24
- 数据库ORM从JDBI更新到JOOQ
    1. 喜欢JOOQ链式语法
    2. SpringBoot已原生支持JOOQ,有spring-boot-starter-jooq
    3. JDBI我也没玩会,但标了一眼(其实研究了蛮久)和myBatis的注解sql没太大区别啊
        - 在xml里写sql是无法接受，同样直接注解sql也没有链式直接写在代码里来的利索

        