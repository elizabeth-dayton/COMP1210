import org.junit.Assert;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*tests the main method of the VehiclesPart2 class.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/30/17.
*/
public class VehiclesPart2Test {

/**
*tests the constructor for VehiclesPart2 and the getVehicleCount method.
*
*@throws FileNotFoundException used.
*/
   @Test public void getVehicleCountTest()
       throws FileNotFoundException {
   
      VehiclesPart2 vPart2Obj = new VehiclesPart2();
   
      Vehicle.resetVehicleCount();
      
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   
   
   }

}
