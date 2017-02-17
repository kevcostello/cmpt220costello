/**
 * file: Total_Grade2.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: project 2, question 2
 * due date: February 13, 2017
 *
 * This program will accept four grades from the user, find the  
 * average and calculate a letter grade.
 */
import java.util.Scanner;
public class Total_Grade2  {
  public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	
	// Prompts the user to enter his school grades
	System.out.println ("Please enter the following as a percentage");
	System.out.println ("Midterm Exam: ");
	double midterm = input.nextDouble();
	System.out.println ("Final Exam: ");
	double finalexam = input.nextDouble();
	System.out.println ("Projects: ");
	double projects = input.nextDouble();
	System.out.println ("Homework and Labs: ");
	double hwlabs = input.nextDouble();
	
	// Adds the four different grades togther and divedes the total by 4 to get the average
	double total = (midterm + finalexam + projects + hwlabs) / 4;
	
	String gradeletter = "";
	
	if (total >= 95){
	  gradeletter = "A";
    }
	else if (total >= 90){
	  gradeletter = "A-";
	}
	else if (total >= 87){
	  gradeletter = "B+";
	}
	else if (total >= 83){
	  gradeletter = "B";
	}
	else if (total >= 80){
	  gradeletter = "B-";
	}
	else if (total >= 77){
	  gradeletter = "C+";
	}
	else if (total >= 73){
	  gradeletter = "C";
	}
	else if (total >= 70){
	  gradeletter = "C-";
	}
	else if (total >= 65){
	  gradeletter = "D+";
	}
	else if (total >= 60){
	  gradeletter = "D-";
	}
	else {
	  gradeletter = "F";
	}
	System.out.println ("Your final grade is: " + gradeletter);
	
	
  }
	
}