import java.text.DecimalFormat;
/**
*Motorcycle class that extends abstract vehicle class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17
*/
public class Motorcycle extends Vehicle {

//fields
   protected double engineSize;
/**
*normal tax rate for a motorcycle.
*/
   public static final double TAX_RATE = 0.005;
/**
*tax rate for a motorcylce that uses alternative fuel.
*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
/**
*sets threshold for a motorcylce to be considered large.
*/
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
/**
*tax rate for a large motorcycle.
*/
   public static final double LARGE_BIKE_TAX_RATE = 0.015;
   
/**
*constructor for a motorcycle that uses the vehicle classes constructor.
*
*@param ownerIn used.
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*@param engineSizeIn used.
*/
   public Motorcycle(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double engineSizeIn) {
   
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      engineSize = engineSizeIn;
   
   }
 
//methods 
   
/**
*gets the engine size.
*
*@return double.
*/
   public double getEngineSize() {
   
      return engineSize;
   
   }

/**
*sets the engine size.
*
*@param engineSizeIn used.
*/      
   public void setEngineSize(double engineSizeIn) {
   
      engineSize = engineSizeIn;
   
   }

/**
*calculates tax for a motorcycle.
*
*@return double.
*/
   public double useTax() {
   
      double totalUseTax;
      
      if (alternativeFuel) {
      
         totalUseTax = value * ALTERNATIVE_FUEL_TAX_RATE;
      
      }
      
      else {
      
         totalUseTax = value * TAX_RATE;
      
      }
      
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
      
         totalUseTax = totalUseTax + (value * LARGE_BIKE_TAX_RATE);
      }
   
      return totalUseTax;
   
   }
   
/**
*takes the toString method from the vehicle class and adds info.
*
*@return String.
*/ 
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = super.toString() + " Use Tax: " + df.format(useTax());
      output += "\nwith Tax Rate: ";
      
      if (alternativeFuel) {
         output += "0.0025";
      }
      else {
         output += "0.005";
      }
      
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         output += " Large Bike Tax Rate: 0.015";
      } 
   
      return output;
   
   }  
}