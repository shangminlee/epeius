package com.xxxx.epeius.security.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

import javax.annotation.Resource;

/**
 * Description: Oauth2 配置
 * Author: lishangmin
 * Created: 2019-04-28 09:50
 */
@SpringBootConfiguration
public class EpeiusOauth2Config extends AuthorizationServerConfigurerAdapter {

	@Resource
	private PasswordEncoder passwordEncoder;

	// 密码模式
	@Resource
	private AuthenticationManager authenticationManager;

	// refresh_token 必须
	@Resource
	private UserDetailsService userDetailsService;

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()

				.withClient("sampleClientId")
				.authorizedGrantTypes("implicit")
				.scopes("read")
				.autoApprove(true)
				.and()

				.withClient("epeius")
				.secret(passwordEncoder.encode("epeiusSecret"))
				.authorizedGrantTypes("password","authorization_code", "refresh_token")
				.scopes("all")
				.redirectUris("http://127.0.0.1:8080/client1/login","http://127.0.0.1:8090/client2/login")
				.accessTokenValiditySeconds(600)
				.refreshTokenValiditySeconds(800)
				//.autoApprove(true)
				.and()

				.withClient("epeius1")
				.secret(passwordEncoder.encode("epeiusSecret"))
				.authorizedGrantTypes("password","authorization_code", "refresh_token")
				.scopes("all")
				.redirectUris("http://127.0.0.1:8080/client1/login","http://127.0.0.1:8090/client2/login")
				.accessTokenValiditySeconds(600)
				.refreshTokenValiditySeconds(800)
				//.autoApprove(true)
		;
	}

	@Resource
	private TokenStore tokenStore;

	@Autowired(required = false)
	private JwtAccessTokenConverter jwtAccessTokenConverter;

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
				.tokenStore(tokenStore) // Token存储模式
				.authenticationManager(authenticationManager) // 密码模式
				.userDetailsService(userDetailsService) // Token刷新模式
		;

		if(jwtAccessTokenConverter != null){
			endpoints.accessTokenConverter(jwtAccessTokenConverter); // JWTToken模式
		}
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		security
				.tokenKeyAccess("isAuthenticated()")
				.checkTokenAccess("permitAll()");
	}

}
