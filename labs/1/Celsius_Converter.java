/**
 * file: Celsius_Converter.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 1, question 2.1
 * due date: January 24, 2017
 * version: 1
 *
 * This program will convert a degree in Celsius to its equivalent in Fahrenheit.
 */

import java.util.Scanner;

public class Celsius_Converter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
    System.out.println ("Enter a degree in Celsius: ");
	double celsius = input.nextDouble();
	
	/* Convert Celsius to Fahrenheit */
	double fahrenheit = (celsius * (9.0 / 5)) + 32;
	System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");	
  }
}
