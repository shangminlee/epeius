package com.xxxx.epeius.front.struct;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * Description: 用户查询条件，优雅的校验
 * Author: lishangmin
 * Created: 2019-04-12 14:30
 */
@Data
public class UserQueryCondition {

	@NotEmpty(message = "用户名不能为空")
	private String username;

}
