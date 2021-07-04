/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class SqureShape extends IShape {

	public SqureShape() {
		this.setType("Square");
	}

	@Override
	public void drowShape() {
		System.out.println("Drowing Squre shape...");
	}

}
