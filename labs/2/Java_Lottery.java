/**
 * file: Java_Lottery.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 3.15
 * due date: February 14, 2016
 * version: 1.0
 */

import java.util.Scanner;

public class Java_Lottery {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
	System.out.println ("Java Lottery! Enter a 3 digit number to see if you win: ");
	int lottoGuess = input.nextInt();
	int lottoAnswer = 845;
	
	//Get lotto digits
	int lottoDigit1 = lottoAnswer / 100;
	int lottoDigit2 = lottoAnswer / 10;
	int lottoDigit3 = lottoAnswer % 10;
	
	//Get lotto guess digits
	int guessDigit1 = lottoGuess / 100;
	int guessDigit2 = lottoGuess / 10;
	int guessDigit3 = lottoGuess % 10;
	
	//Check the lotto guess to the actual lotto number
	if (lottoGuess == lottoAnswer){
	  System.out.println("Congratulations you had an exact match! You win $10,000!");
	}
	else if (guessDigit1 == lottoDigit2
	  && guessDigit2 == lottoDigit3
	  && guessDigit3 == lottoDigit1
	  && guessDigit3 == lottoDigit2
	  && guessDigit2 == lottoDigit1
	  && guessDigit1 == lottoDigit3){
	  System.out.println("You matched all of the right digits! You win $3,000!");
	}  
	else if (guessDigit1 == lottoDigit1
	  || guessDigit1 == lottoDigit2
	  || guessDigit1 == lottoDigit3
	  || guessDigit2 == lottoDigit1
	  || guessDigit2 == lottoDigit2
	  || guessDigit2 == lottoDigit3
	  || guessDigit3 == lottoDigit1
	  || guessDigit3 == lottoDigit2
	  || guessDigit3 == lottoDigit3){
	  System.out.println("You matched a number! You win $1,000!");
	}
  }
}
