import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
*Creates a SpherocylinderList2 class that stores. 
*the name of the list and an ArrayList of. 
*Spherocylinder objects.
*
*Project 6.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/18/17.
*/
public class SpherocylinderList2 {
//instance variables
   private String listName = "";
   private Spherocylinder[] spheroList;
   private int numberOfSpherocylinders;
 /**
 *SpherocylinderList2 constructor.
   *
   *@param listNameIn used.
   *@param listIn used.
   *@param numberOfSpherocylinderIn used.
   */
   public SpherocylinderList2(String listNameIn, 
      Spherocylinder[] listIn, int numberOfSpherocylindersIn) {
      listName = listNameIn;
      spheroList = listIn;
      numberOfSpherocylinders = numberOfSpherocylindersIn;
   }
 //methods
 /**
 *Gets the name of the list.
 *
 *@return String.
 */
   public String getName() {
      return listName;
   }
   /**
   *Counts number of spherocylinders in list.
   *
   *@return int.
   */
   public int numberOfSpherocylinders() {
      if (numberOfSpherocylinders > 0) {
         return numberOfSpherocylinders;
      }
      else {
         return 0;
      }
   }
   /**
   *Computes total surface area of all spherocylinders.
   *in list.
   *
   *@return double.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfaceArea = 0;
      if (numberOfSpherocylinders > 0) {
         while (index < numberOfSpherocylinders) {
            totalSurfaceArea 
               += spheroList[index].surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Computes total volume of spherocylinders in list.
   *
   *@return double.
   */
   public double totalVolume() {
      int index = 0;
      double totalVolume = 0;
      if (numberOfSpherocylinders > 0) { 
         while (index < numberOfSpherocylinders) {
            totalVolume += spheroList[index].volume();
            index++;
         }
         return totalVolume;
      }
      else {
         return 0.0;
      }
   
   }
   /**
   *Computes average surface area of spherocylinders in list.
   *
   *@return double.
   */
   public double averageSurfaceArea() {
      if (numberOfSpherocylinders > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea() 
            / (numberOfSpherocylinders);
         return averageSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Computes average volume of spherocylinders in list.
   *
   *@return double
   */
   public double averageVolume() {
      if (numberOfSpherocylinders > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (numberOfSpherocylinders);
         return averageVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   *creates a string of all the spherocylinders in list.
   *
   *@return String.
   */
   public String toString() {
      int index = 0;
      String output = listName + "\n"; 
      while (index < numberOfSpherocylinders) {
         output += "\n" + spheroList[index].toString() + "\n";
         index++;
      }
      return output;
   }
   /**
   *creates a string of all the computed info.
   *
   *@return String.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n";
      output += "Number of Spherocylinders: " + numberOfSpherocylinders() 
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea()) 
         + "\n";
      output += "Average Volume: " + df.format(averageVolume()) + "\n"; 
      return output;
   }
   /**
   *returns the list of spherocylinders.
   *
   *@return Array.
   */
   public Spherocylinder[] getList() {
      return spheroList;
   }
   /**
   *reads in a file and creates a list of spherocylinders.
   *
   *@return Array.
   *@param fileNameIn used.
   *@throws FileNotFoundException required by Scanner for file.
   */
   public SpherocylinderList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
   
      String label = "";
      double radius = 0;
      double cylinderHeight = 0;
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Spherocylinder[] myList = new Spherocylinder[numberOfSpherocylinders];
      String sListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         cylinderHeight = Double.parseDouble(scanFile.nextLine());
         Spherocylinder s = new Spherocylinder(label, radius, cylinderHeight);
         myList[numberOfSpherocylinders] = s;
         numberOfSpherocylinders++;
      }
      
      SpherocylinderList2 mySpherocylinderList 
         = new SpherocylinderList2(listName, myList, numberOfSpherocylinders);
         
      return mySpherocylinderList;
   }
   /**
   *adds a spherocylinder to the spheroList.
   *
   *@param labelIn used.
   *@param radiusIn used.
   *@param cylinderHeightIn used.
   */
   public void addSpherocylinder(String labelIn, double radiusIn,
      double cylinderHeightIn) {
      
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn, 
         cylinderHeightIn);
      
      spheroList[numberOfSpherocylinders] = s;
      numberOfSpherocylinders++;
   }
   /**
   *finds a spherocylinder in spheroList based on the label.
   *
   *@param labelIn used.
   *@return Spherocylinder.
   */
   public Spherocylinder findSpherocylinder(String labelIn) {
     
   
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         if (labelIn.equalsIgnoreCase(spheroList[i].getLabel())) {
            return spheroList[i];
         }
      }
      return null;
   }
   /**
   *finds and deletes a Spherocylinder from spheroList.
   *
   *@param labelIn used.
   *@return Spherocylinder.
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      int i = 0;
      for (Spherocylinder s : spheroList) {
         if (labelIn.equalsIgnoreCase(s.getLabel())) {
            for (int j = i; j < numberOfSpherocylinders - 1; j++) {
               spheroList[j] = spheroList[j + 1];
            }
            spheroList[numberOfSpherocylinders - 1] = null;
            numberOfSpherocylinders--;
            return s;
         }
      }
      
      return null;
   
   
   } 
   /**
   *finds and edits a spherocylinder in spheroList.
   *
   *@param labelIn used.
   *@param radiusIn used.
   *@param cylinderHeightIn used.
   *@return boolean.
   */
   public boolean editSpherocylinder(String labelIn, double radiusIn,
      double cylinderHeightIn) {
      
      boolean result = false;
      
      for (Spherocylinder s : spheroList) {
         if (labelIn.equalsIgnoreCase(s.getLabel())) {
            s.setRadius(radiusIn);
            s.setCylinderHeight(cylinderHeightIn);
            result = true;
         }
      }
      return result;
   }
}