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
public class Dollar20Dispanse implements IDispanseChain {
	private IDispanseChain nextChain;

	@Override
	public void setNextChain(IDispanseChain chain) {
		this.nextChain = chain;
	}

	@Override
	public void dispanse(Currency currency) {
		if (currency.getAmount() >= 20) {
			int value = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispanse " + value + " 20$ note");
			if (remainder > 0) {
				this.nextChain.dispanse(Currency.builder().amount(remainder).build());
			}
		} else {
			this.nextChain.dispanse(currency);
		}
	}

}
