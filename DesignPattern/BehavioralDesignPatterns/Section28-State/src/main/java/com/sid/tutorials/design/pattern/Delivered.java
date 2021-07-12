/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Delivered implements IPackageState {
	// Singleton
	private static Delivered instance = new Delivered();

	private Delivered() {
	}

	public static Delivered instance() {
        return instance;
    }

	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is delivered!!");
	}

}
