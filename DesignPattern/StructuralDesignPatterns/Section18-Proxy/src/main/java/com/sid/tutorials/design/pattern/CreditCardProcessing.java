/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class CreditCardProcessing implements IAccountProcessing {
	private Banking banking;

	public CreditCardProcessing() {
		this.banking = Banking.BankingHalper.getBanking();
	}

	@Override
	public void creditAmount(int credit) {
		System.out.println("Processing the CHECK");
		this.banking.creditAmount(credit);
	}

	@Override
	public void debiteAmount(int debite) {
		System.out.println("Processing the Credit card ");
		this.banking.debiteAmount(debite);
	}

}
