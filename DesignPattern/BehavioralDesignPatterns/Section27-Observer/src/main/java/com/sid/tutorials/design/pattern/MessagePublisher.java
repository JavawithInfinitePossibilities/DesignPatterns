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
public class MessagePublisher implements ISubject {

	private List<IObserver> observers = new ArrayList<>();

	@Override
	public void attach(IObserver o) {
		observers.add(o);
	}

	@Override
	public void detach(IObserver o) {
		observers.remove(o);
	}

	@Override
	public void notifyUpdate(Message m) {
		for (IObserver o : observers) {
			o.update(m);
		}
	}

}
