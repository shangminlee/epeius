package com.xxxx.epeius.front.controller;

import com.xxxx.epeius.front.entity.User;
import com.xxxx.epeius.front.struct.UserQueryCondition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

	// 用户列表
	@GetMapping(value = "/user")
	public List<User> query(@Valid UserQueryCondition condition, @PageableDefault Pageable pageable){

		return Arrays.asList(
				User.builder().userName("a").password("123").build(),
				User.builder().userName("b").password("123").build()
		);

	}

	// 创建用户
	@PostMapping(value = "/user")
	public void create(@RequestBody User user){

	}

	// 更新用户
	@PutMapping(value = "/user/{userId}")
	public void update(@PathVariable("userId")String userId , @RequestBody User user){

	}

	// 获取用户
	@GetMapping(value = "/user/{userId}")
	public User getInfo(@PathVariable("userId") String userId){

		return User.builder().userName("a").password("123").build();
	}

	// 删除用户
	@DeleteMapping(value = "/user/{userId}")
	public void delete(@PathVariable("userId") String userId){

	}
}
