import java.text.DecimalFormat;
/**
*Car class that extends abstract vehicle class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class Car extends Vehicle {

//fields
/**
*normal tax rate for cars.
*/
   public static final double TAX_RATE = 0.01;
/**
*tax rate for cars with an alternativeFuel.
*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
/**
*price point at which a car is considered luxury.
*/   
   public static final double LUXURY_THRESHOLD = 50000;
/**
*tax rate for luxury cars.
*/
   public static final double LUXURY_TAX_RATE = 0.02;
   
/**
*constructor for the car class that uses the vehicle classes constructor.
*
*@param ownerIn used.
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*/
   public Car(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn) {
   
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
   
   }
   
//methods   
   
/**
*calculates the tax for the car.
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
      
      if (value > LUXURY_THRESHOLD) {
      
         totalUseTax = totalUseTax + (value * LUXURY_TAX_RATE);
      
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
         output += "0.005";
      }
      else {
         output += "0.01";
      }
      
      if (value > LUXURY_THRESHOLD) {
         output += " Luxury Tax Rate: 0.02";
      } 
   
      return output;
   }         
}