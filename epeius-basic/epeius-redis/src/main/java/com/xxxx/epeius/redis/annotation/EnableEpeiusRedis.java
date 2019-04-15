package com.xxxx.epeius.redis.annotation;

import com.xxxx.epeius.redis.config.RedisCacheConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 是否使用自定义配置的Redis
 * Author: lishangmin
 * Created: 2019-04-15 14:37
 */

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE })
@Import({RedisCacheConfiguration.class})
public @interface EnableEpeiusRedis {
}
