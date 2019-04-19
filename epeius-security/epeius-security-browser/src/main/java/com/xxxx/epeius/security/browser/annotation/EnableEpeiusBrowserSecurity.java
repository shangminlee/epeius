package com.xxxx.epeius.security.browser.annotation;

import com.xxxx.epeius.security.browser.BrowserSecurityConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 是否使用浏览器安全控制
 * Author: lishangmin
 * Created: 2019-04-18 10:20
 */

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE })
@Import({BrowserSecurityConfig.class})
public @interface EnableEpeiusBrowserSecurity {
}
