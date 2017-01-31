/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* January 29, 2016, Lab 1 Question 2.5*/
/* This program will read a subtotal and calculate gratuity and then add it to the subtotal to form a total*/
import java.util.Scanner;

public class Calculate_Total{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		
	System.out.println ("Please enter the subtotal: ");
	double subtotal = input.nextDouble();
	
	// Calculates the subtotal and divides it by the gratuity owed, then adds for a total
	System.out.println ("Please enter the gratuity rate: ");
	double gratuity = input.nextDouble();
	double calculateGratuity = (subtotal / gratuity);
	double total = subtotal + calculateGratuity;
	
	System.out.println ("The gratuity is: $" + calculateGratuity + " and the total is: $" + total);
  }
}  