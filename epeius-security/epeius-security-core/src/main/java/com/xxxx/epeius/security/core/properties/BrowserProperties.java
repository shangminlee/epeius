package com.xxxx.epeius.security.core.properties;

import lombok.Data;

/**
 * Description: 浏览器端属性配置
 * Author: lishangmin
 * Created: 2019-04-18 10:15
 */
@Data
public class BrowserProperties {

	// 用户登录页面
	private String loginPage = "/epeius-login.html";

	// 登录响应的方式，默认是json
	private LoginResponseType loginResponseType = LoginResponseType.JSON;

}
