package com.xxxx.epeius.eureka.register.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description: 禁用CSRF，SpringSecurity默认开启，
 * 				如果不禁用无法通过用户名注册
 * Author: lishangmin
 * Created: 2019-03-24 19:01
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		super.configure(http);
	}

}
