/**
 * file: Tuition.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 5.7
 * due date: February 21, 2017
 *
 * This program will calculate the cost of tuition over 10 years plus
 * 4 years of tuition after the first 10
 */
 
import java.util.Scanner;

public class Tuition{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// Initialize all variables
	double tuitionPerYear = 10000;
	double tuitionIncrease = .05;
	double fourYearsTuition = 0;
	
	//%-7s creates 7 spaces between the strings
	System.out.printf("%-7s %s \n", "Year", "Cost");

	//Initializes int i and acts as the counter for number of outputs
	for (int i = 0; i <= 14; i++){
	  if (i <= 10){
		System.out.printf( "%-7d %.2f \n", i, tuitionPerYear);
        tuitionPerYear += (tuitionPerYear * tuitionIncrease);		
	  }
	  // Calculates four extra years of tuition but doesnt print them
	  else {
		fourYearsTuition += tuitionPerYear +(tuitionPerYear * tuitionIncrease);		
	  }
	}
	
	System.out.printf("%s %.2f", "Tuition after four years is: $", fourYearsTuition);
  }
}