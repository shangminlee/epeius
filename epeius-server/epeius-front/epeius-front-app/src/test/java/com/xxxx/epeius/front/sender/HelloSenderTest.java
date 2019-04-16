package com.xxxx.epeius.front.sender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * Description: 测试队列
 * Author: lishangmin
 * Created: 2019-04-16 15:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSenderTest {

	@Resource
	private HelloSender helloSender;

	@Test
	public void whenSendSuccess() {
		for (int i = 0; i < 100; i++) {
			helloSender.send();
		}
		helloSender.send();
	}
}
