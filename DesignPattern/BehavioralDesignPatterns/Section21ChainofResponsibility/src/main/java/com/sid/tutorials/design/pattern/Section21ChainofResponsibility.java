/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class Section21ChainofResponsibility {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ATMDispansery atmDispansery = ATMDispansery.builder().build();
		while (true) {
			System.out.println("Please enter the amount");
			Scanner scanner = new Scanner(System.in);
			int amount = scanner.nextInt();
			atmDispansery.moneyDispansery(amount);
		}
	}

}
