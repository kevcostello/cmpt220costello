/**
 * file: BMI.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Lab 7, 10.2
 * due date: April 25, 2017
 *
 * (The BMI class) Add the following new constructor in the BMI class:
 * Construct a BMI with the specified name, age, weight,  * feet,  
 * and inches
 * public BMI(String name, int age, double weight, double feet, 
 * double inches)
 */

public class bmiTest{
  public static void main(String[] args){
    //States my current information to be used to calculate my BMI
    BMI bmi = new BMI("Kevin", 19, 145, 5, 10);
    //Places my given information into a bmi.get so it can be inserted as a string
    System.out.printf("%s is age %s and is %s\" tall.%nHe has a weight of %s lbs.%nHis BMI description is %s.",
    bmi.getName(), bmi.getAge(), bmi.getHeight(), bmi.getWeight(), bmi.getDescription()) ;
    
  }
  
  // This class sets the conversion rate from kilograms to pounds
  // and meters to inches as well as intakes the required age, name
  // weight, and height and uses it to calculate the BMI and print out
  // the corresponding BMI description
  public static class BMI {
    static final double KILOGRAMS_PER_POUND = 0.4536;
    static final double METERS_PER_INCH = 0.0254;
    private final double weight;
    private final double height;
    private final String name;
    private final int age;
    
    
    BMI(String name, int age, double weight, double feet, double inches){
      this.height = (feet * 12) + inches;
      this.weight = weight;
      this.name = name;
      this.age = age;
    }    
    
    //Gives the proper description for each category of BMI
    public String getDescription() {
      double bmi = getBMI();
      if (bmi < 18.5)
        return "Underweight";
      else if (bmi <25)
        return "Normal Weight";
      else if (bmi < 30)
        return "Overweight";
      else
        return "Obese";
    } 
    
    //Caluclates the BMI using weight and height
    double getBMI(){
      double bmi = weight * KILOGRAMS_PER_POUND /
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100;
    }
    
    String getName(){
      return name;
    }
    
    int getAge(){
      return age;
    }
    
    double getWeight(){
      return weight;
    }
    
    double getHeight(){
      return height;
    }
  }
}