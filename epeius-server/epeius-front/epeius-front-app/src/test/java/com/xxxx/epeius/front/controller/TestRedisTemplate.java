package com.xxxx.epeius.front.controller;

import com.xxxx.epeius.redis.service.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Description: Redis 测试
 * Author: lishangmin
 * Created: 2019-04-15 01:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisTemplate {

	@Resource
	private RedisTemplate redisTemplate;

	@Resource
	private RedisService redisService;

	@Test
	public void testString()  {
		String key = "jimi";
		String value = "just do it";
		redisTemplate.opsForValue().set(key, value);
		Assert.assertEquals(value, redisTemplate.opsForValue().get(key));

		redisService.set(key,value);
		Assert.assertEquals(value, redisService.get(key));

	}

}
