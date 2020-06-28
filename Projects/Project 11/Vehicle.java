import java.text.DecimalFormat;
/**
*Abstract vehicle class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public abstract class Vehicle implements Comparable<Vehicle> {

//fields
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   protected static int vehicleCount;
   
/**
*constructor for the vehicle class.
*
*@param ownerIn used.
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*@throws NegativeValueException used.
*/
   public Vehicle(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn)
      throws NegativeValueException {
   
      setOwner(ownerIn);
      setYearMakeModel(yearMakeModelIn);
      setValue(valueIn);
      setAlternativeFuel(alternativeFuelIn);
      vehicleCount++;
      
      if (value < 0) {
      
         vehicleCount--;
      
         throw new NegativeValueException();
      
      }
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
  
/**
*compares two vehicles based on owner's name.
*
*@param vehicleIn used.
*@return int.
*/   
   public int compareTo(Vehicle vehicleIn) {
   
      return getOwner().toLowerCase()
          .compareTo(vehicleIn.getOwner().toLowerCase());
   
   }
   
   /**
*determines if two vehicles are equal.
*
*@param obj used. 
*@return boolean.
*/
   public boolean equals(Object obj) {
   
      if (!(obj instanceof Vehicle)) {
       
         return false;
         
      }
      
      else {
      
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel + other.value);
            
      } 
   }
   
   /**
   *hashCode required by Checkstyle.
   *
   *@return int. 
   */
   public int hashCode() { 
      return 0;
   }   
}   
