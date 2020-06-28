/**
*SemiTractorTrailer class that extends truck class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17
*/
public class SemiTractorTrailer extends Truck {

//fields
   protected int axles;
/**
*tax rate per axle for SemiTractorTrailer.
*/
   public static final double PER_AXLE_TAX_RATE = 0.005;

/**
*constructor for the SemiTractorTrailer class that uses the. 
*truck classes constructor.
*
*@param ownerIn used. 
*@param yearMakeModelIn used.
*@param valueIn used.
*@param alternativeFuelIn used.
*@param tonsIn used.
*@param axlesIn used.
*/
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, double tonsIn, int axlesIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn, tonsIn);
      axles = axlesIn; 
      
   }
   
//methods   

/**
*gets the number of axles.
*
*@return int.
*/
   public int getAxles() {
   
      return axles;
   
   }
   
/**
*sets the number of axles.
*
*@param axlesIn used.
*/
   public void setAxles(int axlesIn) {
   
      axles = axlesIn;
   
   }
   
/**
*calcualtes tax for the SemiTractorTrailer.
*
*@return double.
*/
   public double useTax() {
   
      double totalUseTax = super.useTax() + (value * PER_AXLE_TAX_RATE * axles);
   
      return totalUseTax;
   
   }
   
/**
*takes the toString method from the truck class and adds some additional info.
*
*@return String.
*/
   public String toString() {
   
      String output = super.toString() + " Axle Tax Rate: ";
      output += (PER_AXLE_TAX_RATE * axles);
   
      return output;
   
   }         
}