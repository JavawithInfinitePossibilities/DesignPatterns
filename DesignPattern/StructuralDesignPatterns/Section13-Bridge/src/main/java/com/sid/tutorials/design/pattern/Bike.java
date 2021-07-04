/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Bike extends IVehicle {

	public Bike(IWorkshop producer, IWorkshop assembler) {
		super(producer, assembler);
	}

	@Override
	public void manufacture() {
		System.out.println("Bike manufacture...");
		this.producer.work();
		this.assembler.work();
	}

}
