/**
 * file: Largest_Element.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 5, 8.13
 * due date: March 28, 2017
 *
 * This program will use a method that takes two sorted 
 * lists and displays them in a merged, sorted list
 */
 
import java.util.Scanner;

public class Largest_Element {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  // Prompt the user to enter a two-dimensional array 
  System.out.print("Enter the number of rows and columns of the array: ");
  int row = input.nextInt();
  int column = input.nextInt();
  
  // Initializes "array"
  double[][] array = new double[row][column];

  System.out.println("Enter the array:");
  // Places each entered number into an array
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      array[i][j] = input.nextDouble();
    }
  }
	
  // Get the location of the largest element
  int[] location = findLargest(array);

  // Displays the results
  System.out.println("The location of the largest element is at (" +
	location[0] + ", " + location[1] + ")");
  }

  // FindLargest returns the location of the 
  // largest element in a two-dimensional array
  public static int[] findLargest(double[][] a) {
    int[] l = new int[2];
    l[0] = 0;
    l[1] = 0;
    double max = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > max) {
          l[0] = i;
          l[1] = j;
          max = a[i][j];
	}
      }
    }
    return l;
  }
}
