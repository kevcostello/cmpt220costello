/**
 * file: findLocation.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 6, 9.13
 * due date: April 18, 2017
 *
 * This program will locate the largest numerical
 * value in a two dimensional array
 */
import java.util.Scanner;

public class findLocation{
  public static void main(String[] args) {
    final int ROWS = 0, COLUMNS = 1;
    int[] arraySize = promptArraySize();
    double[][] array = TwoDDoubleArray(arraySize[ROWS], arraySize[COLUMNS]);
    Location location = Location.locateLargest(array);
    System.out.println(location.toString());
  }

  private static int[] promptArraySize() {
    //Creates an array that will hold the values for the numbe of rows and columns
    int[] size = new int[2];
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    for (int i = 0; i < 2; i++) {
      size[i] = scanner.nextInt();
    }
      return size;
  }
  
  //Prompts the user to enter the array size and places the values for column and row
  private static double[][] TwoDDoubleArray(int rows, int columns) {
    double[][] m = new double[rows][columns];
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the array:");
    for (int r = 0; r < rows; r++) {
      for (int c = 0; c < columns; c++) {
        m[r][c] = scanner.nextDouble();
      }
    }
      return m;
  }
  
  //Allows for each point in a 2d array to charted
  private static class Location {
    public final int row;
    public final int column;
    final double maxValue;

    Location(int row, int column, double maxValue) {
      this.row = row;
      this.column = column;
      this.maxValue = maxValue;
    }
    //Appoints each value on the array a value for its corresponding row and column
    static Location locateLargest(double[][] a) {
      Location location = new Location(0, 0, a[0][0]);
      for (int r = 0; r < a.length; r++) {
        for (int c = 0; c < a[r].length; c++) {
          if (a[r][c] > location.maxValue)
            location = new Location(r, c, a[r][c]);
        }
      }
        return location;
    }
    
    //Locates the location of the largest value
    public String toString() {
      String formattedMaxValue;
      if (maxValue % 1.0 != 0)
        formattedMaxValue = String.format("%s", maxValue);
        else
          formattedMaxValue = String.format("%.0f", maxValue);
          return String.format("The location of the largest element is %s at (%d, %d)",
          formattedMaxValue, row, column);
    }
  }
}