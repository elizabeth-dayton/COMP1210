/**
*A list that holds an array of InventoryItem objects.
*
*Activity 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/27/17.
*/
public class ItemsList {

//variables
   private InventoryItem[] inventory;
   private int count;
   
/**
*constructor for ItemsList.
*/
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   
   }
   
/**
*adds an item to the ItemsList.
*
*@param itemIn used.
*/
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
   
   }
   
/**
*calculates total.
*
*@param electronicsSurcharge used.
*@return double.
*/
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
         
            total += inventory[i].calculateCost() + electronicsSurcharge;
         
         }
         
         else {
         
            total += inventory[i].calculateCost();
         
         }
      
      }
      
      return total;
   
   }
   
/**
*creates a string from the information.
*
*@return String.
*/
   public String toString() {
   
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
      
         output += inventory[i] + "\n";
      
      }
   
      return output;
   
   }         
}