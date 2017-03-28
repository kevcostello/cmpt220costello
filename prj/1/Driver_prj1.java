/**
 * file: Driver_prj1.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Project 1
 * due date: March 28, 2017
 *
 * This program will filter out static data by convoluting two arrays
 */
import java.util.Scanner;
import java.util.Arrays;

public class Driver_prj1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt user to input the array lengths
    System.out.print("Please enter the length of array 1: ");
    int vFirstLength = input.nextInt();
    System.out.print("Please enter the length of array 2: ");
    int vSecondLength = input.nextInt();

    // Prompt the user to input the numbers in the first array
    System.out.print("Please enter the numbers in array 1: ");
    double[] vFirst = new double[vFirstLength];
    for(int i = 0; i <vFirst.length; i++){
      vFirst[i] = input.nextDouble();
    }

    // Prompt the user to input the number in the second array
    System.out.print("Please enter the numbers in array 2: ");
    double[] vSecond = new double[vSecondLength];
    for(int i = 0; i <vSecond.length; i++){
      vSecond[i] = input.nextDouble();
    }

    // Call method and store it in a double array
    double[] answer = convolveVectors(vFirst, vSecond);

    // Create a new array so "answer" can be casted as an int without any data loss
    int[] convolution = new int[answer.length];
    for(int i = 0; i < answer.length; i++){
      convolution[i] = (int)Math.round(answer[i]);
    }

    // Displays the answer as int values
    for(int v: convolution){
      System.out.print(v + " ");
    }

    // Why didn't the skeleton go to the party?
    // Because he had noBODY to go with!
    
    // Creates a line for display
    System.out.println();
  }
  // This method will be comprised of most of the math and actually creating the convolution.
  // The method will create a new array to store the length of the final convolution
  // which will then be flipped and used in finding the final convolution by making sure everything
  // is in bounds
  public static double[] convolveVectors(double[] vFirst, double[] vSecond) {

    // Declare a new array to store the max length of the convolution
    double[] cResult = new double[(vFirst.length + vSecond.length) - 1];

    // Flips the second array (vSecond)
    for(int i = 0; i < cResult.length / 2; i++){
      double temp = cResult[i];
      cResult[i] = cResult[cResult.length - i - 1];
      cResult[cResult.length - i - 1] = temp;
    }

    // Preforms the convolution
    for(int idx = 0; idx < cResult.length; idx++){
      cResult[idx] = 0;
      // Checks every index in the array
      for(int shift = 0; shift <= idx; shift++){
        // Checks the shifts to make sure the index is within bounds
        if((idx-shift >= 0) && (shift <= idx)  && (idx - shift < vFirst.length)
          && (shift < vSecond.length))
          cResult[idx] += vFirst[idx-shift] * vSecond[shift];
      }
    }
    return cResult;
  }
}