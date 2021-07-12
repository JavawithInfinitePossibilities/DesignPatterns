/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section28State {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeliveryContext ctx = new DeliveryContext(null, "Test123");

		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
		ctx.update();
	}

}
