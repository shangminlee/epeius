# epeius-register

#### 项目说明
    注册中心，基于SpringCloud Eureka

#### 部署说明
    1. 单节点
        1). 配置文件：【application-single.yml】，相关修改在此文件修改
        2). 启动参数：spring.profiles.active
        3). 启动命令：java -Dspring.profiles.active=local -jar ./target/epeius-eureka-register-1.0-SNAPSHOT-exec.jar
    2. 多节点（高可用)
        1). 本地使用双节点，生产环境可根据实际情况增加节点
        2). 配置文件：【application-peer1.yml】和【application-peer2.yml】，相关修改在此文件修改
        3). 启动参数：需分别指定【spring.profiles.active】的激活配置
        4). 启动命令：
                节点-1：java -Dspring.profiles.active=peer1 -jar ./target/epeius-eureka-register-1.0-SNAPSHOT-exec.jar
                节点-2：java -Dspring.profiles.active=peer2 -jar ./target/epeius-eureka-register-1.0-SNAPSHOT-exec.jar
        5). 本地测试需要修改Hosts，修改教程自行参考百度对应操作系统教程
