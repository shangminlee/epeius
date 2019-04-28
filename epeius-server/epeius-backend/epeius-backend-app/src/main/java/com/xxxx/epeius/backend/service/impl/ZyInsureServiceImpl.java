package com.xxxx.epeius.backend.service.impl;

import com.xxxx.epeius.backend.service.AbstractInsureService;
import com.xxxx.epeius.common.template.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Description: 承保示例 -2
 * Author: lishangmin
 * Created: 2019-04-28 13:14
 */
@Component("zyIInsureService")
@Slf4j
public class ZyInsureServiceImpl extends AbstractInsureService {
	@Override
	public Result insure() {
		log.info("中意 承保");
		return Result.success();
	}
}
