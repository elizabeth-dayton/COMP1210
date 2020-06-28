import java.text.DecimalFormat;
/**
*Spherocylinder.
*
*Project 4.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/9/17.
*/
public class Spherocylinder {
// instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
/**
*Spherocylinder constructor.
*
*@param labelIn used.
*@param radiusIn used.
*@param cylinderHeightIn used.
*/
   public Spherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
   }
//methods
/**
*gets the label string.
*
*@return String.
*/

   public String getLabel() {
      return label;
   }
/**
*checks for a label and sets it.
*
*@param labelIn used.
*@return boolean.
*/
   public boolean setLabel(String labelIn) {
      if (labelIn == null) { 
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
   *gets the radius double.
   *
   *@return double.
   */      
   public double getRadius() {
      return radius;
   }
/**
*checks for a negative radius and sets it.
*
*@param radiusIn used.
*@return boolean.
*/   
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*gets the cylinder height.
*
*@return double.
*/
   public double getCylinderHeight() {
      return cylinderHeight;
   }
/**
*checks for a negative cylinder height and sets it.
*
*@param cylinderHeightIn used.
*@return boolean.
*/
   public boolean setCylinderHeight(double cylinderHeightIn) {
      if (cylinderHeightIn > 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      else {
         return false;
      }
   }
/**
*calculates circumference.
*
*@return double.
*/   
   public double circumference() {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }
/**
*calculates surface area.
*
*@return double.
*/
   public double surfaceArea() {
      double surfaceArea = circumference() 
         * (2 * radius +  cylinderHeight);
      return surfaceArea;
   }
/**
*calculates volume.
*
*@return double.
*/
   public double volume() {
      double a = Math.pow(radius, 2);
      double b = a * Math.PI;
      double c = (4.0 / 3.0) * radius;
      double d = c + cylinderHeight;
      double volume = b * d;
      return volume;
   }
/**
*creates a string from all the info.
*
*@return String.
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + cylinderHeight + " has:"
         + "\n";
      output += "\tcircumference = " + df.format(circumference()) 
         + " units" + "\n";
      output += "\tsurface area = " + df.format(surfaceArea()) 
         + " square units" +  "\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}
