package com.xxxx.epeius.turbine.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Description: TurbineDashboard集群监控
 * Author: lishangmin
 * Created: 2019-04-14 01:49
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTurbine
public class TurbineDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineDashboardApplication.class,args);
	}

}
