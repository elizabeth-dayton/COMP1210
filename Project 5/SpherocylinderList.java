import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*Creates a SpherocylinderList class that stores. 
*the name of the list and an ArrayList of. 
*Spherocylinder objects.
*
*Project 5.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/9/17.
*/
public class SpherocylinderList {
//instance variables
   private String listName = "";
   private ArrayList<Spherocylinder> spheroList 
      = new ArrayList<Spherocylinder>();
 /**
 *SpherocylinderList constructor.
   *
   *@param listNameIn used.
   *@param listIn used.
   */
   public SpherocylinderList(String listNameIn, 
      ArrayList<Spherocylinder> listIn) {
      listName = listNameIn;
      spheroList = listIn;
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
      if (spheroList.size() > 0) {
         return spheroList.size();
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
      if (spheroList.size() > 0) {
         while (index < spheroList.size()) {
            totalSurfaceArea 
               += spheroList.get(index).surfaceArea();
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
      if (spheroList.size() > 0) { 
         while (index < spheroList.size()) {
            totalVolume += spheroList.get(index).volume();
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
      if (spheroList.size() > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea() 
            / (spheroList.size());
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
      if (spheroList.size() > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (spheroList.size());
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
      while (index < spheroList.size()) {
         output += "\n" + spheroList.get(index).toString() + "\n";
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
}