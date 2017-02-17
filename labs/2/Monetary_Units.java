/**
 * file: 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: project 2, 4.25
 * due date: February 13, 2017
 *
 * This program will rewrite question 2.10 to fix the possible loss of
 * accuracy when converting a float value to a int value
 */
 
import java.util.Scanner;

public class Monetary_Units{
  public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	
	//Accepts entry from user
	System.out.println("Enter your change: ");
	String change = input.next();
	
	//Converts the change to an Int and reads "dollars" up untill a decimal
	int dollars = Integer.parseInt(change.substring(0, change.indexOf(".")));
	
	//The change remains as an Int and reads "remainder" past a decimal point.
	int remainder = Integer.parseInt(change.substring(change.indexOf(".") + 1));
	
	//Prints out your change
	System.out.println ("The dollar amount is: " + dollars);
	System.out.println ("The change amount is: " + remainder);
  }
}