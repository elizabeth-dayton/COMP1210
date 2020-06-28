/**
*User Info.
*
*Activity 4A.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*9/25/17.
*/
public class UserInfo {
//instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
//constructor
/**
*sets default parameters.
*
*@param firstNameIn used.
*@param lastNameIn used.
*/
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
//methods
/**
*creates a string with all the inputed info.
*
*@return String.
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   *sets location.
   *
   *@param locationIn used.
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   /**
   *sets age if age input is greater than 0.
   *
   *@param ageIn used.
   *@return int.
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   *gets age.
   *
   *@return int.
   */
   public int getAge() {
      return age;
   }
   /**
   *gets location.
   *
   *@return String.
   */
   public String getLocation() {
      return location;
   }
   /**
   *sets status to OFFLINE.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   *set status to ONLINE.
   */
   public void logOn() {
      status = ONLINE;
   }
}