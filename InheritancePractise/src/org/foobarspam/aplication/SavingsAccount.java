package org.foobarspam.aplication;

public class SavingsAccount extends Account {
	
	public SavingsAccount(String acctName, String startAmount) {
		super(acctName, startAmount);
		this.deposit("10.00");
	}
	//Metodos de la clase abstracta (metodos sobre cargados)
	@Override
	public String toString() {
		return "Savings Account " + super.toString();
	}
}



