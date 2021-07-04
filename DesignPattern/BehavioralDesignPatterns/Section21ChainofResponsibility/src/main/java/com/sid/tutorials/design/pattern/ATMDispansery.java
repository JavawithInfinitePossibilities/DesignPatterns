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
public class ATMDispansery {

	public void moneyDispansery(int amount) throws Exception {
		if ((amount % 10) != 0) {
			System.out.println("Amount should be in multiple of 10. please try again");
			throw new Exception();
		}
		IDispanseChain dispanseChain50 = Dollar50Dispanse.builder().build();
		IDispanseChain dispanseChain20 = Dollar20Dispanse.builder().build();
		IDispanseChain dispanseChain10 = Dollar10Dispanse.builder().build();

		dispanseChain50.setNextChain(dispanseChain20);
		dispanseChain20.setNextChain(dispanseChain10);

		dispanseChain50.dispanse(Currency.builder().amount(amount).build());
	}
}
