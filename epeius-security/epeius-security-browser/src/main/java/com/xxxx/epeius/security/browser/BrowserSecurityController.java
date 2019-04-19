package com.xxxx.epeius.security.browser;

import com.xxxx.epeius.common.template.Result;
import com.xxxx.epeius.security.core.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: 自定义授权控制层
 * Author: lishangmin
 * Created: 2019-04-18 01:43
 */
@RestController
@Slf4j
public class BrowserSecurityController {

	@Resource
	private SecurityProperties securityProperties;

	private RequestCache requestCache =  new HttpSessionRequestCache();

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@RequestMapping("/authentication/require")
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	public Result requireAuthentication(HttpServletRequest request , HttpServletResponse response) throws IOException {

		SavedRequest savedRequest = requestCache.getRequest(request,response);

		if(savedRequest != null){
			String targetUrl = savedRequest.getRedirectUrl();
			log.info("引发跳转的请求：{}",targetUrl);
			if(StringUtils.endsWithIgnoreCase(targetUrl,".html")){
				redirectStrategy.sendRedirect(request,response,securityProperties.getBrowser().getLoginPage());
			}
		}
		return Result.error("访问的服务需要身份认证");
	}
}
