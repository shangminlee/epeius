package com.xxxx.epeius.front.entity;

import com.xxxx.epeius.front.enums.UserSexEnum;
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

	private Long id;

	private String userName;

	private String password;

	private UserSexEnum userSex;

	private String nickName;

	public User() {
	}

	public User(Long id, String userName, String password, UserSexEnum userSex, String nickName) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userSex = userSex;
		this.nickName = nickName;
	}

	public User(String userName, String password, UserSexEnum userSex, String nickName) {
		this.userName = userName;
		this.password = password;
		this.userSex = userSex;
		this.nickName = nickName;
	}
}
