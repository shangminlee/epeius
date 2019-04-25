package com.xxxx.epeius.admin.config;

import com.xxxx.epeius.admin.properties.SecurityConstants;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Description: 后台管理模块关于SpringSecurity的配置
 * Author: lishangmin
 * Created: 2019-04-24 14:58
 */
@SpringBootConfiguration
public class AdminSecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 配置密码加密方式
	 * @return 密码加密方式
	 */
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	/**
	 * SpringSecurity基础配置
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 配置登录页面
		http.formLogin().loginPage(SecurityConstants.DEFAULT_LOGIN_PAGE).loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESS_URL).permitAll();
		// 页面的JS、CSS、图片等资源不需要授权
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/**/*.css", "/**/*.css.map", "/**/*.js", "/**/*.png", "/**/*.gif", "/**/*.jpg").permitAll();
		// 页面字体
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/**/*.ttf", "/**/*.woff", "/**/*.woff2").permitAll();
		// 所有的页面都需要授权
		http.authorizeRequests().anyRequest().authenticated().and().csrf().disable();
	}

	@Configuration
	public static class OauthAdminSecurityConfig {

	}
}
