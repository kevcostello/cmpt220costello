/**
 * file: Smallest_Number.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 4, 7.9
 * due date: February 28, 2017
 *
 * This program will find the number with the smallest value when a 
 * series of numbers is entered
 */  
import java.util.Scanner;

public class Smallest_Number{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
	//Creates an array with 10 values
	double[] numbers = new double[10];
  
	System.out.print("Please enter ten numbers: ");
	//Stops taking number entries after 10
	for (int i = 0; i < numbers.length; i++){
	  numbers[i] = input.nextDouble();
	}
	System.out.print("The minimum is: " + minimum(numbers));
	
  }
  
  //Method locates and returns the minimum value in an array
  public static double minimum(double[] array){
	double minimum = array[0];
	for (double i: array){
		if ( i < minimum)
		  minimum = i;
	}
	return minimum;
  }
}