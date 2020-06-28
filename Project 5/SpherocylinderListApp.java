import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
*
*
*Project 5.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/9/17.
*/
public class SpherocylinderListApp {
/**
*Reads and does computations with info from a file.
*
*@param args not used.
*@throws FileNotFoundException required by Scanner for file.
*/
   public static void main(String[] args)
      throws FileNotFoundException {
      String label = "";
      double radius = 0;
      double cylinderHeight = 0;
      ArrayList<Spherocylinder> myList 
         = new ArrayList<Spherocylinder>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         cylinderHeight = Double.parseDouble(scanFile.nextLine());
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList.add(s);
      }
      scanFile.close();
      SpherocylinderList mySpherocylinderList 
         = new SpherocylinderList(listName, myList);
   
      System.out.println("\n" + mySpherocylinderList);
      
      System.out.println("\n" + mySpherocylinderList.summaryInfo());
   }
}
