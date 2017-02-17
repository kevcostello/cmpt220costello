/**
 * file: Telephone_Number.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 4.15
 * due date: February 14, 2016
 * version: 1.0
 */

import java.util.Scanner;

public class Telephone_Number{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

	System.out.println("Please enter a letter (UpperCase): ");
	
	//Initializes letter as a char and then coverts the letter given to uppercase and takes the first letter given
	char letter = input.next().toUpperCase().charAt(0);
	
	int number = -1;
	
	//Sets the letters to a range between A and Z
	if (letter >= 'A' && letter <= 'Z') {
	 
	 //Sets letters below D to 2 
	  if (letter < 'D') {
		  number = 2;
	  } else if (letter < 'G'){
	      number = 3;
	  } else if (letter < 'I'){
		  number = 4;
	  }	else if (letter < 'M'){
		  number = 5;
	  }	else if (letter < 'P'){
		  number = 6;	
	  } else if (letter < 'T'){
		  number = 7;
	  }	else if (letter < 'W'){
		  number = 8;
	  } else if (letter < 'Z'){
		  number = 9;
	  }
	} else {
		System.out.println (number + " is not a valid input");
		System.exit(1);
	}
	System.out.println("The corresponding number is " + number);
	
  }
}
