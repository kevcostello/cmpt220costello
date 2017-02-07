/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* February 2, 2016, Lab 2 Question 4.5*/
/* This program will calculate the area of a polygon */
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