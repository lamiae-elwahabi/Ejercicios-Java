package org.foobarspam.practica.chapter7;

import java.time.LocalDate;
//propiedades de las variables
public class Person {
		String name;
		LocalDate birthdate;
//constructores
		public Person (String name, int year, int month, int day){
			LocalDate tempBD = LocalDate.of(year, month, day);
			this.name = name;
			this.birthdate = tempBD;
		}
	}

