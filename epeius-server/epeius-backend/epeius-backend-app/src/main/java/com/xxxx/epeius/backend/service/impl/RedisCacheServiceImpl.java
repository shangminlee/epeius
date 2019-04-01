package com.xxxx.epeius.backend.service.impl;

import com.xxxx.epeius.backend.service.ICacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Description: redis 缓存示例服务实现
 * Author: lishangmin
 * Created: 2019-03-25 22:49
 */
@Component
@Slf4j
public class RedisCacheServiceImpl implements ICacheService {

	@Override
	public int set(String key, String value) {
		log.info("Redis Set Cache:{}", Math.random());
		return 0;
	}

	@Override
	public String get(String key) {
		log.info("Redis Get Cache:{}", Math.random());
		return null;
	}

}
