package com.xxxx.epeius.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description: Spring Security 公用配置
 * Author: lishangmin
 * Created: 2019-04-18 10:10
 */
@Data
@ConfigurationProperties(prefix = "epeius.security")
public class SecurityProperties {

	private BrowserProperties browser = new BrowserProperties();

}
