package com.jdojo.string;

public class StringLength {

	public static void main(String[] args) {
		// Create two string objects
		String str1 = new String() ;
		String str2 = new String("Hello") ;
		String str3 = new String("My name is Lamiae") ;
		String str4 = new String("I live in Spain") ;
		String str5 = new String("I am studying vocational training") ;
		
		//Get the length of str1 and str2
		int len1 = str1.length();
		int len2 = str2.length();
		int len3 = str3.length();
		int len4 = str4.length();
		int len5 = str5.length();
		
		//Display the length of str1 and str2
		System.out.println("Lenght of \"" + str1 + "\" = " + len1);
		System.out.println("Lenght of \"" + str2 + "\" = " + len2);
		System.out.println("Lenght of \"" + str3 + "\" = " + len3);
		System.out.println("Lenght of \"" + str4 + "\" = " + len4);
		System.out.println("Lenght of \"" + str5 + "\" = " + len5);
		

	}
}


