package com.xxxx.epeius.admin.service.impl;

import com.xxxx.epeius.security.core.authentication.DefaultUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description: 自定义用户读取,实际开发都要从
 * Author: lishangmin
 * Created: 2019-04-18 00:42
 */
@Component
@Slf4j
public class AdminUserDetailsService extends DefaultUserDetailsService {

	@Resource
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("登录用户名：{}",username);
		return new User(username,passwordEncoder.encode("123456"), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}

}
