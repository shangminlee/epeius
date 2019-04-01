package com.xxxx.epeius.front.struct;

import lombok.Builder;
import lombok.Data;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-26 16:34
 */
@Data
@Builder
public class AccountModel {

	private String userId;

	private String name;

	private String role;

	public AccountModel() {
	}

	public AccountModel(String userId, String name, String role) {
		this.userId = userId;
		this.name = name;
		this.role = role;
	}
}
