/**
 * file: Sum_Digits.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 6.2
 * due date: February 21, 2017
 *
 * This program will sum each digit in an integer
 */

import java.util.Scanner;

public class Sum_Digits{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please enter an integer: ");
	long number = input.nextLong();
	System.out.print(sumDigits(number));
	
	input.close();
  }
  
  //Uses a new method to break down the given numbers digits
  public static int sumDigits(long n){
	int length = (int) Math.log10(n);
	int sumDigits = 0;
    
	//Int i increases by 1 until it is larger than the number of digits
	//The total number "n" is broken down using % and / until each
	//individual digit is found
	for (int i = 0; i <= length; i++){
	  sumDigits += (n % 10);
	  n /= 10;
	}
	
	return sumDigits;
  }
}
