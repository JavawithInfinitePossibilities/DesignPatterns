/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class HotelKeeper implements IHotelKeeper {

	private IHotel vegHotal;
	private IHotel nonVegHotal;

	@Override
	public void order() {
		System.out.println("Please select your preference from below...");
		System.out.println("1. vegitarian...");
		System.out.println("2. non vegitarian...");
		System.out.println("Please select your choice...");
		Scanner scanner = new Scanner(System.in);
		int selectHotal = scanner.nextInt();
		switch (selectHotal) {
		case 1:
			vegHotal = new VegHotel();
			vegHotal.manu();
			break;
		case 2:
			nonVegHotal = new NonVegitarian();
			nonVegHotal.manu();
			break;
		default:
			break;
		}
	}

}
