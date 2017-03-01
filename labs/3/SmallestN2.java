/**
 * file: SmallestN2.java 
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 3, 5.13
 * due date: February 21, 2017
 *
 * This program will find the smallest number that when cubed will be 
 * above 12,000 
 */
 
public class SmallestN2{
  public static void main (String[] args){
	  
    //Initialize all variables
    int n = 1;
	
      //Increases the value of n by 1 each time its cube isnt greater than 12,000
      while ((int) Math.pow (n, 3) < 12000 ){
        ++n;
      }
      System.out.print ("The smallest number cubed greater than 12000 is: " + n);
  }
}
