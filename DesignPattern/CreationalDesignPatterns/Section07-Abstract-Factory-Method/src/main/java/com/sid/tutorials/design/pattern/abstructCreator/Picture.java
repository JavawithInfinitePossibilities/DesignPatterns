/**
 * 
 */
package com.sid.tutorials.design.pattern.abstructCreator;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author Lenovo
 *
 */
@Builder
@AllArgsConstructor
public class Picture {
	public IShape shape;
	public IColor color;

	public void getPicture() {
		shape.drowShape();
		color.fill();
	}
}
