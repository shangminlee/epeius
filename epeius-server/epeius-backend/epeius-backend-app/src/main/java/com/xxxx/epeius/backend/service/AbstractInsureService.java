package com.xxxx.epeius.backend.service;

import lombok.extern.slf4j.Slf4j;

/**
 * Description: 承保抽象类
 * Author: lishangmin
 * Created: 2019-04-28 13:14
 */
@Slf4j
public abstract class AbstractInsureService implements IInsureService{

	public void connPlatform(){
		log.info("连接行业平台");
	}
}
