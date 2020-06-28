import java.util.ArrayList;
/**
*Temperatures.
*
*Activity 6.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/16/17.
*/
public class Temperatures {
//instance variable
   private ArrayList<Integer> temperatures;
/**
*Temperatures constructor.
*
*@param temperaturesIn used.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
//methods
/**
*gets the lowest temperature from an array list.
*
*@return int.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      } 
      return low;
   }
   /**
   *gets the highest temperature from an array list.
   *
   *@return int.
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
   *takes an int value and sees if it's lower than getLowTemp.
   *
   *@return int.
   *@param lowIn used.
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
   *takes an int value and sees if it's higher than getHighTemp.
   *
   *@return int.
   *@param highIn used.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   /**
   *Creates a string from the info.
   *
   *@return String.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}