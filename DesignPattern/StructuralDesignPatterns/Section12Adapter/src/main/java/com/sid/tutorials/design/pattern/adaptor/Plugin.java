/**
 * 
 */
package com.sid.tutorials.design.pattern.adaptor;

/**
 * @author Lenovo
 *
 */
public class Plugin implements IUSAPlugInSocket {

	@Override
	public void plugIntoUSAOutlet(String value) {
		System.out.println("Plug in..." + value);
	}

}
