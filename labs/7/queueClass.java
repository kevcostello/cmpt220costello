/**
 * file: BMI.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 7, 10.10
 * due date: April 25, 2017
 *
 * This program will design a class named Queue for storing integers. Like a stack, a queue holds elements.
 * In a stack, the elements are retrieved in a last-in first-out fashion. 
 * In a queue, the elements are retrieved in a first-in first-out fashion.
 *
 * UML Diagram
 *
 *********************
 *       Queue       *
 *********************
 *  startQueue: void *
 *  endQueue: int    *
 *  empty: boolean   *
 *  getSize: int     *
 *********************
 */

public class queueClass{
  public static void main(String[] args){
    
    //Set the class with the initial array
    Queue queue = new Queue();
    
    //Adds 1-20 into the queue
    for (int i = 1; i <= 20; i++) {
      queue.startQueue(i);
    }
    
    //remove numbers and then display them
    while (queue.getSize() > 0) {
      System.out.println(queue.endQueue());
    }
  }
  // This class will set the starting limit of the array to 8
  // and then double each time the limit is reached
  private static class Queue {
    private int[] elements;
    private int size;
    
    Queue() {
      this(8);
    }
    
    //Creates an array for the starting capacity
    Queue(int startingCapacity) {
      elements = new int[startingCapacity];  
    }
    
    void startQueue(int j) {
      if (size >= elements.length){
        //Doubles the limit of the array when the limit is reached
        int[] temp = new int[elements.length * 2];
        //Gives each element a position
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
      }
      elements[size++] = j;
    }
    
    //Shifts all elements to the left once one is removed
    int endQueue() {
      int element = elements[0];
      size--;
      System.arraycopy(elements, 1, elements, 0, size);
      return element; 
    }
    
    boolean empty() {
      return size == 0;      
    }
    
    int getSize() {
      return size;
    }
  }
}