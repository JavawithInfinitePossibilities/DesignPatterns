/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section15Decorator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		ConcreteDecorator concreteDecorator = new ConcreteDecorator();

		concreteDecorator.setComponent(component);
		concreteDecorator.doJob();
	}

}
