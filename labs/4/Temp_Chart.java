/**
 * file: Temp_Chart.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 4, 6.8
 * due date: February 28, 2017
 *
 * This program will display the conversion from fahrenheit to celsius 
 * and back within a table
 */  

public class Temp_Chart{
  public static void main (String[] args){
	
	//Display the header of the table
    System.out.println("Celsius     Fahrenheit     | Fahrenheit    Celsius\n");
      System.out.println("________________________________________________________________________");
	
	//Calculate and display data for celsius
	for (double celsius = 40.0, fahrenheit = 120.0; celsius >=31.0; celsius--, fahrenheit -=10){
	  System.out.printf("%-12.1f", celsius);
	  System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
	  System.out.printf("%-15.1f", fahrenheit);
	  System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
	}
  }

  //Convert from Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double celsius){
    return (9.0 / 5.0) * celsius + 32;
  }
  
  //Convert from Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double fahrenheit){
    return (5.0 / 9.0) * (fahrenheit - 32);
  }
}
