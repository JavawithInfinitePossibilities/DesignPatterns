/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.IShape;
import com.sid.tutorials.design.pattern.abstructCreator.SqureShape;

/**
 * @author Lenovo
 *
 */
public class SqureFactoryMethod extends AbstractShapeFactoryMethod {

	@Override
	protected IShape factoryMethod() {
		return new SqureShape();
	}

}
