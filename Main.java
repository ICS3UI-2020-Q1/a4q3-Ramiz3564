 import java.util.Scanner;
/**
 *This program calculates the sum of a positive integer from 1 up to the number
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for input 
    Scanner input = new Scanner(System.in); 
    //prompt user for integer
    System.out.println("Please enter to count down to");

    int integer = input.nextInt();  
    //create a  variable to keep track of the number 
    int count = 0; 
    //the accumulator to add to the count into  
    int sum = 0; 
    //using loop to count up to the sum
    while(count <= integer){
      //print starting number
      System.out.println(count);
      //adding the sum from 1 to whatever the user int is
      sum = sum + count ; 
      //increase value by 1
      count = count + 1;
    }
    
    
    //Tell the user the sum from 1 to whatever
    System.out.println("the sum from 1 - " + integer + " is " + sum); 



  }
}
