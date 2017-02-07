/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* February 2, 2016, Lab 2 Question 3.4*/
/* This program will assign 1 to "x" if "y" is greater than 0 */
import java.util.Scanner;

public class X_To_1 {
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	  
	System.out.println ("Please enter a number: ");
	double valueY = input.nextDouble();
	double valueX = 1;
	  // Sets "x" to equal 1 if "y" is more than 0
	if (valueY > 0){
	  valueX = 1;
	}
	  // Sets "x" to be undefined if "y" is less than 0
	else if (valueY < 0){
      valueX = 0; 
	}
	System.out.println ("x is equal to: " + valueX);
  }
}