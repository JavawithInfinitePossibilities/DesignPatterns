/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section16Facade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IHotelKeeper keeper = new HotelKeeper();
		keeper.order();
	}

}
