# epeius-turbine-dashboard

#### 模块介绍
    集群监控，假设 服务A 部署了 3台机器，我们通过Turbine对整个集群进行监控。

#### 使用说明
    1. Hystrix Dashboard 支持 3 种监控方式。

        1) 默认集群监控：地址是 http://[turbine-hostname:port]/turbine.stream，可以开启实现对默认集群的监控；

        2) 指定集群监控：地址是 http://[turbine-hostname:port]/turbine.stream?cluster=[cluster Name]，可以开启对指定 clusterName 集群的监控；

        3) 单机应用监控：地址是 http://[hystrix-app:port]/hystrix.stream，可以开启对某个服务实例的监控。