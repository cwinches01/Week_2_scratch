package com.codercampus.week2;

import java.util.Scanner;

public class Week2Example {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300: ");
		String input = scanner.nextLine();
		System.out.println("The number you typed in was: " +  input );
			
		scanner.close();
		
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
	//	[Exercise] Reading User Input
		/*
		 * Requirements
		Your task will be to write the code to collect numeric input from console.

		In order to get numeric input, you'll need to know how to "parse" a String and convert it to a number.

		Given the example from the previous lesson, you know how to read a String as input from the console.

		To convert this input to a number, simply use Integer.parseInt(theStringInputVariableHere)

		The Integer.parseInt() method will return the Integer value of your String input.

		Here's an example of how to do it:

		String input = scanner.nextLine();

		Integer convertedInput = Integer.parseInt(input);


		Now, you'll have a variable called convertedInput that is of type Integer (instead of String).

		Note: You may get an error if you try to convert a non-numeric String to an Integer with the parseInt method... don't worry about this problem for now.


		Once you have the code to collect numeric input, your next task will be to validate that this numeric input is within a range of 50 to 300.


		If the numeric input is below 50 or above 300, your program should output "No!", otherwise it should output "Yes!"

		Example Output #1
		Type a number between 50 and 300
		25
		No!
		Example Output #2

		Type a number between 50 and 300
		75
		Yes!
		
		 */
	}
	
}
