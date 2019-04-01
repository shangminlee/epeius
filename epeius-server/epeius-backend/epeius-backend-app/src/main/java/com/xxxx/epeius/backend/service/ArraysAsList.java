package com.xxxx.epeius.backend.service;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * Author: lishangmin
 * Created: 2019-03-29 15:07
 */
public class ArraysAsList {

	public static void main(String[] args) {
		String[] stringsArray = new String[3];
		stringsArray[0] = "one";
		stringsArray[1] = "two";
		stringsArray[2] = "three";

		List<String> stringList = Arrays.asList(stringsArray);
		stringList.set(0,"oneList");

		System.out.println(stringsArray[0]);

		stringList.add("four");
	}
}
