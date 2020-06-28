/**
*Represents an item in a store.
*
*Activity 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/13/17.
*/
public class InventoryItem {

//variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
/**
*constructs an inventory item.
*
*@param nameIn used.
*@param priceIn used.
*/
   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   
   }

//methods

/**
*gets the name.
*
*@return name.
*/
   public String getName() {
   
      return name;
   
   }
   
/**
*returns the price including tax.
*
*@return priceWithTax.
*/
   public double calculateCost() {
   
      double priceWithTax = price * (1 + taxRate);
      return priceWithTax;
   
   }
   
/**
*sets the taxRate.
*
*@param taxRateIn used.
*/
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   
   }
   
/**
*returns the name of the item and priceWithTax in a string.
*
*@return String.
*/
   public String toString() {
   
      return name + ": $" + calculateCost();
   
   }   
}