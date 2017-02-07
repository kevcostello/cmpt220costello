/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* January 24, 2017, Lab 1 Question 2*/
/* This program will calculate the percentage total grade of a student */

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