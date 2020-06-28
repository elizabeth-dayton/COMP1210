import org.junit.Assert;
import org.junit.Test;

/**
*tests the main method in VehiclesPart3.
*
*Project 11.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*12/6/17.
*/
public class VehiclesPart3Test {

/**
*good file name test.
*/
   @Test public void goodFileNameTest() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
   
      Vehicle.resetVehicleCount();
      
      String[] args = {"vehicles2.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals(5, Vehicle.getVehicleCount());
   
   }
   
/**
*bad file name test.
*/
   @Test public void badFileNameTest() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
   
      Vehicle.resetVehicleCount();
      
      String[] args = {"vicles2.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   
   }

/**
*no file name test.
*/
   @Test public void noFileNameTest() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
   
      Vehicle.resetVehicleCount();
      
      String[] args = {};
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   
   }

}
