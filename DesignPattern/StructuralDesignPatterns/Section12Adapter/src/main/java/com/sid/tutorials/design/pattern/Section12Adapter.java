/**
 * 
 */
package com.sid.tutorials.design.pattern;

import com.sid.tutorials.design.pattern.adaptor.ACAdaptor;
import com.sid.tutorials.design.pattern.adaptor.Calculater;
import com.sid.tutorials.design.pattern.adaptor.CalculatorAdaptor;
import com.sid.tutorials.design.pattern.adaptor.Circle;
import com.sid.tutorials.design.pattern.adaptor.IBritishWellOutlet;
import com.sid.tutorials.design.pattern.adaptor.IUSAPlugInSocket;
import com.sid.tutorials.design.pattern.adaptor.Plugin;
import com.sid.tutorials.design.pattern.adaptor.Rectangle;
import com.sid.tutorials.design.pattern.adaptor.WellOutlet;

/**
 * @author Lenovo
 *
 */
public class Section12Adapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBritishWellOutlet britishWellOutlet = new WellOutlet();
		britishWellOutlet.plugIntoBritishWellOutlet("British");

		IUSAPlugInSocket plugInSocket = new Plugin();
		plugInSocket.plugIntoUSAOutlet("USA");

		ACAdaptor adaptor = new ACAdaptor(britishWellOutlet, plugInSocket);
		adaptor.outletSocket("USA", "British");

		Calculater calculater = new Calculater();
		Rectangle rectangle = new Rectangle(2, 5);
		calculater.calculate(rectangle, "Rectangl");

		Circle circle = new Circle(5);
		CalculatorAdaptor calculatorAdaptor = new CalculatorAdaptor(circle, calculater);
		calculatorAdaptor.getCalculateCircleArea("Circle");
	}

}
