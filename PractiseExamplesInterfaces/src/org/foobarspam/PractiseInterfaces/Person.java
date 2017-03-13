package org.foobarspam.PractiseInterfaces;

public class Person implements Walkable {
	//propiedades
	private String name;
	//constructor
	public Person(String name) {
		this.name = name;
	}
	//metodos
	public void walk() {
		System.out.println(name + " (a person) is walking.");
	}
}
