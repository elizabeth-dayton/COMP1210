import org.junit.Assert;
import org.junit.Test;

/**
*tests the NegativeValueException.
*
*Project 11.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*12/6/17.
*/
public class NegativeValueExceptionTest {

/**
*tests the NegativeValueException.
*/
   @Test public void negativeValueException1Test() { 
   
      boolean thrown = false;
   
      try {
      
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false);
         
      }
          
      catch (NegativeValueException e) { 
      
         thrown = true;
      
      }
   
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         true, thrown);
   
   }
   
   /**
*tests the NegativeValueException.
*/
   @Test public void negativeValueException2Test() { 
   
      boolean thrown = false;
   
      try {
      
         Truck truck = new Truck("Jackson, Bo", "2012 Toyota Camry",
            25000, false, -4);
         
      }
          
      catch (NegativeValueException e) { 
      
         thrown = true;
      
      }
   
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         true, thrown);
   
   }

/**
*tests the NegativeValueException.
*/
   @Test public void negativeValueException3Test() { 
   
      boolean thrown = false;
   
      try {
      
         SemiTractorTrailer stt = new SemiTractorTrailer("Jackson, Bo",
            "2012 Toyota Camry", 25000, false, 4, -4);
         
      }
          
      catch (NegativeValueException e) { 
      
         thrown = true;
      
      }
   
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         true, thrown);
   
   }

/**
*tests the NegativeValueException.
*/
   @Test public void negativeValueException4Test() { 
   
      boolean thrown = false;
   
      try {
      
         Motorcycle m = new Motorcycle("Jackson, Bo", "2012 Toyota Camry",
            25000, false, -6);
         
      }
          
      catch (NegativeValueException e) { 
      
         thrown = true;
      
      }
   
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         true, thrown);
   
   }

}
