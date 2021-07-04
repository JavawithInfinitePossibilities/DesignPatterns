/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class RectangularShap extends IShape {

	public RectangularShap() {
		this.setType("Rectangular");
	}

	@Override
	public void drowShape() {
		System.out.println("Drowing a Rectangular...");
	}

}
