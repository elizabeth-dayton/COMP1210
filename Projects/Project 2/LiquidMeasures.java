import java.util.Scanner;
/**
*Converts ounces to barrels, gallons, quarts, and ounces.
*
*Project 2
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/6/17
*/
public class LiquidMeasures {
/**
*Converts ounces to barrels, gallons, quarts, and ounces.
*
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int ounces = 0; 
      System.out.print("Enter amount of liquid in ounces: ");
      ounces = userInput.nextInt();
      if (ounces > 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else { 
         System.out.println("Measures by volume:");
         System.out.println("\tBarrels: " + ounces / 5376);
         System.out.println("\tGallons: " + ounces % 5376 / 128);
         System.out.println("\tQuarts: " + ounces % 5376 % 128 / 32);
         System.out.println("\tOunces: " + ounces % 5376 % 128 % 32);
         System.out.print(ounces + " oz = (" + ounces / 5376 
            + " bl * 5376 oz) + ("
            + ounces % 5376 / 128 + " gal * 128 oz) + (" 
            + ounces % 5376 % 128 / 32 
            + " qt * 32 oz) + (" + ounces % 5376 % 128 % 32 + " oz)");   
      }
   }
}
