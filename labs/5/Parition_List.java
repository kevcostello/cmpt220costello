/**
 * file: Parition_List.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 5, 7.32
 * due date: March 28, 2017
 *
 * This program will parition the elements in a list
 * so that all the elements beofre the pivot are less
 * than or equal to the pivot and elements after the pivot
 * are greater than the pivot
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Parition_List{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the list: ");
    int[] pivotArray = new int[input.nextInt()];
    insertNumber(pivotArray);
    System.out.print(Arrays.toString(pivotArray) + "\nPivot index:" + 
      parition(pivotArray) + "\n" + Arrays.toString(pivotArray));
    
    input.close();
  }
  public static void insertNumber(int[] pivotArray){
   
    Random randomNumber = new Random();
    for (int i = 0; i < pivotArray.length; ++i){
      pivotArray[i] = randomNumber.nextInt(100) + 1;
    }
     
  }
  
  public static int parition(int[] list){
    int pivot = list[0], pivotIndex = 0;
    for (int i = 1; 1 <list.length; ++i){
      int low = i;
      int tempNum;
      
      while (list[low] < pivot && pivotIndex < low){
        tempNum = list[low];
        list[low -1] = tempNum;
        --low;
        
        if (low == pivotIndex)
          pivotIndex = low + 1;
        
      }
    }
      
    return pivotIndex;
  }
}
 