/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Acknowledged implements IPackageState {
	private static Acknowledged instance = new Acknowledged();

	private Acknowledged() {
	}

	public static Acknowledged instance() {
		return instance;
	}

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is acknowledged !!");
		ctx.setCurrentState(Shipped.instance());
	}
}
