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
public class StockSellCommend implements ICommand {
	private Stock stock;

	@Override
	public void execute() {
		stock.sellStock();
	}

}
