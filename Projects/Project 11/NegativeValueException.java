/**
*an exception for when a negative value is put in.
*
*Project 11.
*Elizabeth Dayton - Fundamentals of Computing.
*12/6/17.
*/
public class NegativeValueException extends Exception {

/**
*the exception message.
*/
   public NegativeValueException() {
   
      super("Numeric values must be nonnegative");
   
   }
}