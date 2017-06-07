package org.foobarspam.main;

import org.foobarspam.aplication.Account;
import org.foobarspam.aplication.CheckingAccount;
import org.foobarspam.aplication.SavingsAccount;

public class AccountManager {

	public static void main(String[] args) {
		Account mySavings = new SavingsAccount("Save001", "10.00");
		try {
			mySavings.withdraw("5.00");
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid Withdrawal");
		}
		Account myChecking = new CheckingAccount("Check002", "10.00", 1);
		try {
			myChecking.withdraw("5.00");
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid Withdrawal");
		}
		myChecking.deposit("500.00");
		try {
			myChecking.withdraw("5.00");
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid Withdrawal");
		}
	}
}


