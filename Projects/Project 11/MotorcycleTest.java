import org.junit.Assert;
import org.junit.Test;

/**
*tests the methods of the Motorcycle class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17.
*/
public class MotorcycleTest {

/**
*tests the getEngineSize method.
*
*@throws NegativeValueException used.
*/
   @Test public void getEngineSizeTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      Assert.assertEquals("getEngineSizeTest failed", 750,
         bike1.getEngineSize(), 0.000001);
   
   }
   
/**
*tests the setEngineSize method.
*
*@throws NegativeValueException used.
*/
   @Test public void setEngineSizeTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      bike1.setEngineSize(900);
         
      Assert.assertEquals("setEngineSizeTest failed", 900,
         bike1.getEngineSize(), 0.000001);
   
   }
   
/**
*tests the useTax method.
*
*@throws NegativeValueException used.
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Brando, Marlene",
         "1964 Harley-Davidson Sportster", 20000, true, 300);    
   
      Assert.assertEquals("useTaxTestBike1 failed", 280, bike1.useTax(),
         0.000001);
      Assert.assertEquals("useTaxTestBike2 failed", 50, bike2.useTax(),
         0.000001);   
   
   }
   
/**
*tests the toString method.
*
*@throws NegativeValueException used.
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, false, 750);
         
      boolean has = bike1.toString().contains("Brando, Marlon: Motorcycle"
         + " 1964 Harley-Davidson Sportster\nValue: $14,000.00 Use Tax: $280.00"
         + "\nwith Tax Rate: 0.005 Large Bike Tax Rate: 0.015");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);      
   
   }
   
/**
*tests the toString method.
*
*@throws NegativeValueException used.
*/
   @Test public void toString2Test() throws NegativeValueException {
   
      Motorcycle bike2 = new Motorcycle("Brando, Marlene",
         "1964 Harley-Davidson Sportster", 20000, true, 300);
         
      boolean has = bike2.toString().contains("Brando, Marlene: Motorcycle"
         + " 1964 Harley-Davidson Sportster (Alternative Fuel)\nValue: "
         + "$20,000.00 Use Tax: $50.00\nwith Tax Rate: 0.0025");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);      
   
   }              
}
