package org.foobarspam.exepciones;


public class IndexExceptionExample {
	public static void main(String[] args) {
		//propiedades
		int[] hoursWorked = {7,8,7,9,5};
		int totalHours = 0;
		for (int i = 0; i < hoursWorked.length; i++){
			totalHours += hoursWorked[i];
		}
		System.out.println("Total Hours = " + totalHours);
	}
}
