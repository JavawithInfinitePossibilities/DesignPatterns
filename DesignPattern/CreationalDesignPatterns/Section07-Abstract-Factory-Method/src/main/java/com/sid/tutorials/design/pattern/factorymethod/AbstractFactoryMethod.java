/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.IColor;
import com.sid.tutorials.design.pattern.abstructCreator.IShape;
import com.sid.tutorials.design.pattern.abstructCreator.Picture;

/**
 * @author Lenovo
 *
 */
public class AbstractFactoryMethod {

	public Picture getPicture(ShapeEnum se, ColorEnum ce) {
		ShapeFactoryMethod shapeFactoryMethod = new ShapeFactoryMethod();
		IShape shape = shapeFactoryMethod.getShape(se);
		ColorFactoryMethod colorFactoryMethod = new ColorFactoryMethod();
		IColor color = colorFactoryMethod.getColor(ce);
		return Picture.builder().shape(shape).color(color).build();
	}
}
