package com.xxxx.epeius.security.browser.authentication;

import com.alibaba.fastjson.JSON;
import com.xxxx.epeius.security.core.properties.LoginResponseType;
import com.xxxx.epeius.security.core.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * Description: 返回成功处理
 * Author: lishangmin
 * Created: 2019-04-18 14:52
 */
@Component
@Slf4j
public class EpeiusAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

	@Resource
	private SecurityProperties securityProperties;
	/**
	 * Called when a user has been successfully authenticated.
	 *
	 * @param request        the request which caused the successful authentication
	 * @param response       the response
	 * @param authentication the <tt>Authentication</tt> object which was created during
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		log.info("登录成功");

		if (Objects.equals(securityProperties.getBrowser().getLoginResponseType(), LoginResponseType.JSON)) {
			response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
			response.getWriter().write(JSON.toJSONString(authentication));
		}else {
			super.onAuthenticationSuccess(request, response, authentication);
		}
	}
}
