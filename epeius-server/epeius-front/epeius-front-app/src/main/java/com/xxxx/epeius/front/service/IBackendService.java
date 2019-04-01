package com.xxxx.epeius.front.service;

import com.xxxx.epeius.backend.struct.UserModel;
import com.xxxx.epeius.common.template.Result;
import com.xxxx.epeius.front.service.impl.BackendServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description: Feign 示例调用第三方服务
 * Author: lishangmin
 * Created: 2019-03-26 16:52
 */
@FeignClient(value = "${epeius.feign.backend-service}", fallback = BackendServiceFallback.class)
public interface IBackendService {

	@GetMapping("/backend/user/{userId}")
	Result<UserModel> getUser(@PathVariable("userId") String userId);

}
