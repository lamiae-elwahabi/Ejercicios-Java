package org.foobarspam.practica.chapter7;

public class SobrecargaMetodos {
	String title;
	String author;
	boolean isRead;
	int numberOfReadings;
	
	public void read(){
		isRead = true;
	}
	
	public void read(){
	numberOfReadings++;
	}

}
