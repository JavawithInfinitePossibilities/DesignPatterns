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
public class SingletonSynchronizetion {

	private static SingletonSynchronizetion uniqueInstance;
	@Getter
	@Setter
	private int data;

	private SingletonSynchronizetion() {

	}

	public static SingletonSynchronizetion getInstance() {
		if (uniqueInstance == null) {
			synchronized (SingletonSynchronizetion.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new SingletonSynchronizetion();
				}
			}
		}
		return uniqueInstance;
	}
}
