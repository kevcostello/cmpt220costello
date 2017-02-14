/**
 * file: Increasing_Integers.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 3.8
 * due date: February 14, 2016
 * version: 1.0
 */

import java.util.Scanner;

public class Increasing_Integers{
  public static void main(String[]args){
	Scanner input = new Scanner(System.in);
    
	//will accept 3 integers from the user
    System.out.println ("Please enter digit 1 of 3: ");
	int number1 = input.nextInt();
	System.out.println ("Please enter digit 2 of 3: ");
	int number2 = input.nextInt();
	System.out.println ("Please enter digit 3 of 3: ");
    int number3 = input.nextInt();

	//will see if the first number is larger than the second and then set number2 to a temporary integer
	 if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }
    //will see if the second number is larger than the third and will then set the number3 to a temporary integer
    if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
    }
    //repeats the process of the first one which ensure all integers are assigned to its correct integer
    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }
    //prints the numbers out within the correct order 
    System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
  }
}
