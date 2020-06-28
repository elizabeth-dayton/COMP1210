import java.util.Scanner;
/**
*Spherocylinder App.
*
*Project 4.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/27/17.
*/
public class SpherocylinderApp {
/**
*prompts user for info and provides some info in return.
*
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, radius, and cylinder height" 
         + " for a spherocylinder.");
      System.out.print("\tlabel: ");
      //prompts user for label
      String label = userInput.nextLine();
      System.out.print("\tradius: ");
      //prompts user for radius
      String r = userInput.nextLine();
      //converts String r to a double
      double radius = Double.parseDouble(r);
      //checks to make sure inputted radius is positive
      if (radius < 0.0) {
         System.out.print("Error: radius must be non-negative.");
      }
      else {
         System.out.print("\tcylinder height: ");
      //prompts user for cylinder height
         String cH = userInput.nextLine();
      //converts string cH into a double
         double cylinderHeight = Double.parseDouble(cH);
      //checks to make sure inputted cylinder height is positive
         if (cylinderHeight < 0.0) {
            System.out.print("Error: cylinder height must be non-negative.");
         }
         else {
            Spherocylinder sc1 = 
               new Spherocylinder(label, radius, cylinderHeight);
            System.out.print("\n" + sc1 + "\n");
         }
      }
   }
}
