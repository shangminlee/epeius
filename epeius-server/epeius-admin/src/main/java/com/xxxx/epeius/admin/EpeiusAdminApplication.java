package com.xxxx.epeius.admin;

import com.xxxx.epeius.security.browser.annotation.EnableEpeiusBrowserSecurity;
import com.xxxx.epeius.swagger.annotation.EnableEpeiusSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: 后台管理模块
 * Author: lishangmin
 * Created: 2019-04-18 13:40
 */
@SpringBootApplication
@EnableEpeiusSwagger
@EnableEpeiusBrowserSecurity
public class EpeiusAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpeiusAdminApplication.class,args);
	}

}
