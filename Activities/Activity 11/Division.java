/**
*Provides two methods for division.
*
*Activity 11.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*12/4/17.
*/
public class Division {

//methods

/**
*performs integer division.
*
*@param numerator used.
*@param denominator used.
*@return int.
*/
   public static int intDivide(int numerator, int denominator) {
   
      try {
      
         return numerator / denominator;
      
      }
      
      catch (ArithmeticException e) {
      
         return 0;
      
      }
   
   }

/**
*performs floating point division.
*
*@param numerator used.
*@param denominator used.
*@return float.
*/
   public static float decimalDivide(int numerator, int denominator) {
   
      if (denominator == 0) {
      
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      
      }
      return (float) numerator / (float) denominator;
   
   }
}