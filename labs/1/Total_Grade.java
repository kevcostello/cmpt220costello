/**
 * file: Total_Grade.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 1, question 2
 * due date: January 24, 2017
 * version: 1.0
 *
 * This program will take a users inputed grades and find the average of them for a total grade
 */


import java.util.Scanner;
public class Total_Grade  {
  public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	
	// Prompts the user to enter his school grades
	System.out.println ("Please enter the following as a percentage");
	System.out.println ("Midterm Exam: ");
	double midterm = input.nextDouble();
	System.out.println ("Final Exam: ");
	double finalexam = input.nextDouble();
	System.out.println ("Projects: ");
	double projects = input.nextDouble();
	System.out.println ("Homework and Labs: ");
	double hwlabs = input.nextDouble();
	
	// Adds the four different grades togther and divedes the total by 4 to get the average
	double total = (midterm + finalexam + projects + hwlabs) / 4;
	
	System.out.println ("Your final grade is: " + total);
	
	
  }
	
}
