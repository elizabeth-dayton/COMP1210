import java.text.DecimalFormat;
/**
*Abstract vehicle class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17
*/
public abstract class Vehicle {

//fields
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   private static int vehicleCount;
   
/**
*constructor for the vehicle class.
*
*@param ownerIn used.
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*/
   public Vehicle(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn) {
   
      setOwner(ownerIn);
      setYearMakeModel(yearMakeModelIn);
      setValue(valueIn);
      setAlternativeFuel(alternativeFuelIn);
      vehicleCount++;
   
   }
   
//methods

/**
*gets the owner's name.
*
*@return String.
*/
   public String getOwner() {
   
      return owner;
   
   }
   
/**
*sets the owner's name.
*
*@param ownerIn used.
*/
   public void setOwner(String ownerIn) {
   
      owner = ownerIn;
   
   }
   
/**
*gets yearMakeModel.
*
*@return String.
*/
   public String getYearMakeModel() {
   
      return yearMakeModel;
   
   }
   
/**
*sets yearMakeModel.
*
*@param yearMakeModelIn used.
*/
   public void setYearMakeModel(String yearMakeModelIn) {
   
      yearMakeModel = yearMakeModelIn;
   
   }
   
/**
*gets value.
*
*@return double.
*/
   public double getValue() {
   
      return value;
   
   }
   
/**
*sets value.
*
*@param valueIn used.
*/
   public void setValue(double valueIn) {
   
      value = valueIn;
   
   }
   
/**
*gets alternativeFuel boolean value.
*
*@return boolean.
*/
   public boolean getAlternativeFuel() {
   
      return alternativeFuel;
   
   }
   
/**
*sets alternativeFuel boolean value.
*
*@param alternativeFuelIn used.
*/
   public void setAlternativeFuel(boolean alternativeFuelIn) {
   
      alternativeFuel = alternativeFuelIn;
   
   }
   
/**
*gets the number of vehicles created.
*
*@return int.
*/
   public static int getVehicleCount() {
   
      return vehicleCount;
   
   }
   
/**
*resets the number of vehicles created.
*/
   public static void resetVehicleCount() {
   
      vehicleCount = 0;
   
   }
   
/**
*abstract method that with calculate the total vehicle tax.
*
*@return double.
*/
   public abstract double useTax();
   
/**
*returns the information in a string.
*
*@return String.
*/
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = getOwner() + ": " + this.getClass().getName();
      
      output += " " + getYearMakeModel();
      
      if (getAlternativeFuel()) {
         output += " (Alternative Fuel)";
      } 
      
      output += "\nValue: " + df.format(getValue());
      
      return output;
   
   }
}