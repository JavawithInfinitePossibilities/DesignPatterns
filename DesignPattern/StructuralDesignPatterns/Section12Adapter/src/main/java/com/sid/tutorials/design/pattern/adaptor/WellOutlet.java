/**
 * 
 */
package com.sid.tutorials.design.pattern.adaptor;

/**
 * @author Lenovo
 *
 */
public class WellOutlet implements IBritishWellOutlet {

	@Override
	public void plugIntoBritishWellOutlet(String value) {
		System.out.println("Plug into well outlet..." + value);
	}

}
