package org.foobarspam.PractiseInterfacesTest;

import static org.junit.Assert.*;

import org.foobarspam.PractiseInterfaces.Cat;
import org.foobarspam.PractiseInterfaces.Duck;
import org.foobarspam.PractiseInterfaces.Person;
import org.foobarspam.PractiseInterfaces.Walkable;
import org.foobarspam.PractiseInterfaces.Walkables;
import org.junit.Test;

public class WalkablesTest {

	public static void main(String[] args) {
		Walkable[] w = new Walkable[8];
		w[0] = new Person("Jack");
		w[1] = new Person("Jeff");
		w[2] = new Person("John");
		w[3] = new Person("Lamiae");
		w[4] = new Person("Fatima");
		w[5] = new Duck("Patito");
		w[6] = new Cat("Jack");
		w[7] = new Cat("Jon");
				
		// Let everyone walk
		Walkables.letThemWalk(w);
	}
}
