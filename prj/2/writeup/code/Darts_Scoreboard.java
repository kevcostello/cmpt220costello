/**
 * file: FP2.java
 * author: Kevin Costello
 * course: CMPT 220
 * assignment: Final Project
 * due date: May 8, 2017
 *
 * This program will display and calculate the running scores for
 * a game of cricket in darts. The program will track two players scores
 * and continue to update the score board each for each turn untill the win
 * conditions are met.
 */
import java.util.Scanner;
public class Darts_Scoreboard{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    
    int score;
    int turnCounter = 0;
    
    //Total Scores for player 1 and 2
    int total = 0;
    int total2 = 0;
    int i = 2;
    
    //Initializes the number of score characters to 0 for player 1
    int charC20 = 0;
    int charC19 = 0;
    int charC18 = 0;
    int charC17 = 0;
    int charC16 = 0;
    int charC15 = 0;
    
    //Initializes the number of score characters to 0 for player 2
    int charC202 = 0;
    int charC192 = 0;
    int charC182 = 0;
    int charC172 = 0;
    int charC162 = 0;
    int charC152 = 0;
    
    //Initializes the values for incrementing the total score
    int v20 = 20;
    int v19 = 19;
    int v18 = 18;
    int v17 = 17;
    int v16 = 16;
    int v15 = 15;
    
    String character = "O";
    
    //Creates strings that will hold the score character for player 1
    String s20 = "";
    String s19 = "";
    String s18 = "";
    String s17 = "";
    String s16 = "";
    String s15 = "";
    
    //Creates strings that will hold the score character for player 2
    String s202 = "";
    String s192 = "";
    String s182 = "";
    String s172 = "";
    String s162 = "";
    String s152 = "";
    
    //Displays the start screen
    System.out.println("\n \n");
    System.out.println("        **********************");
    System.out.println("        *Press Enter to Start*");
    System.out.println("        **********************");
    System.out.println("\n \n");
    pressEnterToContinue();
    
    
    
    //Re-runs the code untill each number has been hit at least 3 times for either player (Establish win conditions)
    while ((charC20 < 3) | (charC19 < 3) | (charC18 < 3) | (charC17 < 3) | (charC16 < 3) | (charC15 < 3) && (charC202 < 3) |
      (charC192 < 3) | (charC182 < 3) | (charC172 < 3) | (charC162 < 3) | (charC152 < 3)){
      //Resets the scoreCounter to 0 every turn
      int scoreCounter = 0;
      //Prompts the user to enter the number hit each time
      System.out.println("\nPlease enter your scores one at a time: ");
     
      //States which players turn it is
      if (turnCounter % 2 == 0){
        System.out.println("It is Player 1's turn: ");
      }
      else if (turnCounter % 2 != 0){
        System.out.println("It is Player 2's turn: ");
      }
     
     //Takes in 3 numbers as only 3 darts would be thrown
      while (scoreCounter < 3){
        //If something other than a number is entered, program will exit. This is totally a feature.
        if (!input.hasNext("[0-9]+")){
          System.out.println("\nPlease only enter numerical entries. Program will now exit.\n");
        }
        score = input.nextInt(); 
        
        //These same comments apply for each success number
        //If the turn number is even, it is player 1's turn
        if (turnCounter % 2 == 0){
          //This switch statement only accepts entries 15-20
          switch(score){
            //If the number entered is 20 the program will proceed
            case 20:
              System.out.println("You scored 20");
              //If there arent 3 characters next to the score, add one more
              if (charC20 < 3){
                s20 += character;
              }
              //If there are 3 characters and player two doesnt have 3, add the value of the entered number to the total
              else if ((charC20 >= 3) && (charC202 < 3)){
                Integer.toString(total);
                total = total + 20;
              }
              //Increment charC20 by 1
              charC20++;           
              break;
            case 19:
              System.out.println("You scored 19");
              if (charC19 < 3){ 
                s19 += character;
              }
              else if((charC19 >= 3) && (charC192 < 3)){
                Integer.toString(total);
                total = total + 19;
              }
              charC19++;
              break;
            case 18:
              System.out.println("You scored 18");
              if (charC18 < 3){ 
                s18 += character;
              }
              else if ((charC18 >= 3) && (charC182 < 3)){
                Integer.toString(total);
                total = total + 18;
              }
              charC18++;
              break;
            case 17:
              System.out.println("You scored 17");
              if (charC17 < 3){ 
                s17 += character;
              }
              else if ((charC17 >= 3) && (charC172 < 3)){
                Integer.toString(total);
                total = total + 17;
              }
              charC17++;
              break;
            case 16:
              System.out.println("You scored 16");
              if (charC16 < 3){ 
                s16 += character;
              }
              else if ((charC16 >= 3) && (charC162 < 3)){
                Integer.toString(total);
                total = total + 16;
              }
              charC16++;
              break;
            case 15:
              System.out.println("You scored 15");
              if (charC15 < 3){                  
                s15 += character;
              }
              else if ((charC15 >= 3) && (charC152 < 3)){
                Integer.toString(total);
                total = total + 15;
              }
              charC15++;
              break;
            default:
              System.out.println("Not a valid score.");
          }
        }
        else if (turnCounter % 2 != 0){
          switch(score){
            case 20:
              System.out.println("Player 2 scored 20"); 
              if (charC202 < 3){
                s202 += character;
              }            
              else if ((charC202 >= 3) && (charC20 < 3)){
                Integer.toString(total2);
                total2 = total2 + 20;
              }              
            charC202++;
            break;
            case 19:
              System.out.println("Player 2 scored 19"); 
              if (charC192 < 3){
                s192 += character;
              }            
              else if ((charC192 >= 3) && (charC19 < 3)){
                Integer.toString(total2);
                total2 = total2 + 19;
              }              
            charC192++;
            break;
            case 18:
              System.out.println("Player 2 scored 18"); 
              if (charC182 < 3){
                s182 += character;
              }            
              else if ((charC182 >= 3) && (charC18 < 3)){
                Integer.toString(total2);
                total2 = total2 + 18;
              }              
            charC182++;
            break;
            case 17:
              System.out.println("Player 2 scored 17"); 
              if (charC172 < 3){
                s172 += character;
              }            
              else if ((charC172 >= 3) && (charC17 < 3)){
                Integer.toString(total2);
                total2 = total2 + 17;
              }              
            charC172++;
            break;
            case 16:
              System.out.println("Player 2 scored 16"); 
              if (charC162 < 3){
                s162 += character;
              }            
              else if ((charC162 >= 3) && (charC16 < 3)){
                Integer.toString(total2);
                total2 = total2 + 16;
              }              
            charC162++;
            break;
            case 15:
              System.out.println("Player 2 scored 15"); 
              if (charC152 < 3){
                s152 += character;
              }            
              else if ((charC152 >= 3) && (charC15 < 3)){
                Integer.toString(total2);
                total2 = total2 + 15;
              }              
            charC152++;
            break;
          }
        }
      //Increases the score counter after each number is entered        
      scoreCounter++;  
      }
      //Prints out the scoreboard
      System.out.println("\n**************************");
      System.out.println("       Score Board        ");
      System.out.println("**************************");
      System.out.println("         Player 1         ");
      System.out.println(" 20   " + s20              );
      System.out.println(" 19   " + s19              );
      System.out.println(" 18   " + s18              );
      System.out.println(" 17   " + s17              );
      System.out.println(" 16   " + s16              );
      System.out.println(" 15   " + s15              );
      System.out.println("**************************");
      System.out.println(" Total Score: " + total    );
      System.out.println("**************************");
      System.out.println("         Player 2         ");
      System.out.println("20    " + s202             );
      System.out.println("19    " + s192             );
      System.out.println("18    " + s182             );
      System.out.println("17    " + s172             );
      System.out.println("16    " + s162             );
      System.out.println("15    " + s152             );
      System.out.println("**************************");
      System.out.println(" Total Score: " + total2   );
      System.out.println("**************************");
      //Increases the turn counter by 1 after each instance
      turnCounter++;
    }
    
    if((charC20 >= 3) | (charC19 >= 3) | (charC18 >= 3) | (charC17 >= 3) | (charC16 >= 3) | (charC15 >= 3) && (total > total2)){
      System.out.println("Congratulations!!!! Player 1 Wins!");  
    }
    else if((charC202 >= 3) | (charC192 >= 3) | (charC182 >= 3) | (charC172 >= 3) | (charC162 >= 3) | (charC152 >= 3) && (total2 > total))
      System.out.println("Congratulations!!!! Player 2 Wins!");
  } 
  
  //Start the system when the enter key is pressed
  private static void pressEnterToContinue(){
    Scanner keyboard = new Scanner(System.in);
    keyboard.nextLine();
    
  }
}