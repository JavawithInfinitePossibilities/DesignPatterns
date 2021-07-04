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
public abstract class IShape implements Cloneable {
	private int id;
	private String type;

	abstract void drowShape();

	@Override
	protected Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			e.getStackTrace();
		}
		return object;
	}
}
