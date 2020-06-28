import org.junit.Assert;
import org.junit.Test;

/**
*tests the methods of the Car class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17.
*/
public class CarTest {

/**
*tests the useTax method.
*/
   @Test public void useTaxTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true); 
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe", 
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe", 
         110000, true);
   
      Assert.assertEquals("useTaxTest car1 failed", 220,
         car1.useTax(), 0.000001);
      Assert.assertEquals("useTaxTest car2 failed", 110,
         car2.useTax(), 0.000001);
      Assert.assertEquals("useTaxTest car3 failed", 3300,
         car3.useTax(), 0.000001);
      Assert.assertEquals("useTaxTest car4 failed", 2750,
         car4.useTax(), 0.000001);
   }
 
 /**
 *tests the toString method.
 */
   @Test public void toStringTest() {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      boolean has = car1.toString().contains("Jones, Sam: Car 2017 Honda"
         + " Accord\nValue: $22,000.00 Use Tax: $220.00\nwith Tax Rate: 0.01");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }        
}
