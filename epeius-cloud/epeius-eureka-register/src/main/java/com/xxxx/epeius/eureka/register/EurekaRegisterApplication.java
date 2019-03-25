package com.xxxx.epeius.eureka.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description: 注册中心启动入口
 * Author: lishangmin
 * Created: 2019-03-24 03:57
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRegisterApplication.class, args);
	}

}
