package com.xxxx.epeius.admin.service.impl;

import com.xxxx.epeius.admin.model.User;
import com.xxxx.epeius.admin.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * Description: 用户服务实现
 * Author: lishangmin
 * Created: 2019-04-18 14:31
 */
@Component
public class UserServiceImpl implements IUserService {

	/**
	 * 根据用户ID查找用户
	 *
	 * @param userId 用户ID
	 * @return User 用户
	 */
	@Override
	public User findUserById(String userId) {
		return User.builder().nickName("Tony").build();
	}

}
