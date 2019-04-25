package com.xxxx.epeius.admin.view;

import lombok.Builder;
import lombok.Data;

/**
 * Description: 用户视图层
 * Author: lishangmin
 * Created: 2019-04-24 16:52
 */
@Data
@Builder
public class UserView {

	private String username;

	private String mobile;

}
