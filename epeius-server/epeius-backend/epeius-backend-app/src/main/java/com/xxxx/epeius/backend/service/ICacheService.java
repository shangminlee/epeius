package com.xxxx.epeius.backend.service;

/**
 * Description: 示例服务
 * Author: lishangmin
 * Created: 2019-03-25 22:46
 */
public interface ICacheService {

	int set(String key, String value);

	String get(String key);

}
