/**
 * 
 */
package com.sid.tutorials.design.pattern;

import com.sid.tutorials.design.pattern.abstructCreator.IAnimal;
import com.sid.tutorials.design.pattern.abstructCreator.IShape;
import com.sid.tutorials.design.pattern.factorymethod.AnimalEnum;
import com.sid.tutorials.design.pattern.factorymethod.CircleFactoryMethod;
import com.sid.tutorials.design.pattern.factorymethod.RectangularFactoryMethod;
import com.sid.tutorials.design.pattern.factorymethod.ShapeEnum;
import com.sid.tutorials.design.pattern.factorymethod.ShapeFactoryMethod;
import com.sid.tutorials.design.pattern.factorymethod.SqureFactoryMethod;
import com.sid.tutorials.design.pattern.factorymethod.StaticAnimalFactory;

/**
 * @author Lenovo
 *
 */
public class Section06FactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IShape rectangularShape = new RectangularFactoryMethod().getShape();
		rectangularShape.drowShape();
		IShape squreShape = new SqureFactoryMethod().getShape();
		squreShape.drowShape();
		IShape circleShape = new CircleFactoryMethod().getShape();
		circleShape.drowShape();

		IShape shape = new ShapeFactoryMethod().getShape(ShapeEnum.SQUARE);
		shape.drowShape();

		IAnimal animal = StaticAnimalFactory.getAnimal(AnimalEnum.LION);
		animal.getCharacter();
	}

}
