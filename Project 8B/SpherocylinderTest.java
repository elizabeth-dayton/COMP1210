import org.junit.Assert;
import org.junit.Test;
/**
*Tests the methods of the Spherocylinder class.
*
*Project 8A.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/1/2017.
*/
public class SpherocylinderTest {

/**
*Tests the getLabel method.
*/
   @Test public void getLabelTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.getLabel();
      Assert.assertEquals("Failed to getLabel", "Example", s.getLabel());
   
   }
   
   /**
   *Tests the setLabel method with a non-null entry.
   */
   @Test public void setLabelNonNullTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setLabel("Example 2");
      Assert.assertEquals("Failed to setLabel - non-null", true, 
         s.setLabel("Example 2"));
   
   }
   
   /**
   *Test the setLabel method with a null entry.
   */
   @Test public void setLabelNullTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setLabel(null);
      Assert.assertEquals("Failed to setLabel - null", false, s.setLabel(null));
   
   }
   
   /**
   *Tests the getRadius method.
   */
   @Test public void getRadiusTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.getRadius();
      Assert.assertEquals("Failed to getRadius", 3.0, s.getRadius(), 0.000001);
   
   }
   
   /**
   *Tests the setRadius method with a non-negative entry.
   */
   @Test public void setRadiusNonNegativeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setRadius(4);
      Assert.assertEquals("Failed to setRadius - non-negative", 
         true, s.setRadius(4));
   
   }
   
   /**
   *Tests the setRadius method with a negative entry.
   */
   @Test public void setRadiusNegativeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setRadius(-3);
      Assert.assertEquals("Failed to setRadius - negative", 
         false, s.setRadius(-3));
   
   }
   
   /**
   *Tests the getCylinderHeight method.
   */
   @Test public void getCylinderHeightTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.getCylinderHeight();
      Assert.assertEquals("Failed to getCylinderHeight", 
         3.0, s.getCylinderHeight(), 0.000001);
   
   }
   
   /**
   *Tests the setCylinderHeight method with a non-negative entry.
   */
   @Test public void setCylinderHeightNonNegativeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setCylinderHeight(4);
      Assert.assertEquals("Failed to setCylinderHeight - non-negative", 
         true, s.setCylinderHeight(4));
   
   }
   
   /**
   *Tests the setCyinderHeight method with a negative entry.
   */
   @Test public void setCylinderHeightNegativeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.setCylinderHeight(-3);
      Assert.assertEquals("Failed to setCylinderHeight - negative", 
         false, s.setCylinderHeight(-3));
   
   }

/**
*Tests the circumference method.
*/
   @Test public void circumferenceTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.circumference();
      Assert.assertEquals("Failed circumference test", 
         18.849556, s.circumference(), 0.000001);
   
   }
   
   /**
   *Tests the surfaceArea method.
   */
   @Test public void surfaceAreaTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.surfaceArea();
      Assert.assertEquals("Failed surfaceArea test", 
         169.646003, s.surfaceArea(), 0.000001);
   
   }
   
   /**
   *Tests the volume method.
   */
   @Test public void volumeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.volume();
      Assert.assertEquals("Failed volume test", 
         197.920337, s.volume(), 0.000001);
   
   }
   
   /**
   *Tests the getCount method.
   */
   @Test public void getCountTest() {
   
      Spherocylinder.resetCount();
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Spherocylinder.getCount();
      Assert.assertEquals("Failed getCountTest", 1, Spherocylinder.getCount());
   
   }
   
   /**
   *Tests the resetCount method.
   */
   @Test public void resetCountTest() {
   
      Spherocylinder.resetCount();
      Assert.assertEquals("Failed resetCountTest", 
         0, Spherocylinder.getCount());
   
   }
   /**
   *Tests the equals - false method.
   */
   @Test public void equalsFalseTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Object obj = new Object();
      Assert.assertEquals("Failed equalsFalseTest", false, s.equals(obj));
   
   }
   
   /**
   *Tests the equals - true method.
   */
   @Test public void equalsTrueTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Spherocylinder p = new Spherocylinder("Example", 3, 3);
      Assert.assertEquals("Failed equalsTrueTest", true, s.equals(p));
   
   }
   
   /**
   *Tests the equals - false(different labels) method.
   */
   @Test public void equalsFalseDifferentLabelsTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Spherocylinder p = new Spherocylinder("Example 2", 3, 3);
      Assert.assertEquals("Failed equalsFalseDifferentLabelsTest", 
         false, s.equals(p));
   
   }

/**
   *Tests the equals - false(different radii) method.
   */
   @Test public void equalsFalseDifferentRadiiTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Spherocylinder p = new Spherocylinder("Example", 4, 3);
      Assert.assertEquals("Failed equalsFalseDifferentRadiiTest", 
         false, s.equals(p));
   
   }
   
   /**
   *Tests the equals - false(different cylinderHeights) method.
   */
   @Test public void equalsFalseDifferentCylinderHeightsTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      Spherocylinder p = new Spherocylinder("Example", 3, 4);
      Assert.assertEquals("Failed equalsFalseDifferentCylinderHeightsTest", 
         false, s.equals(p));
   
   }
   
   /**
   *Tests the hashCode method.
   */
   @Test public void hashCodeTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      s.hashCode();
      Assert.assertEquals("Failed hasCodeTest", 0, s.hashCode());
   
   }
   /**
   *Tests the toString method.
   */
   @Test public void toStringTest() {
   
      Spherocylinder s = new Spherocylinder("Example", 3, 3);
      //s.toString();
      boolean has = s.toString().contains("Spherocylinder \"Example\""
         + " with radius 3.0 and cylinder height 3.0 has:\n\tcircumference"
         + " = 18.85 units\n\tsurface area = 169.646 square units\n\tvolume "
         + "= 197.92 cubic units");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   } 
}