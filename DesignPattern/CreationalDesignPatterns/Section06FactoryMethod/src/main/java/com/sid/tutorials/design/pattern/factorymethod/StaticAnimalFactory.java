/**
 * 
 */
package com.sid.tutorials.design.pattern.factorymethod;

import com.sid.tutorials.design.pattern.abstructCreator.IAnimal;
import com.sid.tutorials.design.pattern.abstructCreator.LionAnimal;
import com.sid.tutorials.design.pattern.abstructCreator.TigerAnimal;

/**
 * @author Lenovo
 *
 */
public class StaticAnimalFactory {

	public static IAnimal getAnimal(AnimalEnum ae) {
		IAnimal animal = null;
		switch (ae) {
		case TIGER:
			animal = new TigerAnimal();
			break;
		case LION:
			animal = new LionAnimal();
			break;
		default:
			break;
		}
		return animal;
	}
}
