/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Setter;

/**
 * @author Lenovo
 *
 */

public abstract class AbstractDecorator extends IComponent {

	@Setter
	protected IComponent component;

	@Override
	public void doJob() {
		System.out.println("This is abstract decorator...");
		if (component != null) {
			component.doJob();
		}
	}

}
