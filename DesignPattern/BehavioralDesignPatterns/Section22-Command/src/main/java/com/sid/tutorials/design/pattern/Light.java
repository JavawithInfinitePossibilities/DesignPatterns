/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Light {
	private boolean on;

	public void switchOn() {
		System.out.println("On");
		on = true;
	}

	public void switchOff() {
		System.out.println("Off");
		on = false;
	}
}
