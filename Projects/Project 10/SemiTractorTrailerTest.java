import org.junit.Assert;
import org.junit.Test;

/**
*tests the methods of the SemiTractorTrailer class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class SemiTractorTrailerTest {

/**
*tests the getAxles method.
*/
   @Test public void getAxlesTest() {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertEquals("getAxlesTest failed", 4, semi1.getAxles(),
         0.000001);
   
   }
   
/**
*tests the setAxles method.
*/
   @Test public void setAxlesTest() {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
         
      semi1.setAxles(3);
         
      Assert.assertEquals("setAxlesTest failed", 3, semi1.getAxles());      
   
   }

/**
*tests the useTax method.
*/
   @Test public void useTaxTest() {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertEquals("useTaxTest failed", 3150, semi1.useTax(),
         0.000001);
   
   }
   
/**
*tests the toString method.
*/
   @Test public void toStringTest() {
   
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
