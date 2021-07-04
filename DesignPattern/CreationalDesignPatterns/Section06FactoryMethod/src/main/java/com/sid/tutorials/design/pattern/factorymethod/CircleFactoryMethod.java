/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.CircleShape;
import com.sid.tutorials.design.pattern.abstructCreator.IShape;

/**
 * @author Lenovo
 *
 */
public class CircleFactoryMethod extends AbstractShapeFactoryMethod {

	@Override
	protected IShape factoryMethod() {
		/**
		 * If we try to return the method reference object then it will contain the
		 * method reference. Not the actual object.
		 */
		/* return CircleShape::new; */
		return new CircleShape();
	}

}
