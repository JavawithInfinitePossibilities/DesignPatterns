/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public interface ISubject {
	public void attach(IObserver o);

	public void detach(IObserver o);

	public void notifyUpdate(Message m);
}
