package com.xxxx.epeius.front.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Description: 队列监听
 * Author: lishangmin
 * Created: 2019-04-16 15:56
 */
@Component
@RabbitListener(queues = {"hello"})
public class HelloReceiver {

	@RabbitHandler
	public void process(String neo) {
		System.out.println("Receiver 1: " + neo);
	}

}
