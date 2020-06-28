import java.util.Scanner;
import java.text.DecimalFormat;
/**
*Evaluates and formats an expression.
*
*Project 3.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/18/17.
*/
public class ExpressionEvaluator {
/**
*Evaluates and formats an expression.
*
*@param args Command line arguments - not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double expression = 0;
      double a = 0;
      double b = 0;
      double c = 0;
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      a = Math.abs(23.7 * Math.pow(x, 9));  
      b = Math.sqrt(a - x);
      c =  7.3 * Math.pow(x, 2) + 5.2 * x + 3.1;
      expression = b / c;
      System.out.println("Result: " + expression);
      String result = Double.toString(expression);
      System.out.println("# digits to left of decimal point: "
         + (result.indexOf('.')));
      System.out.println("# digits to right of decimal point: "
         + (result.length() - result.indexOf('.') - 1));
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      System.out.println("Formatted Result: " + df.format(expression));
      
   }
}
