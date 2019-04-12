package com.xxxx.epeius.swagger.annotation;

import com.xxxx.epeius.swagger.config.EpeiusSwaggerConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description: 是否嵌入Swagger
 * Author: lishangmin
 * Created: 2019-04-12 14:44
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE })
@Import({EpeiusSwaggerConfiguration.class})
public @interface EnableEpeiusSwagger {

}
