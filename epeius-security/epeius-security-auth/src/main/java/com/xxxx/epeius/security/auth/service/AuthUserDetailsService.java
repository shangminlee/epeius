package com.xxxx.epeius.security.auth.service;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description: 获取用户
 * Author: lishangmin
 * Created: 2019-04-28 09:46
 */
@Component
public class AuthUserDetailsService implements UserDetailsService {

	@Resource
	private PasswordEncoder passwordEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username, passwordEncoder.encode("123456"),
				AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
	}

}
