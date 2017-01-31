/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* January 29, 2016, Lab 1 Question 2.6*/
/* This program will read an integer between 0 and 1000 and add all digits in the integer*/
import java.util.Scanner;

public class Digit_Adder{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.println ("Enter a number between 0 and 1000: ");
	int number = input.nextInt();
	
	// Will identify the ones digit
	int ones = number % 10;
	
	// Will identify the tens digit
	int tens = (number / 10) % 10;
	
	// Will identify the hundreds digit
	int hundreds = (number / 100) % 10;
	
	// Will indetify the thousands digit
	int thousands = (number / 1000) % 10;
	
	int sum = ones + tens + hundreds + thousands;
	
	System.out.print("The sum of the digits is " + sum);
  }
}