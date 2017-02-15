/**
 * file: Random_Month.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: lab 2, question 3.4
 * due date: February 14, 2016
 * version: 1.0
 */

 
public class Random_Month {
  public static void main (String[] args){
    System.out.println("A random month will appear below.");
	
      int randomnum = (int)(Math.random() * 13);
      if ( randomnum == 1 )
        System.out.println("The month is January");
      else if ( randomnum == 2 )
        System.out.println("The month is February");
      else if ( randomnum == 3 )
        System.out.println("The month is March");
      else if ( randomnum == 4 )
        System.out.println("The month is April");
      else if ( randomnum == 5 )
        System.out.println("The month is May");
      else if ( randomnum == 6 )
        System.out.println("The month is June");
      else if ( randomnum == 7 )
        System.out.println("The month is July");
      else if ( randomnum == 8 )
        System.out.println("The month is August");
      else if ( randomnum == 9 )
        System.out.println("The month is September");
      else if ( randomnum == 10 )
        System.out.println("The month is October");
      else if ( randomnum == 11 )
        System.out.println("The month is November");
      else
        System.out.println("The month is December");
  }
}


 
