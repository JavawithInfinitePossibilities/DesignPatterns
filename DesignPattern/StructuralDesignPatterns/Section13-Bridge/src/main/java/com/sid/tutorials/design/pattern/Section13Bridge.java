/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section13Bridge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IWorkshop producer = Producer.builder().build();
		IWorkshop assembler = Assembler.builder().build();

		IVehicle bike = new Bike(producer, assembler);
		bike.manufacture();
		System.out.println("\n");
		IVehicle car = new Car(producer, assembler);
		car.manufacture();
	}

}
