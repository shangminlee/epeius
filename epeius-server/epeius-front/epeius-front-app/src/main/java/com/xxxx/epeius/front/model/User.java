package com.xxxx.epeius.front.model;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 数据库映射实体
 * Author: lishangmin
 * Created: 2019-04-12 14:19
 */
@Data
@Builder
public class User {

	// 用户名
	private String username;

	// 密码
	private String password;

}
