/**
 * file: Digit_Adder.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 1, question 2.6
 * due date: January 24, 2017
 * version: 1.0
 *
 * This program will add each digit in a 3 digit integer
 */

import java.util.Scanner;

public class Digit_Adder{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.println ("Enter a number between 0 and 1000: ");
	int number = input.nextInt();
	
	// Will identify the ones digit
	int ones = number % 10;
	
	// Will identify the tens digit
	int tens = (number / 10) % 10;
	
	// Will identify the hundreds digit
	int hundreds = (number / 100) % 10;
	
	// Will indetify the thousands digit
	int thousands = (number / 1000) % 10;
	
	int sum = ones + tens + hundreds + thousands;
	
	System.out.print("The sum of the digits is " + sum);
  }
}
