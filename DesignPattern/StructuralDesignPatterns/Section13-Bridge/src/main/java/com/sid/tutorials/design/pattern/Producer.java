/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Builder;

/**
 * @author Lenovo
 *
 */
@Builder
public class Producer implements IWorkshop {

	@Override
	public void work() {
		System.out.println("Producing components...");
	}

}
