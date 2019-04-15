package com.xxxx.epeius.redis.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Description: Redis自定义配置
 * Author: lishangmin
 * Created: 2019-04-15 14:38
 */
@SpringBootConfiguration
@ComponentScan(basePackages = {"com.xxxx.epeius.redis.service"})
public class RedisCacheConfiguration {

//	@Bean
//	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
//		RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
//		redisTemplate.setConnectionFactory(redisConnectionFactory);
//		// 设置value的序列化规则和 key的序列化规则
//		redisTemplate.setValueSerializer(new StringRedisSerializer());
//		redisTemplate.setKeySerializer(new StringRedisSerializer());
//		redisTemplate.afterPropertiesSet();
//		return redisTemplate;
//	}

}
