package org.foobarspam.throwExceptions;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptions {

	public static void main(String[] args) {
		try {
			// store the double[] returned by the scanValues() method

			double[] userValues = scanValues();

			// store the double returned by the calculatePayment() method

			double payment = calculatePayment(userValues);

			// create a decimal format with two places after the decimal point

			DecimalFormat df = new DecimalFormat("0.##");

			// print the calculated payment according to the format above

			System.out.println("Monthly payment: $" + df.format(payment));
		} catch (InputMismatchException ime) {

			// scanValues() method throws InputMismatchException
			// if user's entry cannot be parsed into a double

			System.out.println("You must enter double values. " + "Please restart program.");

			// terminate the program

			System.exit(0);
		} catch (ArithmeticException ae) {

			// calculatePayment() method throws ArithmeticException
			// if years == 0

			System.out.println("Years must be greater than 0. " + "Please restart program.");

			// terminate the program

			System.exit(0);
		} catch (IndexOutOfBoundsException ioob) {

			// calculatePayment() method throws IndexOutOfBoundsException
			// if double[] has less than 3 elements

			System.out.println("Three doubles are required. " + "Please restart program.");

			// terminate the program
			System.exit(0);
		}
	}
	import java.text.DecimalFormat;
	import java.util.Scanner;
	public class Resources {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
	try {
	System.out.print("Enter the loan amount: ");
	double principle = scan.nextDouble();
	System.out.print("Enter the interest rate: ");
	double rate = scan.nextDouble();
	System.out.print("Enter the loan term (in years): ");
	double years = scan.nextInt();
	double interest = principle*rate*years;
	double total = principle + interest;
	double payment = total/years/12;
	DecimalFormat df = new DecimalFormat ("0.##");
	System.out.println("Monthly payment: $"
	+ df.format(payment));
	} catch (Exception exc){
	System.out.println(exc);
	} finally
	
