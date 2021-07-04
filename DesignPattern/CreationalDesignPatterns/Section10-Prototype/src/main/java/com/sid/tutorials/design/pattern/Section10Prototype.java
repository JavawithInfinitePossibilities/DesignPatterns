/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Section10Prototype {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeCache.loadShape();

		IShape shape = (RectangularShap) ShapeCache.getShape(2);
		IShape shape2 = (RectangularShap) ShapeCache.getShape(2);
		System.out.println(shape.hashCode());
		System.out.println(shape2.hashCode());
		if (shape == shape2) {
			System.out.println(shape);
			System.out.println(shape2);
		}
	}

}
