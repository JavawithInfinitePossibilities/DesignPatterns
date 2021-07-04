/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public enum HouseTypeEnum {
	FLAT("FLAT"), DUPLEX("Duplex");

	private String type;

	private HouseTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
