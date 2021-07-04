/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section09Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		House myHouse = null;
		IHouseBuilder builder = new DuplexHouseBuilder();
		myHouse = builder.typeOfHouse(HouseTypeEnum.DUPLEX).noOfBalcony(2).noOfRoom(5).noOfBathroom(3).buildHouse();
		System.out.println(myHouse);

		IHouseBuilder flatBuilder = new FlatHouseBuilder();
		myHouse = null;
		myHouse = flatBuilder.typeOfHouse(HouseTypeEnum.FLAT).noOfRoom(2).noOfBathroom(2).buildHouse();
		System.out.println(myHouse);

	}

}
