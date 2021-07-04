/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.BlueColor;
import com.sid.tutorials.design.pattern.abstructCreator.GreenColor;
import com.sid.tutorials.design.pattern.abstructCreator.IColor;
import com.sid.tutorials.design.pattern.abstructCreator.RedColor;

/**
 * @author Lenovo
 *
 */
public class ColorFactoryMethod {

	public IColor getColor(ColorEnum ce) {
		IColor color = null;
		switch (ce) {
		case RED:
			color = new RedColor();
			break;
		case GREEN:
			color = new GreenColor();
			break;
		case BLUE:
			color = new BlueColor();
			break;
		default:
			break;
		}
		return color;
	}
}
