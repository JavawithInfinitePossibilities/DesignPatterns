/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class CircleShape extends IShape {

	public CircleShape() {
		this.setType("Circle");
	}

	@Override
	public void drowShape() {
		System.out.println("Drowing a circle shape...");
	}

}
