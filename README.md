# epeius

#### 项目介绍
    基于微服务框架SpringCloud，搭建的快速开发脚手架。

#### 技术选型
    1. 基础框架：SpringBoot 2.1.0.RELEASE 、SpringCloud Greenwich.RELEASE、Mybatis、Spring Security
    2. 运行环境：Linux、JDK1.8
    3. 数据仓库：MySQL、Redis
    4. 文档框架：Swagger
    5. 其他依赖：Lombok（IDE需要安装支持插件）
    6. 开发工具：推荐使用 Intellij IDEA

#### 项目结构
    epeius
        +-- epeius-basic                     基础模块
            +-- epeius-common                   公共基础模块
            +-- epeius-druid                    德鲁伊连接池，侧重监控
            +-- epeius-swagger                  在线文档基础模块
        +-- epeius-server                    业务服务模块
            +-- epeius-front                    示例服务1
                +-- epeius-front-app                控制层（程序启动入口）
                +-- epeius-front-struct             视图层，发布给消费者使用
            +-- epeius-backend                  示例服务2
                +-- epeius-backend-app              控制层（程序启动入口）
                +-- epeius-backend-struct           视图层，发布给消费者使用
        +-- epeius-cloud                     SpringCloud组件模块
            +-- epeius-eureka-register          Eureka注册中心
            +-- epeius-boot-admin               SpringBoot应用管理
        +-- epeius-security                  授权认证中心
        +-- epeius-skywalking                分布式追踪系统
        +-- pom.xml                          项目依赖管理

#### 使用教程


#### 编码规范
