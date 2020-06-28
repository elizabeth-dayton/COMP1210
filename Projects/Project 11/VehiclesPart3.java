import java.io.FileNotFoundException;
/**
*reads in a file through command line arguements and prints some things.
*
*Project 11.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*12/6/17.
*/
public class VehiclesPart3 {

/**
*reads in a file through the command line arguements and prints.
*some information.
*
*@param args used.
*@throws FileNotFoundException used.
*/
   public static void main(String[] args) {
   
      UseTaxList utl = new UseTaxList();
        
      if (args.length == 0) {
         
         System.out.println("*** File name not provided by command line"
               + " argument.\nProgram ending.");
         
         return;
      }
      
      try {
         
         utl.readVehicleFile(args[0]);
         
      }
         
      catch (FileNotFoundException e) {
            
         System.out.println("*** File not found.\nProgram ending.");
            
         return;
            
      }
      
      System.out.println(utl.summary() + "\n");
      System.out.println(utl.listByOwner() + "\n");
      System.out.println(utl.listByUseTax() + "\n");
      System.out.println(utl.excludedRecordsList() + "\n");
   }
}