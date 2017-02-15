/**
 * file: Area_Pentagon.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 4.1
 * due date: February 7, 2017
 * version: 1.0
 *
 * This program will calculate the area of a pentagon, using a given length from the center to a vertex
 */

import java.util.Scanner;

public class Area_Pentagon{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	double side;
	double area;
	
	// Prompts the user to enter a number
	System.out.println("Please enter the length from the center of the pentagon to a vertex: ");
	double length = input.nextDouble();
	
	//Calculates length of a side from the center to a vertex
	double s = (2 * length) * Math.sin ( Math.PI / 5);
	System.out.println("The length of a side is: " + s);
	
	//Calculates area of a pentagon
	double a = (5 * Math.pow( s , 2 )) /  (4 *(Math.tan (Math.PI / 5)));
	System.out.println("The area of the pentagon is: " + a);
  }
}
