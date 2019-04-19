package com.xxxx.epeius.front;

import com.xxxx.epeius.security.browser.annotation.EnableEpeiusBrowserSecurity;
import com.xxxx.epeius.swagger.annotation.EnableEpeiusSwagger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: 示例模块-1
 * Author: lishangmin
 * Created: 2019-03-24 19:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableEpeiusSwagger
@EnableHystrix
@MapperScan(basePackages = {"com.xxxx.epeius.front.mapper"})
//@EnableEpeiusRedis
@EnableEpeiusBrowserSecurity
public class FrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontApplication.class,args);
	}

}
