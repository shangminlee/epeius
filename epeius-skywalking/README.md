# epeius-skywalking

1. SkyWalking 是什么？

    ```ini
     SkyWalking创建于2015年，提供分布式追踪功能。从5.x开始，项目进化为一个完成功能的Application Performance Management系统。
     它被用于追踪、监控和诊断分布式系统，特别是使用微服务架构、云原生或容器技术。主要提供以下主要功能：
         * 分布式追踪和上下文传输
         * 应用、实例、服务性能指标分析
         * 根源分析
         * 应用拓扑分析
         * 应用和服务依赖分析
         * 慢服务检测
         * 性能优化
     ```

2. SkyWalking 的主要特性。

    ```ini
    * 多语言探针或类库
        - Java 自动探针，追踪和监控程序时，不需要修改源码。
        - 社区提供的其他多语言探针
            - .NET Core
            - Node.js
    * 多种数据存储: ElasticSearch、H2
    * 支持 OpenTracing
    	- Java自动探针支持和 OpenTracing API 协同工作
    * 轻量级、完善功能的后端聚合和分析
    * 现代化 WebUI
    * 应用、实例和服务的告警
    ```

3.  下载部署安装
    ```shell
    # 1) 安装JDK 去官网找最新的下载授权
    https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

    mv jdk-8u201-linux-x64.rpm\?AuthParam\=1552717822_69b636872bf7df309d90986b51755a89 jdk-8u201-linux-x64.rpm

    rpm -ivh jdk-8u201-linux-x64.rpm

    # 2) 下载SkyWalking
    wget https://mirrors.tuna.tsinghua.edu.cn/apache/incubator/skywalking/6.0.0-GA/apache-skywalking-apm-incubating-6.0.0-GA.tar.gz

    tar -xvf apache-skywalking-apm-incubating-6.0.0-GA.tar.gz

    # 3) 后台服务采用 MySQL作为数据存储, 由于MySQL不符合apache license 需要手动拷贝进lib
    cp mysql-connector-java-6.0.6.jar /path/apache-skywalking-apm-incubating/oap-libs

    # SkyWalking对MySQL存在兼容问题
    # 4）修改后台服务配置
    vim ./config/application.yml
    # 注释掉默认的 storage 放开 mysql

    # 5) 修改数据库配置
    vim ./config/datasource-settings.properties
    # 数据库地址、账户、密码等等配置

    # 6) 启动 后台服务
    ./bin/oapService.sh

    # SkyWalking对MySQL存在兼容问题 5.6 需要修改
    # 启动MySQL时候可能会出现 java.sql.SQLSyntaxErrorException: Specified key was too long; max key length is 767 bytes
    # 解决方法：
    #    1 使用innodb引擎；
    #    2 启用innodb_large_prefix选项，将约束项扩展至3072byte；
    #    3 重新创建数据库；
    # my.cnf配置：
    #    default-storage-engine=INNODB
    #    innodb_large_prefix=on
    #
    # show global variables like "innodb_large_prefix"
    # SET GLOBAL innodb_large_prefix=on

    # 7) 修改配置文件
    vim ./webapp/webapp.yml
    # 修改内容如下
    collector:
      path: /graphql
      ribbon:
        ReadTimeout: 10000
        # Point to all backend's restHost:restPort, split by ,
        listOfServers: 192.168.43.84:12800

    # 8) 启动 WebUI
    ./bin/webappService.sh

    # 部署 Agent
    # 修改配置文件
    vim ./agent/config/agent.config

    # 注册中心
    java -javaagent:/root/apache-skywalking-apm-incubating/agent/skywalking-agent.jar -jar demeter-eureka-0.0.1-SNAPSHOT-exec.jar > nohup.out &

    # 服务-1
    java -javaagent:/root/apache-skywalking-apm-incubating/agent/skywalking-agent.jar -Deureka.instance.prefer-ip-address=true -Deureka.client.serviceUrl.defaultZone=http://172.26.191.6:8761/eureka -jar ares-generator-app-1.0.0-SNAPSHOT-exec.jar > nohup.out &

    # 服务-2
    java -javaagent:/root/apache-skywalking-apm-incubating/agent/skywalking-agent.jar -Deureka.instance.prefer-ip-address=true -Deureka.client.serviceUrl.defaultZone=http://172.26.191.6:8761/eureka -jar ares-template-app-1.0.0-SNAPSHOT-exec.jar > nohup.out &

    ```