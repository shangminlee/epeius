# epeius-swagger

#### 模块介绍
    简化各个子模块的使用Swagger

#### 使用说明
    1. 添加依赖
        <dependency>
            <groupId>com.xxxx.epeius</groupId>
        	<artifactId>epeius-swagger</artifactId>
            <version>1.0.0-SNAPSHOT</version>
        </dependency>

    2. 增加配置
        swagger:
          show: true    # 是否展示UI界面
          scan-package: com.xxxx.epeius# 扫描的包地址
          info:
            title: 接口文档 # API 文档标题
            contact: # 联系信息
              name: arrows # 名字
              url: http://www.github.com # 主页地址
              email: shangmlee@foxmail.com # 邮箱

    3. 增加注解
        @EnableEpeiusSwagger

    4. 注意事项
        如果在子项目中继承了 WebMvcConfigurationSupport 会导致
        WebMvcConfigurationSupport 失效 将无法访问 swagger-ui.html 需要在子类中手动覆盖添加
        // 添加Swagger Resource
        @Override
        protected void addResourceHandlers(ResourceHandlerRegistry registry) {
            if(properties.isShow()){
                registry.addResourceHandler("/swagger-ui.html").addResourceLocations(
                        "classpath:/META-INF/resources/");
             registry.addResourceHandler("/webjars/**").addResourceLocations(
                        "classpath:/META-INF/resources/webjars/");
            }
            super.addResourceHandlers(registry);
        }

    5. API DOC JSON 地址
        http://127.0.0.1:9003/v2/api-docs