package com.xxxx.epeius.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: 示例模块-1
 * Author: lishangmin
 * Created: 2019-03-24 19:47
 */
@SpringBootApplication
@EnableEurekaClient
public class FrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class);
	}

}
