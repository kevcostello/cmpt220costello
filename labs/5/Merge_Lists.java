/**
 * file: Merge_Lists.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 5, 7.31
 * due date: March 28, 2017
 *
 * This program will use a method that takes two sorted 
 * lists and displays them in a merged, sorted list
 */
 
import java.util.Scanner;

public class Merge_Lists{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // Prompt the user to enter list 1
  System.out.print("Enter the length of list 1, then the content of list 1: ");
  int[] list1 = new int[input.nextInt()];
  for (int i = 0; i < list1.length; i++) {
    list1[i] = input.nextInt();
  }

  // Prompt the user ot enter list 2
  System.out.print("Enter the length of list 2, then the content of list 2: ");
  int[] list2 = new int[input.nextInt()];
  for (int i = 0; i < list2.length; i++) {
    list2[i] = input.nextInt();
  }

  // Merges the lists
  int[] list3 = merge(list1, list2);

  // Displays the merged list
  System.out.print("The merged list is");
  for (int e: list3) {
    System.out.print(" " + e);
  }
    System.out.println();
  }

  // Merges two sorted lists into a new sorted list
  public static int[] merge(int[] list1, int[] list2)  {
    int[] list3 = new int[list1.length + list2.length];
		
    for (int i = 0; i < list1.length; i++){
      list3[i] = list1[i];
    }

    for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
      list3[j] = list2[i];	
    }

    sort(list3);

    return list3;
  }

  // The method "sort", sorts a list in ascending order, very
  //  similarly to how it was done in problem 7.20
  public static void sort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      int min = list[i];
      int minIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < min) {
          min = list[j];
          minIndex = j; 
		}					
	  }

      if (minIndex != i) {
        list[minIndex] = list[i];
        list[i] = min;
      }
    }
  }
}