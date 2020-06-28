/**
*Number Operations.
*
*Project 5.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/4/17.
*/
public class NumberOperations {
//instance variable
   private int number;
   /**
   *constructor.
   *
   *@param numberIn used.
   */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   //methods
   /**
   *gets value of number.
   *
   *@return int.
   */
   public int getValue() {
      return number;
   }
   /**
   *gets the positive odd integers less than number.
   *
   *@return String.
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
   *gets the positive powers of two less than number.
   *
   *@return String.
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   /**
   *returns 1 if number > compareNumber.
   *returns -1 if number < compareNumber.
   *returns 0 if the number = compareNumber.
   *
   *@param compareNumberIn used.
   *@return int.
   */
   public int isGreater(int compareNumberIn) {
      if (number > compareNumberIn) {
         return 1;
      }
      else if (number < compareNumberIn) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
   *creates a string from all the info.
   *
   *@return String.
   */
   public String toString() {
      return number + "";
   }
}