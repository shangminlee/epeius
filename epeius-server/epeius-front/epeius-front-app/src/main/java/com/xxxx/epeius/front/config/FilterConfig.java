package com.xxxx.epeius.front.config;

import com.xxxx.epeius.front.filter.SampleFilter2;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 过滤器配置
 * Author: lishangmin
 * Created: 2019-04-17 15:33
 */
@SpringBootConfiguration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();

		// 设置注册的Bean
		registrationBean.setFilter(new SampleFilter2());

		List<String> urls = new ArrayList<>();

		urls.add("/front/insure");

		registrationBean.setUrlPatterns(urls);
		return registrationBean;
	}
}
