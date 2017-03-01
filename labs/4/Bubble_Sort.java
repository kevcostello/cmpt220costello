/**
 * file: Bubble_Sort.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 4, 7.18
 * due date: February 28, 2017
 *
 * This pogram will read 10 double numbers and sort and display them 
 * using the bubble sort method
 */  
import java.util.Scanner;

public class Bubble_Sort{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	//Create an array that contains 10 numbers
	double[] numbers = new double[10];
    System.out.print("Enter 10 numbers: ");
	
	//Increaes the value of i by 1 untill it reaches 10
	for (int i = 0; i < numbers.length; i++)
	  numbers[i] = input.nextDouble();
    
	//Uses the bubblesort method when outputting the string
	bubbleSort(numbers);
	
	//Outputs the string
	for (double e: numbers){
	  System.out.print (e + " ");
	}
	System.out.println();
  }
  
  public static void bubbleSort(double[] bubbleSortArray){
    
	//Initializes variables
	double x;
	boolean sorted;
	
	do{
	  sorted = false;
	  for (int i = 0; i <bubbleSortArray.length - 1; i++){
		//Takes each number and swapps it with the next number if they are not in order
	    if (bubbleSortArray[i] > bubbleSortArray [i + 1]){
		  x = bubbleSortArray[i];
		  bubbleSortArray[i] = bubbleSortArray [i + 1];
		  bubbleSortArray[i + 1] = x;
		  sorted = true;
		}
	  }
	} 
	//repeats the process if a number is swapped
	while (sorted);
  }
}