package com.xxxx.epeius.backend.struct;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Description: 用户信息
 * Author: lishangmin
 * Created: 2019-03-26 14:06
 */
@Data
@Builder
public class UserModel implements Serializable {

	private String name;

	private String role;

	public UserModel() {
	}

	public UserModel(String name, String role) {
		this.name = name;
		this.role = role;
	}
}
