package org.foobarspam.aplication;

import java.math.BigDecimal;

public abstract class Account {
	//Propiedades 
	private String name = " ";
	private BigDecimal amount;
	//Constructor
	public Account(String acctName, String startAmount) {
		this.setName(acctName);
		this.setAmount(startAmount);
		this.amount.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("Account Created: " + this.getName());
	}
	//Getters y Setters
	public String getName() {
		return this.name;
	}
	public BigDecimal getAmount() {
		return this.amount;
	}
	public void setName(String newName) {
		String pattern = "^[a-zA-Z0-9]*$";
		if (newName.matches(pattern)) {
			this.name = newName;
		}
	}
	private void setAmount(String newAmount){
		this.amount = new BigDecimal(newAmount);
	}
	//Metodos
	public void withdraw(String withdrawal) throws IllegalArgumentException{
		BigDecimal desiredAmount = new BigDecimal(withdrawal);
		//if desired amount is negative, throw an exception
		if (desiredAmount.compareTo(BigDecimal.ZERO) < 0){
			throw new IllegalArgumentException();
		}
		//if the amount is less than the desired amount, throw an exception
		if (this.getAmount().compareTo(desiredAmount) < 0){
			throw new IllegalArgumentException();
		}
		this.setAmount(this.getAmount().subtract(desiredAmount).toString());
		System.out.println("Withdrawal: " + this);
	}
	public void deposit(String deposit) throws IllegalArgumentException{
		BigDecimal desiredAmount = new BigDecimal(deposit);
		//if desired amount is negative, throw an exception
		if (desiredAmount.compareTo(BigDecimal.ZERO) < 0){
			throw new IllegalArgumentException();
		}
		this.setAmount(this.getAmount().add(desiredAmount).toString());
		System.out.println("Deposit: " + this);
	}
	@Override
	public String toString(){
		return this.getName() + ": Balance = " + this.getAmount();
	}
}
