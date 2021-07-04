/**
 * 
 */
package com.sid.tutorials.design.pattern;

import com.sid.tutorials.design.pattern.abstructCreator.Picture;
import com.sid.tutorials.design.pattern.factorymethod.AbstractFactoryMethod;
import com.sid.tutorials.design.pattern.factorymethod.ColorEnum;
import com.sid.tutorials.design.pattern.factorymethod.ShapeEnum;

/**
 * @author Lenovo
 *
 */
public class Section07AbstractFactoryMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactoryMethod method = new AbstractFactoryMethod();
		Picture picture = method.getPicture(ShapeEnum.CIRCLE, ColorEnum.BLUE);
		picture.getPicture();
	}

}
