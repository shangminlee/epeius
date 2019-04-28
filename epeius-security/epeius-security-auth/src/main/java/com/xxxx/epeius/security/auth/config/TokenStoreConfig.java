package com.xxxx.epeius.security.auth.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.annotation.Resource;

/**
 * Description: Oauth token存储配置
 * Author: lishangmin
 * Created: 2019-04-28 09:48
 */
@SpringBootConfiguration
public class TokenStoreConfig {

	@Resource
	private RedisConnectionFactory redisConnectionFactory;

	@Bean
	@ConditionalOnProperty(prefix = "epeius.security.oauth2", name = "storeType", havingValue = "redis" )
	public TokenStore tokenStore(){
		return new RedisTokenStore(redisConnectionFactory);
	}

	@Configuration
	@ConditionalOnProperty(prefix = "epeius.security.oauth2", name = "storeType",havingValue = "jwt" ,matchIfMissing = true)
	public static class JwtTokenConfig{

		@Bean
		public TokenStore tokenStore(){
			return new JwtTokenStore(jwtAccessTokenConverter());
		}

		@Bean
		public JwtAccessTokenConverter jwtAccessTokenConverter(){
			JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
			jwtAccessTokenConverter.setSigningKey("epeius");
			return new JwtAccessTokenConverter();
		}
	}

}
