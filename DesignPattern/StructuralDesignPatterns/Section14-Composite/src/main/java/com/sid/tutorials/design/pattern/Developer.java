/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Builder;

/**
 * @author Lenovo
 *
 */
@Builder
public class Developer implements IEmployee {
	private int empId;
	private String name;
	private long salary;
	private PositionEnum position;

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee id:" + this.empId + " Employee name:" + this.name + " Employee salary:"
				+ this.salary + " Employee position:" + this.position);
	}

}
