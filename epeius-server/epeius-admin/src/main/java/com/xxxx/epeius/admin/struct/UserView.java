package com.xxxx.epeius.admin.struct;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 用户视图
 * Author: lishangmin
 * Created: 2019-04-18 14:22
 */
@Data
@Builder
public class UserView {

	private String userName;

	private String password;

}
