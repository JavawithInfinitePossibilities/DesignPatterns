/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.AllArgsConstructor;

/**
 * @author Lenovo
 *
 */
@AllArgsConstructor
public class StockBuyCommend implements ICommand {

	private Stock stock;

	@Override
	public void execute() {
		stock.buyStock();
	}

}
