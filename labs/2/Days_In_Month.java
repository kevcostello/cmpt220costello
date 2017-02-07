/* Kevin Costello, Professor Rivas, Software Dev 1 CMPT 220*/
/* February 2, 2016, Lab 2 Question 3.11*/
/* This program will state the number of days within a month */
import java.util.Scanner;
public class Days_In_Month{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);  
	
	//This Code will set and initialize the year, month and days
	System.out.println ("Please enter a year: ");
	short year = input.nextShort();
	System.out.println ("Please enter a month (numerical): ");
	short month = input.nextShort();
	short days = 0;
	
	//This code will set months within cases to establish the number of days in each
	switch (month) {
	  case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
	  case 4: case 6: case 9: case 11: days = 30; break;
	  
	  //February requires extra code to account for an extra day during leap years every four years
	  case 2:
	    if (((year % 4 == 0 ) &&! (year %100 == 0)) || (year % 400 == 0)) {
		  days = 29;
		}
		else{
		  days = 28; break;
		}
	  default: System.out.println (month + " is not a valid month");break;
	}
	
	//Prints out the number of days in the month for that year.
	System.out.println ("the number of days in " + month + ", " + year + " is " + days);
	  
  }
}