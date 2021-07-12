/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class DayFormat implements IAbstractFormat {

	@Override
	public void execute(Format format) {
		String format1 = format.getFormat();
		Date date = format.getDate();
		Integer day = Integer.valueOf(date.getDate());
		String tempFormat = format1.replaceAll("DD", day.toString());
		format.setFormat(tempFormat);
	}

}
