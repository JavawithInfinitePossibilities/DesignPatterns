/**
 * 
 */
package com.sid.tutorials.design.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class ShapeCache {
	private static Map<Integer, IShape> shapeCache = new HashMap<Integer, IShape>();

	public static IShape getShape(int id) {
		return (IShape) shapeCache.get(id).clone();
	}

	public static void loadShape() {
		CircleShape circleShape = new CircleShape();
		circleShape.setId(1);
		shapeCache.put(1, circleShape);

		RectangularShap rectangularShap = new RectangularShap();
		rectangularShap.setId(2);
		shapeCache.put(2, rectangularShap);

		SqureShape squreShape = new SqureShape();
		squreShape.setId(3);
		shapeCache.put(3, squreShape);
	}
}
