/**
 * file: Circle2DClass.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 7, 10.17
 * due date: April 25, 2017
 *
 * This program will create a class Circle2D that will
 * create an object c1(new Circle2D(2, 2, 5.5), and displays
 * its area dna perimter and displays the results
 *
 * UML Diagram
 *
 *************************
 *      Cirlce2D         *
 *************************
 *  getX(): double       *
 *  getY(): double       *
 *  getRadius: double    *
 *  getArea: double      *
 *  getPerimeter: double *
 *  cotains: boolean     *
 *  overlaps: boolean    *
 *  distance: double     *
 *************************
 */
 
public class Circle2DClass {
  public static void main(String[] args) {
    Circle2D c1 = new Circle2D(2, 2, 5.5
    //Prints out area and perimeter of the circle;
    System.out.println("Circle2D c1: ");
    System.out.println("Area: " + c1.getArea());
    System.out.println("Perimeter: " + c1.getPerimeter());
    //Prints out wether or not the circle contains or overlaps the other circle
    System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
    System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
    System.out.println("c1.overlaps(newCircle2D(3, 5, 2.3))): " + c1.overlaps(new Circle2D(3, 5, 2.3)));    
  }
  
  //This class will calculate out the radius, area, and perimeter of
  // a 2-dimensional circle and compare it to see if it is within or
  // at least overlaps another circle
  private static class Circle2D {
    private final double x;
    private final double y;
    private final double radius;
    
    //Default values for circle
    Circle2D() {
      this(0, 0, 1);
    }
    
    Circle2D(double x, double y, double radius){
      this.x = x;
      this.y = y;
      this.radius = radius;
    }
    
    double getX() {
      return x;
    }
    
    double getY() {
      return y;
    }
    
    double getRadius() {
      return radius;
    }
    
    //Calculates the area
    double getArea() {
      return Math.PI * radius * radius;
    }
    
    //Calculates the perimeter
    double getPerimeter() {
      return 2 * Math.PI * radius;
    }
    
    boolean contains(double x, double y){
      return distance(x, y) < radius;
    }
    
    //Calculates wether or not the circle is contained in the other
    boolean contains(Circle2D circle){
      return distance(circle.x, circle.y) <= Math.abs(radius - circle.radius);
    }
    
    //Calculates wether or not the two circles overlap
    boolean overlaps(Circle2D circle){
      return distance(circle.x, circle.y) <= radius + circle.radius
        && !contains(circle);
    }
    
    double distance(double x, double y) {
      return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
  }
}