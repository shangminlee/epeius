package com.xxxx.epeius.swagger.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Description: Swagger文档配置属性
 * Author: lishangmin
 * Created: 2019-04-12 14:46
 */
@ConfigurationProperties
@Data
public class EpeiusSwaggerProperties {

	@Value("${swagger.show:false}")
	private boolean show;

	@Value("${swagger.info.title:}")
	private String title;

	@Value("${swagger.info.contact.name:}")
	private String contactName;

	@Value("${swagger.info.contact.url:}")
	private String contactUrl;

	@Value("${swagger.info.contact.email:}")
	private String contactEmail;

	@Value("${swagger.scan-package:}")
	private String scanPackage;

}
