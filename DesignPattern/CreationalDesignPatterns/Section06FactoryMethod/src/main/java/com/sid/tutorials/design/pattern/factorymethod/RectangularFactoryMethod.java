/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.RectangularShap;
import com.sid.tutorials.design.pattern.abstructCreator.IShape;

/**
 * @author Lenovo
 *
 */
public class RectangularFactoryMethod extends AbstractShapeFactoryMethod {

	@Override
	protected IShape factoryMethod() {
		return new RectangularShap();
	}

}
