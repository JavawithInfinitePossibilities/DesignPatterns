/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

/**
 * @author Lenovo
 *
 */
public enum ColorEnum {
	RED(1), GREEN(2), BLUE(3);

	private int index;

	private ColorEnum(int index) {
		this.index = index;
	}
}
