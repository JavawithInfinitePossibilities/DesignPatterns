/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class YearFormat implements IAbstractFormat {

	@Override
	public void execute(Format format) {
		String format1 = format.getFormat();
		Date date = format.getDate();
		Integer year = Integer.valueOf(date.getYear() + 1900);
		String tempFormat = format1.replaceAll("YYYY", year.toString());
		format.setFormat(tempFormat);
	}

}
