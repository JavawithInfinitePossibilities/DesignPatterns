/**
 * 
 */
package com.sid.tutorials.design.pattern;

import lombok.Builder;

/**
 * @author Lenovo
 *
 */
@Builder
public class Dollar10Dispanse implements IDispanseChain {
	private IDispanseChain nextChain;

	@Override
	public void setNextChain(IDispanseChain chain) {
		this.nextChain = chain;
	}

	@Override
	public void dispanse(Currency currency) {
		if (currency.getAmount() >= 10) {
			int value = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispanse " + value + " 10$ note");
			if (remainder > 0) {
				this.nextChain.dispanse(Currency.builder().amount(remainder).build());
			}
		} else {
			this.nextChain.dispanse(currency);
		}
	}

}
