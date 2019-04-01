package com.xxxx.epeius.front.service.impl;

import com.xxxx.epeius.backend.struct.UserModel;
import com.xxxx.epeius.common.template.Result;
import com.xxxx.epeius.front.service.IBackendService;

/**
 * Description: 熔断Fallback 示例
 * Author: lishangmin
 * Created: 2019-03-26 17:41
 */
public class BackendServiceFallback implements IBackendService {

	@Override
	public Result<UserModel> getUser(String userId) {
		throw new RuntimeException("obtaining user information error");
	}

}
