package com.xxxx.epeius.admin.config;

import com.xxxx.epeius.swagger.properties.EpeiusSwaggerProperties;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.annotation.Resource;

/**
 * Description: 管理模块web适配配置
 * Author: lishangmin
 * Created: 2019-04-24 20:07
 */
public class AdminWebConfig extends WebMvcConfigurationSupport {

	@Resource
	private EpeiusSwaggerProperties properties;

	/**
	 * 继承 WebMvcConfigurationSupport 会覆盖默认配置
	 * Swagger UI 配置需要手动添加
	 */
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

	@Override
	protected void addViewControllers(ViewControllerRegistry registry) {
		// 配置首页
		registry.addViewController("/").setViewName("forward:/index.html");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}
}
