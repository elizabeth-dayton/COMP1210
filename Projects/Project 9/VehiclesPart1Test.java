import org.junit.Assert;
import org.junit.Test;

/**
*tests the main method of the VehiclesPart1 class.
*
*Project 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/15/17.
*/
public class VehiclesPart1Test {

/**
*tests the main method of the VehiclesPart1 class.
*/
   @Test public void mainTest() {
   
      VehiclesPart1 vp1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
   
      Assert.assertEquals("Vehicle.vehicleCount should be 8. ",
         8, Vehicle.getVehicleCount());
   
   }
}
