/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.IShape;

/**
 * @author Lenovo
 *
 */
public abstract class AbstractShapeFactoryMethod {
	protected abstract IShape factoryMethod();

	public IShape getShape() {
		return factoryMethod();
	}
}
