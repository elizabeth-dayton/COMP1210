import java.util.Comparator;
/**
*provides a way to order vehicle objects lowest to highest.
*by their use tax.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class UseTaxComparator implements Comparator<Vehicle> {

/**
*compares two vehicles objects for sorting via use tax.
*
@param v1 used.
*@param v2 used.
*@return int.
*/

   public int compare(Vehicle v1, Vehicle v2) {
   
      if (v1.useTax() > v2.useTax()) {
      
         return 1;
         
      }
      
      else if (v1.useTax() < v2.useTax()) {
      
         return -1;
         
      }
      
      else {
      
         return 0;
      
      }
      
   }

}