import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*tests the methods of the SpherocylinderList2 class.
*
*Project 8B.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/8/17.
*/
public class SpherocylinderList2Test {

/**
*tests the getName method.
*/
   @Test public void getNameTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("getNameTest failed", "Test List", sList.getName());
   
   }
   
   /**
   *tests the numberOfSpherocylinders - non-zero method.
   */
   @Test public void numberOfSpherocylindersNonZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
         
      Assert.assertEquals("numberOfSpherocylindersNonZeroTest failed",
         3, sList.numberOfSpherocylinders());
   }

/**
   *tests the numberOfSpherocylinders - zero method.
   */
   @Test public void numberOfSpherocylindersZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
         
      Assert.assertEquals("numberOfSpherocylindersZeroTest failed",
         0, sList.numberOfSpherocylinders());
   }

/**
*tests the totalSurfaceArea - non-zero method.
*/
   @Test public void totalSurfaceAreaNonZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("totalSurfaceAreaNonZeroTest failed", 263.8937829,
         sList.totalSurfaceArea(), 0.000001);
   
   }

/**
*tests the totalSurfaceArea - zero method.
*/
   @Test public void totalSurfaceAreaZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("totalSurfaceAreaZeroTest failed", 0.0,
         sList.totalSurfaceArea(), 0.000001);
   
   }

/**
*tests the totalVolume - non-zero method.
*/
   @Test public void totalVolumeNonZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("totalVolumeNonZeroTest failed", 263.8937829,
         sList.totalVolume(), 0.000001);
   
   }

/**
*tests the totalVolume - zero method.
*/
   @Test public void totalVolumeZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("totalVolumeZeroTest failed", 0.0,
         sList.totalVolume(), 0.000001);
   
   }

/**
*tests the averageSurfaceArea - non-zero method.
*/
   @Test public void averageSurfaceAreaNonZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("averageSurfaceAreaNonZeroTest failed", 87.9645943,
         sList.averageSurfaceArea(), 0.000001);
   
   }

/**
*tests the averageSurfaceArea - zero method.
*/
   @Test public void averageSurfaceAreaZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("averageSurfaceAreaZeroTest failed", 0.0,
         sList.averageSurfaceArea(), 0.000001);
   
   }

/**
*tests the averageVolume - non-zero method.
*/
   @Test public void averageVolumeNonZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("averageVolumeNonZeroTest failed", 87.9645943,
         sList.averageVolume(), 0.000001);
   
   }

/**
*tests the averageVolume - zero method.
*/
   @Test public void averageVolumeZeroTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("averageVolumeZeroTest failed", 0.0,
         sList.averageVolume(), 0.000001);
   
   }

/**
   *Tests the toString method.
   */
   @Test public void toStringTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 1);
   
      boolean has = sList.toString().contains("Test List\n\nSpherocylinder"
         + " \"Example 1\" with radius 1.0 and cylinder height 1.0 has:"
         + "\n\tcircumference = 6.283 units\n\tsurface area = 18.85 square"
         + " units\n\tvolume = 7.33 cubic units\n");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   } 

/**
   *Tests the summaryInfo method.
   */
   @Test public void summaryInfoTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 1);
   
      boolean has = sList.summaryInfo().contains("----- Summary for Test List"
         + " -----\nNumber of Spherocylinders: 1\nTotal Surface Area: 18.85"
         + "\nTotal Volume: 7.33\nAverage Surface Area: 18.85\nAverage Volume"
         + ": 7.33\n");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }
   
   /**
   *tests the getList method.
   */
   @Test public void getListTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertArrayEquals("getListTest failed", sArray, sList.getList());
   
   }
   
   /**
   *tests the readFile method.
   *
   *@throws FileNotFoundException for reading a file.
   */
   @Test public void readFileTest() throws FileNotFoundException {
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List", null, 0);
      sList = sList.readFile("spherocylinder_data_1.txt");
      
      Assert.assertEquals("readFileTest failed", "Spherocylinder Test List", 
                           sList.getName());
                           
   }
   
   /**
   *tests the addSpherocylinder method.
   */
   @Test public void addSpherocylinderTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
         
      Spherocylinder s = new Spherocylinder("Example 4", 4, 4);
      sList.addSpherocylinder("Example 4", 4, 4);
      Spherocylinder[] sA = sList.getList();
   
      Assert.assertEquals("addSpherocylinderTest failed", s, sA[3]);
   }
   
   /**
   *tests the findSpherocylinder - valid entry method.
   */
   @Test public void findSpherocylinderValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderTestValidEntry failed", sArray[1], 
         sList.findSpherocylinder("EXAMPLE 2"));
   
   }
   
   /**
   *tests the findSpherocylinder - non-valid entry method.
   */
   @Test public void findSpherocylinderNonValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderTestNonValidEntry failed", null, 
         sList.findSpherocylinder("EXAMPLE 5"));
   
   }
   
   /**
   *tests the deleteSpherocylinder - valid entry method.
   */
   @Test public void deleteSpherocylinderValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("deleteSpherocylinderValidEntryTest failed",
         sArray[1], sList.deleteSpherocylinder("Example 2"));
   }

/**
   *tests the deleteSpherocylinder - non-valid entry method.
   */
   @Test public void deleteSpherocylinderNonValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("deleteSpherocylinderNonValidEntryTest failed",
         null, sList.deleteSpherocylinder("Example 5"));
   }
   
   /**
   *tests the editSpherocylinder - valid entry method.
   */
   @Test public void editSpherocylinderValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("editSpherocylinderValidEntryTest failed",
         true, sList.editSpherocylinder("Example 2", 4, 4));
   }

/**
   *tests the editSpherocylinder - non-valid entry method.
   */
   @Test public void editSpherocylinderNonValidEntryTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("editSpherocylinderNonValidEntryTest failed",
         false, sList.editSpherocylinder("Example 5", 5, 5));
   }

/**
*tests the findSpherocylinderWithShortestRadius.
* - Number of Spherocylinders > 0 method.
*/
   @Test public void findSpherocylinderWithShortestRadiusValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderWithShortestRadiusValidTest"
         + " failed", sArray[0], sList.findSpherocylinderWithShortestRadius());
   
   }
   
   /**
*tests the findSpherocylinderWithShortestRadius.
* - Number of Spherocylinders = 0 method.
*/
   @Test public void findSpherocylinderWithShortestRadiusNonValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("findSpherocylinderWithShortestRadiusNonValidTest"
         + " failed", null, sList.findSpherocylinderWithShortestRadius());
   
   }

/**
*tests the findSpherocylinderWithLongestRadius.
* - Number of Spherocylinders > 0 method.
*/
   @Test public void findSpherocylinderWithLongestRadiusValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderWithLongestRadiusValidTest"
         + " failed", sArray[2], sList.findSpherocylinderWithLongestRadius());
   
   }
   
   /**
*tests the findSpherocylinderWithLongestRadius.
* - Number of Spherocylinders = 0 method.
*/
   @Test public void findSpherocylinderWithLongestRadiusNonValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("findSpherocylinderWithLongestRadiusNonValidTest"
         + " failed", null, sList.findSpherocylinderWithLongestRadius());
   
   }

/**
*tests the findSpherocylinderWithSmallestVolume.
* - Number of Spherocylinders > 0 method.
*/
   @Test public void findSpherocylinderWithSmallestVolumeValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolumeValidTest"
         + " failed", sArray[0], sList.findSpherocylinderWithSmallestVolume());
   
   }
   
   /**
*tests the findSpherocylinderWithSmallestVolume.
* - Number of Spherocylinders = 0 method.
*/
   @Test public void findSpherocylinderWithSmallestVolumeNonValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolumeNonValidTest"
         + " failed", null, sList.findSpherocylinderWithSmallestVolume());
   
   }

/**
*tests the findSpherocylinderWithLargestVolume.
* - Number of Spherocylinders > 0 method.
*/
   @Test public void findSpherocylinderWithLargestVolumeValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
      sArray[0] = new Spherocylinder("Example 1", 1, 1);
      sArray[1] = new Spherocylinder("Example 2", 2, 2);
      sArray[2] = new Spherocylinder("Example 3", 3, 3);
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 3);
   
      Assert.assertEquals("findSpherocylinderWithLargestVolumeValidTest"
         + " failed", sArray[2], sList.findSpherocylinderWithLargestVolume());
   
   }
   
   /**
*tests the findSpherocylinderWithLargestVolume.
* - Number of Spherocylinders = 0 method.
*/
   @Test public void findSpherocylinderWithLargestVolumeNonValidTest() {
   
      Spherocylinder[] sArray = new Spherocylinder[10];
   
      SpherocylinderList2 sList = new SpherocylinderList2("Test List",
         sArray, 0);
   
      Assert.assertEquals("findSpherocylinderWithLargestVolumeNonValidTest"
         + " failed", null, sList.findSpherocylinderWithLargestVolume());
   
   }

}