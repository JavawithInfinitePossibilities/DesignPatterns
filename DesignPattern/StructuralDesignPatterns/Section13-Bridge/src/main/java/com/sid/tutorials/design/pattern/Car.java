/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Car extends IVehicle {

	public Car(IWorkshop producer, IWorkshop assembler) {
		super(producer, assembler);
	}

	@Override
	public void manufacture() {
		System.out.println("Car manufacture...");
		this.producer.work();
		this.assembler.work();
	}

}
