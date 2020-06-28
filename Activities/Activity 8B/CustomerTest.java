import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
*tests the customer class.
*
*Activity 8B.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/6/17.
*/
public class CustomerTest {

/**
*tests the first setLocation method.
*/
   @Test public void setLocationTest1() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   
   }
   
   /**
   *tests the second setLocation method.
   */ 
   @Test public void setLocationTest2() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   
   }
   
   /**
   *tests changeBalance method.
   */
   @Test public void changeBalanceTest() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   
   }
   
   /**
   *tests the toString method.
   */
   @Test public void toStringTest() {
   
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   
   }
   
   /**
   *first test for the compareTo method.
   */
   @Test public void compareToTest1() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   
   }
   
   /**
   *second test for the compareTo method.
   */
   @Test public void compareToTest2() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   
   }

   /**
   *third test for the compareTo method.
   */
   @Test public void compareToTest3() {
   
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   
   }

}
