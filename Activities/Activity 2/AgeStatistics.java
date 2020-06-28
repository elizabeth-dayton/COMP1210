import java.util.Scanner;
/**
*Prompts user for name, age in years, and female or male.
*Then, gives the user their age in minutes and centuries.
*It also gives the user their max heart rate.
*
*Activity 2.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/6/17.
*/
public class AgeStatistics {
/**
*Collects users name, age, and gender and gives back.
*age in minutes and centuries as well as max heart rate.
*
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      System.out.print("Your max heart rate is ");
      if (gender == 1) {
         System.out.print(209 - (0.7 * ageInYears));
      }
      else {
         System.out.print(214 - (0.8 * ageInYears));
      }
      System.out.print(" beats per minute.");
   }
}