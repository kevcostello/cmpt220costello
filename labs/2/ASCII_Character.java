/**
 * file: ASCII_Character.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 4.8
 * due date: February 7, 2016
 * version: 1.0
 *
 * This program will take an entered ASCII code and convert it to its corresponding symbol.
 */
import java.util.Scanner;

public class ASCII_Character{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.println("Enter an ASCII code: ");
	int ASCIIcode = input.nextInt();
    char ASCIIcharacter = (char) ASCIIcode;
	
	
	System.out.println("The character for ASCII code " + ASCIIcode + " is " + ASCIIcharacter);
  }
}
