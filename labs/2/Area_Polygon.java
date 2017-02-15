/**
 * file: Area_Polygon.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 4.5
 * due date: February 14, 2016
 * version: 1.0
 *
 * This program will calculate the area of a polygon with a given length from the center to a vertex and the numbe of sides.
 */

import java.util.Scanner;

public class Area_Polygon{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	//Prompts the usre to enter the number of sides and length of the side
	System.out.println ("Please enter the number of sides: ");
	
	//The number of sides is labeled as an int in case the user tries to make 3.5 sides or something
	int numsides = input.nextInt();
	System.out.println ("Please enter the length of the side: ");
    double lengthsides = input.nextDouble();
    
    // Calculates the area	
	double area = ( numsides * Math.pow( lengthsides , 2 )) / (4 *(Math.tan (Math.PI / numsides)));
	
	System.out.println ("The Area of the polgon is: " + area ); 

  }  
}
	
	
