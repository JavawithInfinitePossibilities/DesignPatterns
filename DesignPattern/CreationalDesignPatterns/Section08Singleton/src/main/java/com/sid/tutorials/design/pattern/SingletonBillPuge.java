/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Lenovo
 *
 */
@ToString
public class SingletonBillPuge {

	@Getter
	@Setter
	private int date;

	private SingletonBillPuge() {

	}

	private static class SingletonHelper {
		private static SingletonBillPuge singletonBillPuge = new SingletonBillPuge();
	}

	public static SingletonBillPuge getInstance() {
		return SingletonHelper.singletonBillPuge;
	}
}
