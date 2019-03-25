package com.xxxx.epeius.middle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description: 示例服务-2
 * Author: lishangmin
 * Created: 2019-03-25 13:56
 */
@SpringBootApplication
@EnableEurekaClient
public class MiddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddleApplication.class,args);
	}

}
