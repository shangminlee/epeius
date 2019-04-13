# epeius-hystrix-dashboard

#### 模块介绍
    熔断监控

#### 使用说明
    1. 参考文档地址
        https://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/2.1.0.RELEASE/single/spring-cloud-netflix.html#_how_to_include_hystrix

    2. SpringBoot 2.x hystrix 地址
        http://127.0.0.1:9001/actuator/hystrix.stream
    3. SpringBoot 2.x hystrix dashboard 地址
        http://127.0.0.1:9005/hystrix/

    4. Hystrix Dashboard 支持 3 种监控方式。

        1) 默认集群监控：地址是 http://[turbine-hostname:port]/turbine.stream，可以开启实现对默认集群的监控；

        2) 指定集群监控：地址是 http://[turbine-hostname:port]/turbine.stream?cluster=[cluster Name]，可以开启对指定 clusterName 集群的监控；

        3) 单机应用监控：地址是 http://[hystrix-app:port]/hystrix.stream，可以开启对某个服务实例的监控。