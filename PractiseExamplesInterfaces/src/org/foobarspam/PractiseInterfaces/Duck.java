package org.foobarspam.PractiseInterfaces;

public class Duck implements Walkable {
	//propiedades
	private String name;
	//constructor
	public Duck(String name) {
			this.name = name;
	}
	//metodo
	public void walk() {
		System.out.println(name + " (a duck) is walking.");
	}
}