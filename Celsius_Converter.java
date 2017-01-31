/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* January 29, 2016, Lab 1 Question 2.1*/
/* This program will read a Celsius degree in a double value then convert it to Fahrenhiet and display the result*/
import java.util.Scanner;

public class Celsius_Converter{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	
    System.out.println ("Enter a degree in Celsius: ");
	double celsius = input.nextDouble();
	
	/* Convert Celsius to Fahrenheit */
	double fahrenheit = (celsius * (9.0 / 5)) + 32;
	System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");	
  }
}