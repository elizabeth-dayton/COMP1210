import org.junit.Assert;
import org.junit.Test;

/**
*tests the methods of the Truck class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class TruckTest {

/**
*tests the getTons method.
*/
   @Test public void getTonsTest() {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
   
      Assert.assertEquals("getTonsTest failed", 1.5, truck1.getTons(),
         0.000001);
   
   }
   
/**
*tests the setTons method.
*/
   @Test public void setTonsTest() {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
         
      truck1.setTons(2);
         
      Assert.assertEquals("setTonsTest failed", 2.0, truck1.getTons(), 
         0.000001);      
   
   } 
   
/**
*tests the useTax method.
*/
   @Test public void useTaxTest() {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);
   
      Assert.assertEquals("useTaxTest truck1 failed", 600,
         truck1.useTax(), 0.000001);
      Assert.assertEquals("useTaxTest truck2 failed", 1600,
         truck2.useTax(), 0.000001);
         
   }

/**
*tests the toString method.
*/
   @Test public void toStringTest() {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
   
      boolean has = truck1.toString().contains("Williams, Jo: Truck 2012"
         + " Chevy Silverado\nValue: $30,000.00 Use Tax: $600.00\nwith Tax"
         + " Rate: 0.02");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }     
}
