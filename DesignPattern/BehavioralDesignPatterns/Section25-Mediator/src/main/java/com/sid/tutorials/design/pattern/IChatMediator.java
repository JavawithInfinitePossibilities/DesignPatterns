/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public interface IChatMediator {
	public void sendMessage(String msg, IUser user);

	void addUser(IUser user);
}
