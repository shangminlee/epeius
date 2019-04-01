package com.xxxx.epeius.backend.service;

import com.xxxx.epeius.backend.struct.UserModel;

/**
 * Description: 用户服务
 * Author: lishangmin
 * Created: 2019-03-26 16:06
 */
public interface IUserService {

	UserModel get(String userId);
}
