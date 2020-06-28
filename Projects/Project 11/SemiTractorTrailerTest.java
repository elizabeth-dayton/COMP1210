import org.junit.Assert;
import org.junit.Test;

/**
*tests the methods of the SemiTractorTrailer class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17.
*/
public class SemiTractorTrailerTest {

/**
*tests the getAxles method.
*
*@throws NegativeValueException used.
*/
   @Test public void getAxlesTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertEquals("getAxlesTest failed", 4, semi1.getAxles(),
         0.000001);
   
   }
   
/**
*tests the setAxles method.
*
*@throws NegativeValueException used.
*/
   @Test public void setAxlesTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
         
      semi1.setAxles(3);
         
      Assert.assertEquals("setAxlesTest failed", 3, semi1.getAxles());      
   
   }

/**
*tests the useTax method.
*
*@throws NegativeValueException used.
*/
   @Test public void useTaxTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertEquals("useTaxTest failed", 3150, semi1.useTax(),
         0.000001);
   
   }
   
/**
*tests the toString method.
*
*@throws NegativeValueException used.
*/
   @Test public void toStringTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
         
      boolean has = semi1.toString().contains("Williams, Pat: SemiTractor"
         + "Trailer 2012 International Big Boy\nValue: $45,000.00 Use Tax: "
         + "$3,150.00\nwith Tax Rate: 0.02 Large Truck Tax Rate: 0.03"
         + " Axle Tax Rate: 0.02");
   
      Assert.assertTrue(has);
      Assert.assertFalse(!has);      
   
   }   
}
