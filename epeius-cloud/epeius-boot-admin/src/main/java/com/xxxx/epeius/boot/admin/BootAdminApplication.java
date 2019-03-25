package com.xxxx.epeius.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: SpringBootAdmin 管理服务启动入口
 * Author: lishangmin
 * Created: 2019-03-25 15:37
 */
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class BootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminApplication.class, args);
	}

}
