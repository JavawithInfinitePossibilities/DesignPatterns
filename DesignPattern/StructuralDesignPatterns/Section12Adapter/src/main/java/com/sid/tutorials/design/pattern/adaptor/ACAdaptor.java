/**
 * 
 */
package com.sid.tutorials.design.pattern.adaptor;

import lombok.AllArgsConstructor;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
public class ACAdaptor {
	private IBritishWellOutlet outlet;
	private IUSAPlugInSocket socket;

	public void outletSocket(String plugin, String outlet) {
		this.socket.plugIntoUSAOutlet(outlet);
		this.outlet.plugIntoBritishWellOutlet(plugin);
	}
}
