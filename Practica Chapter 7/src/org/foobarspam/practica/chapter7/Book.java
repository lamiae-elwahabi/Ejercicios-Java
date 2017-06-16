package org.foobarspam.practica.chapter7;

public class Book {
//propiedades
		String title;
		String author;
		boolean isRead;
		int numberOfReadings;
//metodo con ningun parametro
		public void read(){
			isRead = true;
			numberOfReadings++;
	}
	//metodo con int parametro
		public void read(int i){
			isRead = true;
			numberOfReadings += i;
		
		}
	//constructor
		public Book() {
		}
		
		public Book(String bTitle, String aName, boolean hasBeenRead, int read){
			title = bTitle;
			author = aName;
			isRead = hasBeenRead;
			numberOfReadings = read;
			}
		public void printName(){
			System.out.println(this.name);
			}

}
