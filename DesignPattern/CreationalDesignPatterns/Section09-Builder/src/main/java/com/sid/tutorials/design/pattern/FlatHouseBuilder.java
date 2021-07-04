/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class FlatHouseBuilder implements IHouseBuilder {

	private House house = new House();

	private static IHouseBuilder builder = new FlatHouseBuilder();

	@Override
	public IHouseBuilder typeOfHouse(HouseTypeEnum hte) {
		house.setTypeOfHouse(hte.getType());
		builder.setHouse(house);
		return builder;
	}

	@Override
	public IHouseBuilder noOfRoom(int room) {
		house.setNoOfRoom(room);
		builder.setHouse(house);
		return builder;
	}

	@Override
	public IHouseBuilder noOfBathroom(int bathRoom) {
		house.setNoOfBathroom(bathRoom);
		builder.setHouse(house);
		return builder;
	}

	@Override
	public IHouseBuilder noOfBalcony(int balcony) {
		house.setNoOfBalcony(balcony);
		builder.setHouse(house);
		return builder;
	}

	@Override
	public House buildHouse() {
		return house;
	}

	@Override
	public void setHouse(House house) {
		this.house = house;
	}

}
