/**
 * 
 */
package com.sid.tutorials.design.pattern;

/**
 * @author Lenovo
 *
 */
public class Banking implements IAccountProcessing {

	private int balance;

	private Banking() {

	}

	@Override
	public void creditAmount(int credite) {
		System.out.println("Amount of " + credite + " has been credited in your account...");
	}

	@Override
	public void debiteAmount(int debite) {
		System.out.println("Amount of " + debite + " has been debitated from your account...");
	}

	public static class BankingHalper {
		private static Banking banking = new Banking();

		static {
			System.out.println("Banking halper class...");
		}

		public BankingHalper() {
			System.out.println("Banking halper class...");
		}

		public static Banking getBanking() {
			return banking;
		}
	}
}
