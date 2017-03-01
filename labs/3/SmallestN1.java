/**
 * file: SmallestN1.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 5.12
 * due date: February 21, 2017
 *
 * This program will find the smallest number that when squared will be * above 12,000 
 */
 
public class SmallestN1{
  public static void main(String[] args){
  
    //Initialize all variables
    int n = 1;
	
	// Increases the value of n by 1 everytime its square is less than 12,000
      while ((int) Math.pow(n,2) < 12000){
        ++n;
      }
    System.out.println("The smallest number squared greater than 12000 is: " + n);  
  }
}
