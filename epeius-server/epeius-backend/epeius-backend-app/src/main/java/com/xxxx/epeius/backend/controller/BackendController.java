package com.xxxx.epeius.backend.controller;

import com.xxxx.epeius.backend.service.ICacheService;
import com.xxxx.epeius.backend.service.IUserService;
import com.xxxx.epeius.backend.struct.UserModel;
import com.xxxx.epeius.common.template.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: 示例-3 控制层
 * Author: lishangmin
 * Created: 2019-03-25 22:44
 */
@RestController
@RequestMapping(value = "/backend")
@Slf4j
public class BackendController {

	@Resource
	private IUserService iUserService;

	@Resource
	private ICacheService redisCacheServiceImpl;

	@GetMapping("/user/{userId}")
	public Result<UserModel> getUser(@PathVariable("userId") String userId){
		log.debug("userId:{}",userId);
		redisCacheServiceImpl.get("kkk");
		return Result.success(iUserService.get(userId));
	}

}