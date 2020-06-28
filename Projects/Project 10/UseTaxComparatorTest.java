import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*tests the method in the UseTaxComparator class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/30/17.
*/
public class UseTaxComparatorTest {

   
   private static final  UseTaxComparator UTC = new UseTaxComparator();

/**
*tests the compare less than method of the UseTaxComparator class.
*
*@throws FileNotFoundException used.
*/
   @Test public void compareLessThanTest() throws FileNotFoundException {
   
      Vehicle c = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Vehicle t = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);
      
      int result = UTC.compare(c, t);
      
      Assert.assertTrue("compareLessThanTest failed", result == -1);
   
   }
   
   /**
*tests the compare greater than method of the UseTaxComparator class.
*
*@throws FileNotFoundException used.
*/

   @Test public void compareGreaterThanTest() throws FileNotFoundException {
   
      Vehicle c = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Vehicle t = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);
      
      int result = UTC.compare(t, c);
      
      Assert.assertTrue("compareLessThanTest failed", result == 1);
   
   }

/**
*tests the compare equal to method of the UseTaxComparator class.
*
*@throws FileNotFoundException used.
*/

   @Test public void compareEqualToTest() throws FileNotFoundException {
   
      Vehicle c = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Vehicle k = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      
      int result = UTC.compare(k, c);
      
      Assert.assertTrue("compareLessThanTest failed", result == 0);
   
   }

}
