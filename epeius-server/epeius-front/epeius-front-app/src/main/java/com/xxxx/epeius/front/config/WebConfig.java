package com.xxxx.epeius.front.config;

import com.xxxx.epeius.front.interceptor.ApiInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: Web自动配置
 * Author: lishangmin
 * Created: 2019-04-14 14:27
 */
@SpringBootConfiguration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new ApiInterceptor());
	}


	/*
* 下面是通过继承 WebMvcConfigurationSupport 的实现
* 会导致 WebMvcAutoConfiguration 失效
*/
//	// 添加自动以拦截/
//	@Override
//	protected void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new ApiInterceptor());
//		super.addInterceptors(registry);
//	}
//
//	// 添加资源处理
//	// 添加Swagger Resource
//	@Override
//	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/swagger-ui.html").addResourceLocations(
//				"classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**").addResourceLocations(
//				"classpath:/META-INF/resources/webjars/");
//		super.addResourceHandlers(registry);
//	}

}
