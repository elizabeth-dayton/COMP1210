import javax.swing.JOptionPane;
/**
*Gets two numbers from the user and catches an exception.
*
*Activity 11.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*12/4/17.
*/
public class DivisionDriver {

/**
*takes in user input and performs division.
*
*@param args not used.
*/
   public static void main(String[] args) {
   
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
   
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
      
      try {
         
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
         
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);
         
      }
      
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      
      }
      
      catch (IllegalArgumentException e) {
      
         JOptionPane.showMessageDialog(null, e, "Error",
            JOptionPane.ERROR_MESSAGE);
      
      }
         
   }

}