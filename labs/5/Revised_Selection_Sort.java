/**
 * file: Revised_Selection_Sort.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 5, 7.20
 * due date: March 28, 2017
 *
 * This program finds the largest of 10 numbers and swaps them with the last
 */

import java.util.Scanner;

public class Revised_Selection_Sort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10]; // Create an array of length 10

    // Prompt the user to enter ten numbers
    System.out.print("Please enter ten numbers seperated by a space : ");
    for (int i = 0; i < numbers.length ; i++)
      numbers[i] = input.nextDouble();

      // Invoke selectionSort
      selectionSort(numbers);

	  // Display the sorted numbers
      for (double k: numbers) 
        System.out.print(k + " ");
        System.out.println();
  }
  
  // selsctionSort sorts array in accending order
  // by checking "i", the current last number in the list
  // to each number prior    
  public static void selectionSort(double[] list) {
    for (int i = list.length - 1; i >= 0; i--) {
      // Find the maximum in the list
      double currentMax = list[i];
      int currentMaxIndex = i;

        for (int j = i - 1; j >= 0; j--) {
          if (currentMax < list[j]) {
            currentMax = list[j];
            currentMaxIndex = j;
          }
        }

            // Swap list[i] with list[currentMax] if necessary
            if (currentMaxIndex != i) {
              list[currentMaxIndex] = list[i];
              list[i] = currentMax;
            }
    }
  }
}