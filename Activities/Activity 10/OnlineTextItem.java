/**
*Represents an online text item.
*
*Activity 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/27/17.
*/
public abstract class OnlineTextItem extends InventoryItem {

/**
*constructs an onlineTextItem.
*
*@param nameIn used.
*@param priceIn used.
*/
   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   }
   
/**
*overrides the calculateCost method from InventoryItem to not include tax.
*
*@return double.
*/
   public double calculateCost() {
   
      return price;
   
   }   
}
