package com.xxxx.epeius.backend.service.impl;

import com.xxxx.epeius.backend.service.ICacheService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description: MySQL缓存实现
 * Author: lishangmin
 * Created: 2019-03-25 22:48
 */
@Service
@Slf4j
public class MySQLCacheServiceImpl implements ICacheService {

	@Override
	public int set(String key, String value) {
		log.info("MySQL Set Cache:{}", Math.random());
		return 0;
	}

	@Override
	public String get(String key) {
		log.info("MySQL Get Cache:{}",Math.random());
		return null;
	}

}
