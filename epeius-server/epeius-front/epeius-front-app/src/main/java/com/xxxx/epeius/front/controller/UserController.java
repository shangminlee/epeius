package com.xxxx.epeius.front.controller;

import com.xxxx.epeius.common.template.Result;
import com.xxxx.epeius.front.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Description: 用户模块测试
 * Author: lishangmin
 * Created: 2019-04-12 13:48
 */
@RestController
@Slf4j
public class UserController {

	@GetMapping(value = "/user")
	public Result<List<User>> query(){
		return Result.success(Arrays.asList(
				User.builder().username("a").password("123").build(),
				User.builder().username("b").password("123").build()
		));
	}

	public Result register(){
		return Result.success();
	}

	public Result getCurrentUser(){
		return Result.success();
	}

	@PostMapping(value = "/user")
	public Result create(@RequestBody User user){
		return Result.success();
	}

	public Result update(){
		return Result.success();
	}

	public Result getInfo(){
		return Result.success();
	}

	public Result delete(){
		return Result.success();
	}
}
