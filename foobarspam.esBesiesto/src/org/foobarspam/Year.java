package org.foobarspam;

public class Year {

	private int year = 0;
	
	public Year(int year) {
		   this.year = year;
	}
	
	private int getYear() {
		return this.year;
	}
	public Boolean esBisiesto() {
			return getYear() % 4 == 0;
	}


}
