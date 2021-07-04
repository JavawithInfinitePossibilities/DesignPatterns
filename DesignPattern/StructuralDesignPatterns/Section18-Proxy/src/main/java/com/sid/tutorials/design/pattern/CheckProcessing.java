/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class CheckProcessing implements IAccountProcessing {

	private Banking banking;

	public CheckProcessing() {
		System.out.println("Check");
		this.banking = Banking.BankingHalper.getBanking();
	}

	@Override
	public void creditAmount(int credite) {
		System.out.println("Processing the CHECK");
		this.banking.creditAmount(credite);
	}

	@Override
	public void debiteAmount(int debite) {
		System.out.println("Processing the CHECK");
		this.banking.debiteAmount(debite);
	}

}
