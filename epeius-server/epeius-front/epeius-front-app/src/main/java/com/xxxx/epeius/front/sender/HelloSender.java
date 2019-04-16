package com.xxxx.epeius.front.sender;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Description: 消息队列生产者
 * Author: lishangmin
 * Created: 2019-04-16 15:41
 */
@Component
@Slf4j
public class HelloSender {

	@Resource
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "hello " + new Date();
		System.out.println("Sender : " + context);
		rabbitTemplate.convertAndSend("hello", context);
	}
}
