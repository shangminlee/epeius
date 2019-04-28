package com.xxxx.epeius.security.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Description: 授权中心启动程序
 * Author: lishangmin
 * Created: 2019-04-28 09:42
 */
@SpringBootApplication
@EnableAuthorizationServer
public class SecurityAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityAuthApplication.class,args);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
