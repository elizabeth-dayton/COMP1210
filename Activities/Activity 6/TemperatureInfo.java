import java.util.Scanner;
import java.util.ArrayList;
/**
*Temperatures Info.
*
*Activity 6.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/16/17.
*/
public class TemperatureInfo {
/**
*Creates a list of temperatures from inputs from the user.
*Then gives the user a menu to choose options from.
*
*@param args not used.
*/
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = scan.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      }
      while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      }
      while (choice != 'E');
   }
}