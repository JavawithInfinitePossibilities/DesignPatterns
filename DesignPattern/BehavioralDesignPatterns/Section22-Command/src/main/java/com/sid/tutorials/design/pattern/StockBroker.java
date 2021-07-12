/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Setter;

/**
 * @author Lenovo
 *
 */
@Setter
public class StockBroker {
	private ICommand command;

	public void brokerExecution() {
		command.execute();
	}
}
