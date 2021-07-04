/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
@Getter
@Builder
public class Currency {
	private int amount;
}
