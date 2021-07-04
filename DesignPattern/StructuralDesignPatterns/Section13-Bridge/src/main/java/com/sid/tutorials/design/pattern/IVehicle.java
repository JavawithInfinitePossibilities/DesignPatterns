/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
public abstract class IVehicle {
	protected IWorkshop producer;
	protected IWorkshop assembler;

	public abstract void manufacture();
}
