package com.xxxx.epeius.security.browser;

import com.xxxx.epeius.security.browser.authentication.EpeiusAuthenticationFailHandler;
import com.xxxx.epeius.security.browser.authentication.EpeiusAuthenticationSuccessHandler;
import com.xxxx.epeius.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;

/**
 * Description: 浏览器端SpringSecurity核心配置
 * Author: lishangmin
 * Created: 2019-04-17 22:45
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
@ComponentScan(basePackages = {"com.xxxx.epeius.security.browser"})
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {

	@Resource
	private SecurityProperties securityProperties;

	@Resource
	private EpeiusAuthenticationSuccessHandler epeiusAuthenticationSuccessHandler;

	@Resource
	private EpeiusAuthenticationFailHandler epeiusAuthenticationFailHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin()
				.loginPage("/authentication/require")
				.loginProcessingUrl("/authentication/form")
				.successHandler(epeiusAuthenticationSuccessHandler)
				.failureHandler(epeiusAuthenticationFailHandler)
				.and()
				.authorizeRequests()
				.antMatchers("/authentication/require",securityProperties.getBrowser().getLoginPage()).permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.csrf().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
