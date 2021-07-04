/**
 * 
 */
package com.sid.tutorials.design.pattern.adaptor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
public class CalculatorAdaptor {
	private Circle circle;
	private Calculater calculater;

	public void getCalculateCircleArea(String value) {
		this.calculater.calculate(new Rectangle(circle.getRedious(), 1), value);
	}
}
