/**
 * file: Licence_Plate.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: project 2, 4.25
 * due date: February 13, 2017
 *
 * This program will generate a licence plate with three uppercase
 * letters and 4 numbers.
 */
import java.util.Random;

public class Licence_Plate{
  public static void main(String[] args){
	System.out.println("This program will print out a random licence plate.");
	
	//Will create a combination of 3 letters
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String x = "";
	Random random = new Random();
	  char a1 = alphabet.charAt(random.nextInt(26));
	  x += a1;
	  char a2 = alphabet.charAt(random.nextInt(26));
	  x += a2;
	  char a3 = alphabet.charAt(random.nextInt(26));
	  x += a3;
	
	// Will create a random 4 digit number for the licence plate
	int num1 = (int) (Math.random() * 10);
    int num2 = (int) (Math.random() * 10);
	int num3 = (int) (Math.random() * 10);
	int num4 = (int) (Math.random() * 10);
		
	System.out.println ("The licence plate number is: " + a1 + a2 + a3 + num1 + num2 + num3 + num4);
  }
	
}
