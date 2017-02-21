/**
 * file: Positive_Negative.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 5.1
 * due date: February 21, 2017
 *
 * This program will take entered integers and output how many of those
 * numbers are negative and postive and also output the average and  * total
 */

import java.util.Scanner;

public class Positive_Negative{
  public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	// Initialize all of the integers
	int count = 0;
    int positive = 0;
	int negative = 0;
	double total = 0;
	double average = 0;
	
	System.out.print("Enter an integer, the input ends if it is 0: ");
	int number = input.nextInt();
	
	// While loop continues until the number 0 appears
	while (number != 0){
	  total += number;
	  
	  // Adds one to positive or negative if the number is above or below zero
	  if (number > 0)
	    positive += 1;
	  else
		negative += 1;
	
	  number = input.nextInt();
	}
	
	// Calculates the average
	average = total / (double) count; 
	
	System.out.println("The number of positives is: " + positive);
	System.out.println("The number of negatives is: " + negative);
	System.out.println("The total is: " + total);
	System.out.println("The average is: " + average);
  }
}