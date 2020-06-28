import java.util.Scanner;
/**
*Calculates the area of a pyramid from user input of base and height.
*
*Project 2
*Elizabeth Dayton - Fundamentals of Computing - 001
*9/6/17
*/
public class AreaOfPyramid {
/**
*Calculates area of a pyramid.
*
*@param args Command line arguments - not used.
*/
   public static void main(String [] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      double base = 0;
      double slantHeight = 0;
      double area = 0;
      System.out.println("Enter values for base and slant height "
         + "of a pyramid: ");
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      System.out.println("\nA pyramid with base = " + base 
         + " and slant height = " + slantHeight  
         + " \nhas an area of " + (base * base + 4 * base * slantHeight / 2) 
         + " square units.");
   }
}