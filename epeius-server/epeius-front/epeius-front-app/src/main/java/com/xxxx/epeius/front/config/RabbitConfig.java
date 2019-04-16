package com.xxxx.epeius.front.config;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Description: Rabbit 消息队列
 * Author: lishangmin
 * Created: 2019-04-16 15:33
 */
@SpringBootConfiguration
public class RabbitConfig {

	@Bean
	public Queue Queue(){
		return new Queue("hello");
	}

}
