/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Section14Composite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IEmployee dev1 = Developer.builder().empId(1).name("dev1").salary(1000).position(PositionEnum.DEVELOPER)
				.build();
		IEmployee dev2 = Developer.builder().empId(2).name("dev2").salary(1000).position(PositionEnum.DEVELOPER)
				.build();
		IEmployee dev3 = Developer.builder().empId(3).name("dev3").salary(1000).position(PositionEnum.DEVELOPER)
				.build();

		IEmployee tester1 = Developer.builder().empId(4).name("tester1").salary(1000).position(PositionEnum.TESTER)
				.build();
		IEmployee tester2 = Developer.builder().empId(5).name("tester2").salary(1000).position(PositionEnum.TESTER)
				.build();
		IEmployee tester3 = Developer.builder().empId(6).name("tester3").salary(1000).position(PositionEnum.TESTER)
				.build();

		IEmployee ope1 = Developer.builder().empId(7).name("ope1").salary(1000).position(PositionEnum.OPERATION)
				.build();
		IEmployee ope2 = Developer.builder().empId(8).name("ope2").salary(1000).position(PositionEnum.OPERATION)
				.build();
		IEmployee ope3 = Developer.builder().empId(9).name("ope3").salary(1000).position(PositionEnum.OPERATION)
				.build();

		Manager devManager = Manager.builder().empId(10).name("Dev Manager").salary(2000).position(PositionEnum.MANAGER)
				.build();
		devManager.setDeveloper(List.of(dev1, dev2, dev3));
		Manager testingManager = Manager.builder().empId(11).name("testing Manager").salary(2000)
				.position(PositionEnum.MANAGER).build();
		testingManager.setDeveloper(List.of(tester1, tester2, tester3));
		Manager opsManager = Manager.builder().empId(12).name("Opes Manager").salary(2000)
				.position(PositionEnum.MANAGER).build();
		opsManager.setDeveloper(List.of(ope1, ope2, ope3));

		IEmployee dev4 = Developer.builder().empId(13).name("dev4").salary(1000).position(PositionEnum.DEVELOPER)
				.build();
		Director director = Director.builder().empId(14).name("Director").salary(5000).position(PositionEnum.DIRECTOR)
				.build();
		director.setManager(List.of(devManager, testingManager, opsManager));
		director.setDeveloper(List.of(dev4));
		director.showEmployeeDetails();
	}

}
