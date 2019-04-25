package com.xxxx.epeius.admin.service.impl;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description: 实现SpringSecurity的UserDetail
 * Author: lishangmin
 * Created: 2019-04-24 17:38
 */
@Component
public class AdminUserDetailsService implements UserDetailsService {


	@Resource
	private PasswordEncoder passwordEncoder;

	/**
	 * 在这里构建用户信息
	 * @param username 用户名
	 * @return 用户信息
	 * @throws UsernameNotFoundException 抛出找不到用户异常
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username,passwordEncoder.encode("123456"), AuthorityUtils.commaSeparatedStringToAuthorityList("admin,ROLE_USER"));
	}

}
