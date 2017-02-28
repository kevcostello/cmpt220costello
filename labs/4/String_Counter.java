/**
 * file: String_Counter.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 4, 6.20
 * due date: February 28, 2017
 *
 * This program will analyse a string and output the number of letters  * in the string
 */  
import java.util.Scanner;

public class String_Counter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	//Prompts user to enter any series of letters or sentences
	System.out.print("Please enter any number of letters:");
	String letters = input.nextLine();
	System.out.print("The number of letters is: " + countLetters(letters));
  }
  //Method counts the number of strings
  public static int countLetters(String s){
	int counter = 0;
	for (int i = 0; i < s.length(); i++){
	  //Increases the value of the counter by 1 each time a char is located
	  if (Character.isLetter(s.charAt(i)))
		counter++;
	}
	
	return counter;
	  
  }
}
  