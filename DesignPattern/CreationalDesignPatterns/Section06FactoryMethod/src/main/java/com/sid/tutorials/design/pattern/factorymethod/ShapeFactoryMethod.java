/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.CircleShape;
import com.sid.tutorials.design.pattern.abstructCreator.RectangularShap;
import com.sid.tutorials.design.pattern.abstructCreator.IShape;
import com.sid.tutorials.design.pattern.abstructCreator.SqureShape;

/**
 * @author Lenovo
 *
 */
public class ShapeFactoryMethod {

	public IShape getShape(ShapeEnum se) {
		IShape shape = null;
		switch (se) {
		case RECTANGULAR:
			shape = new RectangularShap();
			break;
		case SQUARE:
			shape = new SqureShape();
			break;
		case CIRCLE:
			shape = new CircleShape();
			break;
		default:
			break;
		}
		return shape;
	}
}
