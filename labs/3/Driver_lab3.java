/**
 * file: Driver_lab3.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, Kattis
 * due date: February 21, 2017
 *
 * This program will calculate the distance between two points
 */
 
import java.util.Scanner;

public class Driver_lab3  {
  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    
	//Initializes x1 to equal next entry
    while (true)  {
	double x1 = scan.nextDouble();
	
	//Stops the program when 0 is entered
	if (x1 == 0)
		break;
	
	double y1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	double p = scan.nextDouble();
	
	//Formula for finding the p value of distances
	System.out.printf( "%.5f" , Math.pow(Math.pow(Math.abs(x1 - x2) , p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
	System.out.println();
	}

    scan.close();
	}

}