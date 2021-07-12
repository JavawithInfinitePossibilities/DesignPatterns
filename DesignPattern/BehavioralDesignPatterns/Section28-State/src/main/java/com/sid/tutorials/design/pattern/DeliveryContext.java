/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Data;

/**
 * @author Lenovo
 *
 */
@Data
public class DeliveryContext {
	private IPackageState currentState;
	private String packageId;

	public DeliveryContext(IPackageState currentState, String packageId) {
		super();
		this.currentState = currentState;
		this.packageId = packageId;

		if (currentState == null) {
			this.currentState = Acknowledged.instance();
		}
	}

	public void update() {
		currentState.updateState(this);
	}
}
