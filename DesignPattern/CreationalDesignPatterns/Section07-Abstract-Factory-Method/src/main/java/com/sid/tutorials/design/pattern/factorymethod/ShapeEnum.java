/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

/**
 * @author Lenovo
 *
 */
public enum ShapeEnum {
	RECTANGULAR(1), SQUARE(2), CIRCLE(3);

	private int index;

	private ShapeEnum(int index) {
		this.index = index;
		//System.out.println("Index value :" + this.index);
	}
}
