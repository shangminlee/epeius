package com.xxxx.epeius.admin.service;

import com.xxxx.epeius.admin.model.User;

/**
 * Description: 用户服务层
 * Author: lishangmin
 * Created: 2019-04-18 14:28
 */
public interface IUserService {

	/**
	 * 根据用户ID查找用户
	 * @param userId 用户ID
	 * @return User 用户
	 */
	User findUserById(String userId);

}
