/**
*creates a customer with a name, location, and balance.
*also provide the ability to compare two customer based.
*on balance.
*
*Activity 8B.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/6/17.
*/
public class Customer implements Comparable<Customer> {

//instance variables
   private String name;
   private String town;
   private double balance;
   
   /**
   *constructor for customer.
   *
   *@param nameIn used.
   */
   public Customer(String nameIn) {
   
      name = nameIn;
      town = "";
      balance = 0;
   
   }
   
   //methods
   
   /**
   *sets the customers location.
   *
   *@param locationIn used.
   */
   public void setLocation(String locationIn) {
   
      town = locationIn;
   
   }
   
   /**
   *sets the customers location.
   *
   *@param city used.
   *@param state used.
   */
   public void setLocation(String city, String state) {
   
      town = city + ", " + state;
   
   }
   
   /**
   *changes the customers balance.
   *
   *@param amount used.
   */
   public void changeBalance(double amount) {
   
      balance = balance + amount;
   
   }
   
   /**
   *gets the location of the customer.
   *
   *@return String.
   */
   public String getLocation() {
   
      return town;
   
   }
   
   /**
   *gets the balance of the customer.
   *
   *@return balance.
   */
   public double getBalance() {
   
      return balance;
   
   }
   
   /**
   *puts the customer information into a string.
   *
   *@return output.
   */
   public String toString() {
   
      String output = name + "\n" + town + "\n$" + balance;
      return output;
   
   }
   
   /**
   *compares customers by balance.
   *
   *@param obj used.
   *@return double.
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 1;
      } 
   
   }
}