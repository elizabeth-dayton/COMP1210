import java.io.FileNotFoundException;
/**
*reads in a file through command line arguements and prints some things.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class VehiclesPart2 {

/**
*reads in a file through the command line arguements and prints.
*some information.
*
*@param args used.
*@throws FileNotFoundException used.
*/
   public static void main(String[] args)
      throws FileNotFoundException {
   
      UseTaxList utl = new UseTaxList();
      
      utl.readVehicleFile(args[0]);
      
      System.out.println(utl.summary() + "\n");
      System.out.println(utl.listByOwner() + "\n");
      System.out.println(utl.listByUseTax() + "\n");
      System.out.println(utl.excludedRecordsList() + "\n");
   }
}