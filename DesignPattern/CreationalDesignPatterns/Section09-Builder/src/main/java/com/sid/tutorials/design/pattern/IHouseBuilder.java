/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public interface IHouseBuilder {
	IHouseBuilder typeOfHouse(HouseTypeEnum hte);

	IHouseBuilder noOfRoom(int room);

	IHouseBuilder noOfBathroom(int bathRoom);

	IHouseBuilder noOfBalcony(int balcony);

	House buildHouse();

	void setHouse(House house);

}
