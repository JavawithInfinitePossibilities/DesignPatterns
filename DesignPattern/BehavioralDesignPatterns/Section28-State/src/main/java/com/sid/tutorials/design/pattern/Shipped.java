/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Shipped implements IPackageState {
	private static Shipped instance = new Shipped();

	private Shipped() {
	}

	public static Shipped instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is shipped !!");
		ctx.setCurrentState(InTransition.instance());
	}
}
