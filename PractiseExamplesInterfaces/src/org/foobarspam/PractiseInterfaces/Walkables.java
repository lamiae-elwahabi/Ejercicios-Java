package org.foobarspam.PractiseInterfaces;

public class Walkables {
	//metodo
	public static void letThemWalk(Walkable[] list){
		for(Walkable w : list){
			w.walk();
			
		}
	}
}