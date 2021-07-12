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
public abstract class IUser {
	protected IChatMediator mediator;
	protected String name;

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
