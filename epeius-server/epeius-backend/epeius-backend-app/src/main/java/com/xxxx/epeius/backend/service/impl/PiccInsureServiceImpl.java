package com.xxxx.epeius.backend.service.impl;

import com.xxxx.epeius.backend.service.AbstractInsureService;
import com.xxxx.epeius.common.template.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Description: 承保示例
 * Author: lishangmin
 * Created: 2019-04-28 13:13
 */
@Component("piccIInsureService")
@Slf4j
public class PiccInsureServiceImpl extends AbstractInsureService {

	@Override
	public Result insure() {
		log.info("Picc 承保");
		return Result.success();
	}
}
