/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* February 6, 2017, Lab 2 Question 4.1*/
/* This program will calculate the length of a side and the area of a pentagon */
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