/**
*Holds an array of numerical values and provides.
*methods for the user to interact with.
*
*Activity 7.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/23/17.
*/
public class Scores {

//instance variable
   private int[] numbers;

/**
*constructor.
*
*@param numbersIn used.
*/
   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   
   }
//methods

/**
*finds all of the evens in the array.
*
*@return int array.
*/
   public int[] findEvens() {
      
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 0) {
         
            numberEvens++;
            
         }
      }
         
      int[] evens = new int[numberEvens];
         
      int count = 0;
         
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 0) {
            
            evens[count] = numbers[i];
            count++;
         }
      } 
      
      return evens;
   
   }
   /**
   *finds all of the odds in the array.
   *
   *@return int array.
   */
   public int[] findOdds() {
   
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         if (numbers[i] % 2 == 1) {
         
            numberOdds++;
            
         }
      }
         
      int[] odds = new int[numberOdds];
         
      int count = 0;
         
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] % 2 == 1) {
            
            odds[count] = numbers[i];
            count++;
         }
      } 
      
      return odds;
   
   
   }
   /**
   *calculates the average of the numbers in the array.
   *
   *@return double.
   */
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
      
         sum += numbers[i];
      
      }
   
      return (double) sum / (double) numbers.length;
   
   }
   /**
   *prints a string with all of the values.
   *
   *@return String.
   */
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
      
         result += numbers[i] + "\t";
      
      }
      
      return result;
   
   }
   /**
   *prints a string with all of the values in reverse.
   *
   *@return String.
   */
   public String toStringInReverse() {
   
      String result = "";
   
      for (int i = numbers.length - 1; i > -1; i--) {
      
         result += numbers[i] + "\t";
      
      }
    
      return result;
    
   } 
   
}