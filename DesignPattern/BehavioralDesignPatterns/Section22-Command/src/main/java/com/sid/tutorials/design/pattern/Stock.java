/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Stock {
	private boolean on;

	public void buyStock() {
		System.out.println("Buy");
		on = true;
	}

	public void sellStock() {
		System.out.println("Sell");
		on = false;
	}
}
