package com.xxxx.epeius.security.core.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Description: SpringSecurity 默认用户实现
 * Author: lishangmin
 * Created: 2019-04-18 10:11
 */
@Slf4j
public class DefaultUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("请配置 UserDetailsService 接口的实现.");
		throw new UsernameNotFoundException(username);
	}
}
