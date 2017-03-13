package org.foobarspam.PractiseInterfaces;

public class Cat implements Walkable {
	//propiedades
	private String name;
	//constructor
	public Cat(String name) {
		this.name = name;
	}
	//metodo
	public void walk(){
		System.out.println(name + " (a cat) is walking.");

	}
}
	
