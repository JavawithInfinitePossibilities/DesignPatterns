/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Lenovo
 *
 */
public class Manager implements IEmployee {
	private int empId;
	private String name;
	private long salary;
	private PositionEnum position;
	@Setter
	@Getter
	private List<IEmployee> developer;

	@Builder
	public Manager(int empId, String name, long salary, PositionEnum position) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Employee id:" + this.empId + " Employee name:" + this.name + " Employee salary:"
				+ this.salary + " Employee position:" + this.position);
		System.out.println();
		System.out.println("Developer working under:");
		for (IEmployee developer : developer) {
			developer.showEmployeeDetails();
		}
		System.out.println();
	}

}
