package com.xxxx.epeius.backend.service;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-28 17:45
 */
public class Son extends Father  {

	@Override
	protected void doSomething() {
		System.out.println("Son do something");
		super.doSomething();
	}
}
