/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Setter;

/**
 * @author Lenovo 
 * Invoker
 */
@Setter
public class RemoteControl {
	private ICommand command;

	public void pressButton() {
		command.execute();
	}
}
