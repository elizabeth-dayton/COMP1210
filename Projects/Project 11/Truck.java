import java.text.DecimalFormat;
/**
*Truck class that extends abstract vehicle class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17
*/
public class Truck extends Vehicle {

//fields
   protected double tons;
/**
*normal tax rate for trucks.
*/
   public static final double TAX_RATE = 0.02;
/**
*tax rate for trucks that use alternative fuel.
*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
/**
*threshold for a truck to be considered large.
*/
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
/**
*tax rate for trucks above the large truck threshold.
*/
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;

/**
*constructor for the truck class that uses the vehicle classes constructor.
*
*@param ownerIn used.
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*@param tonsIn used.
*@throws NegativeValueException used.
*/
   public Truck(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double tonsIn)
      throws NegativeValueException {
      
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      tons = tonsIn;
      
      if (tons < 0) {
      
         Vehicle.vehicleCount--;
      
         throw new NegativeValueException();
      
      } 
      
   }
   
//methods   
   
/**
*gets the tonnage.
*
*@return double.
*/
   public double getTons() {
   
      return tons;
   
   }
   
/**
*sets the tonnage.
*
*@param tonsIn used.
*/
   public void setTons(double tonsIn) {
   
      tons = tonsIn;
   
   }
   
/**
*calculates the tax for the truck.
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
      
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
      
         totalUseTax = totalUseTax + (value * LARGE_TRUCK_TAX_RATE);
      
      }
      
      return totalUseTax;
   
   }
 
/**
*takes the toString method from the vehicle class and adds.
*additional information onto the end.
*
*@return String.
*/   
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = super.toString() + " Use Tax: " + df.format(useTax());
      output += "\nwith Tax Rate: ";
      
      if (alternativeFuel) {
         output += "0.01";
      }
      else {
         output += "0.02";
      }
      
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         output += " Large Truck Tax Rate: 0.03";
      } 
   
   
      return output;
   }          
}