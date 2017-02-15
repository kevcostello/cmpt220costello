/**
 * file: Calculate_Total.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 1, question 2.5
 * due date: January 24, 2017
 * version: 1.0
 *
 * This program will calculate the subtotal and gratuity on a dinner check to find the total
 */

import java.util.Scanner;

public class Calculate_Total{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.println ("Please enter the subtotal: ");
	double subtotal = input.nextDouble();
	
	// Calculates the subtotal and divides it by the gratuity owed, then adds for a total
	System.out.println ("Please enter the gratuity rate: ");
	double gratuity = input.nextDouble();
	double calculateGratuity = (subtotal / gratuity);
	double total = subtotal + calculateGratuity;
	
	System.out.println ("The gratuity is: $" + calculateGratuity + " and the total is: $" + total);
  }
}  
