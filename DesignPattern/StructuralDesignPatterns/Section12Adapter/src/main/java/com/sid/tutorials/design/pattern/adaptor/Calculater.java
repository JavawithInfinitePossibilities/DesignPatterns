/**
 * 
 */
package com.sid.tutorials.design.pattern.adaptor;

/**
 * @author Lenovo
 *
 */
public class Calculater {

	public void calculate(Rectangle rectangle, String value) {
		int area = rectangle.getWidth() * rectangle.getLength();
		System.out.println("Area is :" + area + " for " + value);
	}
}
