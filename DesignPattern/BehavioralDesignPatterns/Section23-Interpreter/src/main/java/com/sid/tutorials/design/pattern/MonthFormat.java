/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.Date;

/**
 * @author Lenovo
 *
 */
public class MonthFormat implements IAbstractFormat {

	@Override
	public void execute(Format format) {
		String format1 = format.getFormat();
		Date date = format.getDate();
		Integer month = Integer.valueOf(date.getMonth() + 1);
		String tempFormat = format1.replaceAll("MM", month.toString());
		format.setFormat(tempFormat);
	}

}
