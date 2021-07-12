/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;

/**
 * @author Lenovo Concrete Command
 */
@AllArgsConstructor
public class LightOffCommand implements ICommand {
	// reference to the light
	Light light;

	@Override
	public void execute() {
		light.switchOff();
	}

}
