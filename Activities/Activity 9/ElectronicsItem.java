/**
*Represents an item in a store along with shipping costs.
*
*Activity 9.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/13/17.
*/
public class ElectronicsItem extends InventoryItem {

//variables
   protected double weight;
/**
*constant variable to represent shipping cost.
*/
   public static final double SHIPPING_COST = 1.5;
   
/**
*constructor for an electronic item.
*
*@param nameIn used.
*@param priceIn used.
*@param weightIn used.
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   
      super(nameIn, priceIn);
      weight = weightIn;
   
   }
   
/**
*overrides the caculateCost method from InventoryItem to include shipping.
*
*@return double.
*/
   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   
   }     
}
