package com.xxxx.epeius.backend;

import com.xxxx.epeius.swagger.annotation.EnableEpeiusSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Description: 示例服务-3
 * Author: lishangmin
 * Created: 2019-03-25 13:55
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableEpeiusSwagger
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
