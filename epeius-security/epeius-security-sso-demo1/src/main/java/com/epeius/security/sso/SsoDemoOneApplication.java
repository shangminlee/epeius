package com.epeius.security.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 单点登录测试 1
 * Author: lishangmin
 * Created: 2019-04-25 16:33
 */
@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SsoDemoOneApplication {

	@GetMapping("/user")
	public Authentication user(Authentication user) {
		return user;
	}

	public static void main(String[] args) {
		SpringApplication.run(SsoDemoOneApplication.class,args);
	}

}
