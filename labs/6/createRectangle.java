/**
 * file: createRectangle.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 6, 9.1
 * due date: April 18, 2017
 *
 * This program will create two rectangle objects,
 * one with a width of 4 and height of 40 and
 * one with a width of 3.5 and a height of 35.9
 */
public class createRectangle {
  public static void main(String[] args) {
    //Create the two rectangles
    Rectangle rectangle1 = new Rectangle(40, 4);
    Rectangle rectangle2 = new Rectangle(35.9, 3.5);

    System.out.println("Rectangle 1");
    printRectangleData(rectangle1);

    System.out.println("Rectangle 2");
    printRectangleData(rectangle2);
  }
  
  //This method is used to print out all of the data
  public static void printRectangleData(Rectangle rectangle) {
    System.out.println("--------------");
    System.out.println("Width:    " + rectangle.getWidth());
    System.out.println("Height:   " + rectangle.getHeight());
    System.out.println("Area:     " + rectangle.getArea());
    System.out.println("Perimeter " + rectangle.getPerimeter());
    System.out.println();
  }
  

  public static class Rectangle {
    double width;
    double height;

    //Sets the default size of the rectangle
    public Rectangle() {
      width = 1;
      height = 1;
    }

    public Rectangle(double height, double width) {
      this.height = height;
      this.width = width;
    }

    double getWidth() {
      return width;
    }

    void setWidth(double width) {
      this.width = width;
    }

    double getHeight() {
      return height;
    }
    
    void setHeight(double height) {
      this.height = height;
    }
    //Calculate area
    double getArea() {
      return width * height;
    }
    //Calculate perimeter
    double getPerimeter() {
      return width + width + height + height;
    }
  }
}