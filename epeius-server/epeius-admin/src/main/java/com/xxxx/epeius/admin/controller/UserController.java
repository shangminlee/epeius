package com.xxxx.epeius.admin.controller;

import com.xxxx.epeius.admin.view.UserView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 用户控制层
 * Author: lishangmin
 * Created: 2019-04-24 16:51
 */
@RestController
public class UserController {

	@GetMapping(value = "/me")
	public UserView getCurrentUser(){
		return UserView.builder().username("Tony").mobile("13521336846").build();
	}

}
