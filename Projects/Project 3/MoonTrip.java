import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
*Accepts coded trimmedticket information to the moon and back and includes 
*the date, time, category, price, and seat, followed by the 
*description of the travel.
*
*Project 3.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/20/17.
*/
public class MoonTrip {
/**
*Takes and interprets trimmedticket information.
*
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String date = "";
      String time = "";
      String seat = "";
      String itinerary = "";
      String price = "";
      double pricee = 0;
      char category = '\0';
      double cost = 0;
      int prize = 0;
      System.out.print("Enter ticket code: ");
      String ticket = userInput.nextLine();
      String trimmedticket = ticket.trim();
      if (trimmedticket.length() < 26) {
         System.out.println("\n*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else {
         date = trimmedticket.substring(0, 2) + "/" 
            + trimmedticket.substring(2, 4) 
            + "/" + trimmedticket.substring(4, 8);
         time = trimmedticket.substring(8, 10) + ":" 
            + trimmedticket.substring(10, 12);
         seat = trimmedticket.substring(22, 25);
         itinerary = trimmedticket.substring(25);
         System.out.println("\nDate: " + date + "   Time: " 
            + time + "   Seat: " + seat);
         System.out.println("Itinerary: " + itinerary);
      //pricee is a double and price is a string
         price = trimmedticket.substring(13, 20) + "." 
            + trimmedticket.substring(20, 22);
         pricee = Double.parseDouble(price);
         DecimalFormat priceeformatted = new DecimalFormat("$#,###.00");
      //categorry is a char and category is a string
         category = trimmedticket.charAt(12);
         if (category == 's') {
            cost = pricee * .6; 
         }
         else if (category == 'e') {
            cost = pricee * .8;
         }
         else {
            cost = pricee;
         }
         System.out.println("Price: " + priceeformatted.format(pricee)
            + "   Category: " + category + "   Cost: " 
            + priceeformatted.format(cost));  
         Random generator = new Random();
         prize = generator.nextInt(9998) + 1;
         DecimalFormat prizee = new DecimalFormat("0000");
         System.out.println("Prize Number: " + prizee.format(prize));
      }
   } 
}