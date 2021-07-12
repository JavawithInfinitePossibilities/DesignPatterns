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
public class Travel {
	private ITravelToRailwayStation travelToRailwayStation;

	public void gotoRailwayStation() {
		travelToRailwayStation.gotoRailwayStation();
	}
}
