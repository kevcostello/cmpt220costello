/**
 * file: Palindrome.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 6.3
 * due date: February 21, 2017
 *
 * This program will reverse a given integer and display wether or not
 * the number functions as a palindrome
 */
 
import java.util.Scanner;

public class Palindrome  {
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Please enter an integer: ");
      int palindromeNumber = input.nextInt();
	
	//Out differs depending on wether or not the number is a palindrome
	if (isPalindrome(palindromeNumber))
	  System.out.println(palindromeNumber + " is a palindrome");
        else
	  System.out.println(palindromeNumber + " is not a palindrome");
    	
  }
  
  //Returns the reverse of the integer
  public static int reverse(int number)  {
    int reversedNumber = 0;
	
      while (number != 0)  {
	reversedNumber *=10;
	reversedNumber +=(number % 10);
	number /=10;
      }
	
      return reversedNumber;
  }
  
  //Returns true if the number is a palindrome
  public static boolean isPalindrome(int number)  {
    return (number == reverse(number));
	
  }
}
