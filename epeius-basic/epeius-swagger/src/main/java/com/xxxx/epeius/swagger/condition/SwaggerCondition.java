package com.xxxx.epeius.swagger.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Description: 扫描包为空的时候，拒绝创建Bean
 * Author: lishangmin
 * Created: 2019-04-12 16:49
 */
public class SwaggerCondition implements Condition {

	@Override
	public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
		return Boolean.parseBoolean(conditionContext.getEnvironment().getProperty("swagger.show"));
	}

}