/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class Section29Strategy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter mode of Transportation Type : 'Bus' or 'Taxi' or 'Auto' ");
		Scanner scanner = new Scanner(System.in);
		String transportationType = scanner.next();
		System.out.println("Transportation type is : " + transportationType);

		Travel travel = new Travel();

		switch (transportationType) {
		case "Bus":
			travel.setTravelToRailwayStation(new TravelByBus());
			break;
		case "Taxi":
			travel.setTravelToRailwayStation(new TravelByTaxi());
			break;
		case "Auto":
			travel.setTravelToRailwayStation(new TravelByAuto());
			break;
		default:
			break;
		}

		System.out.println("Mode of Transportation has : " + travel.getTravelToRailwayStation());
		travel.gotoRailwayStation();

	}

}
