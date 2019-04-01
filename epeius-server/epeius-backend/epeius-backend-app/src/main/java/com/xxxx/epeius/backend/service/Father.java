package com.xxxx.epeius.backend.service;

import java.util.Collection;
import java.util.Map;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-28 17:44
 */
public class Father {

	protected void doSomething(){
		System.out.println("Father do some thing");
		this.doSomething();
	}

	public static void main(String[] args) {
		Father father = new Son();
		father.doSomething();
		Collection collection ;
		Map map;
	}
}
