package com.xxxx.epeius.swagger.config;

import com.xxxx.epeius.swagger.condition.SwaggerCondition;
import com.xxxx.epeius.swagger.properties.EpeiusSwaggerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-04-12 14:46
 */
@Configuration
@Conditional(SwaggerCondition.class)
@EnableConfigurationProperties(EpeiusSwaggerProperties.class)
@EnableSwagger2
public class EpeiusSwaggerConfiguration extends WebMvcConfigurationSupport {

	@Resource
	EpeiusSwaggerProperties properties;

	@Bean
	public Docket initDocket(){
		// API Information
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title(properties.getTitle())
				.contact(new Contact(properties.getContactName(),properties.getContactUrl(),properties.getContactEmail()))
				.build();
		// 初始化Swagger

		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.basePackage(properties.getScanPackage()))
				.paths(PathSelectors.any())
				.build();
		return docket;

	}

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
}
