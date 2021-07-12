/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class Section23Interpreter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please select the Date Format: 'MM-DD-YYYY' or 'YYYY-MM-DD' or 'DD-MM-YYYY' ");
		Scanner scanner = new Scanner(System.in);
		String inputDate = scanner.next();

		Format format = new Format();
		format.setFormat(inputDate);
		format.setDate(new Date());

		ArrayList<IAbstractFormat> formatOrderList = getFormatOrder(format);

		System.out.println("Input : " + format.getFormat() + " : " + new Date());

		for (IAbstractFormat abstractFormat : formatOrderList) {
			abstractFormat.execute(format);
			System.out.println(abstractFormat.getClass().getName() + "  Executed: " + format.getFormat());

		}

		System.out.println("Output : " + format.getFormat());
	}

	private static ArrayList getFormatOrder(Format format) {
		ArrayList<IAbstractFormat> formatOrderList = new ArrayList<IAbstractFormat>();
		String[] strArray = format.getFormat().split("-");
		for (String date : strArray) {
			switch (date) {
			case "MM":
				formatOrderList.add(new MonthFormat());
				break;
			case "DD":
				formatOrderList.add(new DayFormat());
				break;
			default:
				formatOrderList.add(new YearFormat());
				break;
			}
		}
		return formatOrderList;
	}
}
