# epeius-swagger

#### 模块介绍
    简化各个子模块的使用

#### 使用说明
    1. 添加依赖
        <dependency>
            <groupId>com.xxxx.epeius</groupId>
        	<artifactId>epeius-swagger</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

    2. 增加配置
        swagger:
          scan-package: com.xxxx.epeius # 扫描的包地址
          ui:
            show: ture # 是否展示UI界面
          info:
            title: 接口文档 # API 文档标题
            contact: # 联系信息
              name: arrows # 名字
              url: http://www.github.com # 主页地址
              email: shangmlee@foxmail.com # 邮箱

    3. 增加注解
        @EnableEpeiusSwagger
