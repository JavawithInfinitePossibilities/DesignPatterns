/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class ChatMediatorImpl implements IChatMediator {
	private List<IUser> users = new ArrayList<IUser>();

	@Override
	public void sendMessage(String msg, IUser user) {
		for (IUser u : this.users) {
			// message should not be received by the user sending it
			if (u != user) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(IUser user) {
		this.users.add(user);
	}

}
