package org.foobarspam.esBisiesto.AnyoBisiesto;

public class AnyoBisiesto {
	//propiedades del atributo
	private int year = 0;
	
	//constructor
	public AnyoBisiesto(int year){
		this.year = year;		
	}
	
	//seter y geter
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	//Metodo
	public Boolean esBisiesto() {
		return (getYear() % 4 == 0 && (getYear() % 100 != 0 || getYear() % 400 == 0));
	}

	
}
