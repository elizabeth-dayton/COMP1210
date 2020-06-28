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
*
*@throws NegativeValueException used.
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
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
 *
 *@throws NegativeValueException used.
 */
   @Test public void toStringTest() throws NegativeValueException {
   
      Car car1 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);
   
      boolean has = car1.toString().contains("Smith, Jack");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }
   
   /**
   *tests the vehicle classes equals and hashcode method.
   *
   *@throws NegativeValueException used.
   */
   @Test public void equalsTest() throws NegativeValueException {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car3 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Object obj1 = new Object();
   
      Assert.assertTrue(car1.equals(car2));
      Assert.assertFalse(car1.equals(car3));
      Assert.assertFalse(car1.equals(obj1));
      Assert.assertTrue(car1.hashCode() == car2.hashCode());
   }        
}
