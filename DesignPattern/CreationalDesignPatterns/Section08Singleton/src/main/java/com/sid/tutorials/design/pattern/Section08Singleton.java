/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section08Singleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonSynchronizetion singletonSynchronizetion = SingletonSynchronizetion.getInstance();

		singletonSynchronizetion.setData(1000);
		System.out.println(
				"First instance :" + singletonSynchronizetion + " my value :" + singletonSynchronizetion.getData());
		singletonSynchronizetion = null;
		singletonSynchronizetion = SingletonSynchronizetion.getInstance();

		singletonSynchronizetion.setData(1000);
		System.out.println(
				"Second instance :" + singletonSynchronizetion + " my value :" + singletonSynchronizetion.getData());

		SingletonBillPuge billPuge = SingletonBillPuge.getInstance();
		billPuge.setDate(50);
		System.out.println("Singleton class using bill puge" + billPuge);
	}

}
