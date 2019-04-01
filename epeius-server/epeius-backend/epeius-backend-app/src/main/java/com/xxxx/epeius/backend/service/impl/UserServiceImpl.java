package com.xxxx.epeius.backend.service.impl;

import com.xxxx.epeius.backend.service.IUserService;
import com.xxxx.epeius.backend.struct.UserModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-26 16:09
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService {

	@Override
	public UserModel get(String userId) {
		log.debug("userId:{}",userId);
		return UserModel.builder().name("JackMa").role("CEO").build();
	}

}
