import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.io.FileNotFoundException;

/**
*tests the methods of the UseTaxList class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/30/17.
*/
public class UseTaxListTest {

/**
*tests the get tax district and set tax district methods.
*/
   @Test public void getAndSetTaxDistrictTest() {
   
      UseTaxList u = new UseTaxList();
   
      u.setTaxDistrict("Tax District 31");
   
      Assert.assertEquals("getAndSetTaxDistrictTest failed", "Tax District 31",
         u.getTaxDistrict());
   
   }
   
/**
*tests the getVehicleList method.
*
*@throws NegativeValueException used.
*/ 
   @Test public void getVehicleListTest() throws NegativeValueException {
   
      UseTaxList u = new UseTaxList();
   
      Vehicle c = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      u.addVehicle(c);
      
      boolean has = Arrays.toString(u.getVehicleList()).contains(
         "Jones, Sam: Car 2017 Honda"
         + " Accord\nValue: $22,000.00 Use Tax: $220.00\nwith Tax Rate: 0.01");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
      
   }
   
/**
*tests the getExcludedRecords method.
*
*@throws FileNotFoundException used.
*/ 
   @Test public void getExcludedRecordsTest()
      throws FileNotFoundException {
   
      UseTaxList u = new UseTaxList();
   
      u.readVehicleFile("vehicles1.txt");
      
      boolean has = Arrays.toString(u.getExcludedRecords()).contains(
         "Invalid Vehicle Category in");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
      
   }
   
/**
*tests the toString method.
*
*@throws NegativeValueException used.
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      UseTaxList u = new UseTaxList();
   
      Vehicle c = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      u.addVehicle(c);
      
      boolean has = u.toString().contains(
         "Jones, Sam: Car 2017 Honda"
         + " Accord\nValue: $22,000.00 Use Tax: $220.00\nwith Tax Rate: 0.01");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }
            
}
