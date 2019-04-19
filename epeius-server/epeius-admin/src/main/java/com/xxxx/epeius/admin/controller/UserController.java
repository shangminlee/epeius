package com.xxxx.epeius.admin.controller;

import com.xxxx.epeius.admin.model.User;
import com.xxxx.epeius.admin.service.IUserService;
import com.xxxx.epeius.admin.struct.UserView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Description: 用户控制层
 * Author: lishangmin
 * Created: 2019-04-18 14:22
 */
@RestController
@Slf4j
public class UserController {

	@Resource
	private IUserService userService;

	@GetMapping(value = "/user/{userId}")
	public UserView getCurrentUser(@PathVariable("userId") String userId){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		log.info("用户登录ID:{}",userId);
		User user = userService.findUserById(userId);
		return UserView.builder().userName(authentication.getName()).build();
	}

}
