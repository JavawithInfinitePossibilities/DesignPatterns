/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section30TemplateMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CrossCompiler iphone = new IPhoneCompiler();
		iphone.crossCompile();
		CrossCompiler android = new AndroidCompiler();
		android.crossCompile();
	}

}
