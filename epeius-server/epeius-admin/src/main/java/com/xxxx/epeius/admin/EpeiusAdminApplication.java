package com.xxxx.epeius.admin;

import com.xxxx.epeius.swagger.annotation.EnableEpeiusSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: 业务后台管理系统
 * Author: lishangmin
 * Created: 2019-04-24 14:44
 */
@SpringBootApplication
@EnableEpeiusSwagger
public class EpeiusAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpeiusAdminApplication.class,args);
	}

}
