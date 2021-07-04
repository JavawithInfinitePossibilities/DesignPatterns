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
public class Assembler implements IWorkshop {

	@Override
	public void work() {
		System.out.println("Assembling the component...");
	}

}
