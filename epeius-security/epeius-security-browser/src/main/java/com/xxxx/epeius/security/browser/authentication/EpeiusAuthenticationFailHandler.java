package com.xxxx.epeius.security.browser.authentication;

import com.alibaba.fastjson.JSON;
import com.xxxx.epeius.security.core.properties.LoginResponseType;
import com.xxxx.epeius.security.core.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * Description: 登录失败处理页面
 * Author: lishangmin
 * Created: 2019-04-18 15:06
 */
@Component
@Slf4j
public class EpeiusAuthenticationFailHandler extends SimpleUrlAuthenticationFailureHandler {

	@Resource
	private SecurityProperties securityProperties;

	/**
	 * Called when an authentication attempt fails.
	 *
	 * @param request   the request during which the authentication attempt occurred.
	 * @param response  the response.
	 * @param exception the exception which was thrown to reject the authentication
	 */
	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
		log.info("登录失败");
		if (Objects.equals(securityProperties.getBrowser().getLoginResponseType(), LoginResponseType.JSON)) {
			response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
			response.getWriter().write(JSON.toJSONString(exception));
		}else {
			super.onAuthenticationFailure(request, response, exception);
		}
	}
}
