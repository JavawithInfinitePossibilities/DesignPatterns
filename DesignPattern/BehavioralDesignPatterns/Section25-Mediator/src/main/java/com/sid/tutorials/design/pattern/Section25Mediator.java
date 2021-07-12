/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section25Mediator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IChatMediator mediator = new ChatMediatorImpl();
		IUser user1 = new UserImpl(mediator, "Pankaj");
		IUser user2 = new UserImpl(mediator, "Lisa");
		IUser user3 = new UserImpl(mediator, "Saurabh");
		IUser user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}

}
