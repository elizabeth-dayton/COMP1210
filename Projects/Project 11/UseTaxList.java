import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
/**
*Reads in data and generates reports, adds a vehicle, and.
*sorts vehicles by owner and by use tax amount.
*
*Project 10.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*11/29/17.
*/
public class UseTaxList {

//variables
   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;
   private String line;
   
/**
*constructor that initializes the above variables.
*/
   public UseTaxList() {
   
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   
   }
   
//methods

/**
*reads in a file with a list of vehicles.
*
*@param dataFileName used.
*@throws FileNotFoundException used.
*/
   public void readVehicleFile(String dataFileName) 
       throws FileNotFoundException {
   
      
      Scanner scanFile = new Scanner(new File(dataFileName));
      
      taxDistrict = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         
         line = scanFile.nextLine();
         
         Scanner scanLine = new Scanner(line).useDelimiter(";");
         String type = scanLine.next().trim().toUpperCase();
         char codeChar = type.charAt(0);
            
         try {
            
            switch(codeChar) {
               
               case 'C': 
                  
                  String cOwner = scanLine.next().trim();
                  String cYearMakeModel = scanLine.next().trim();
                  double cValue = Double.parseDouble(scanLine.next().trim());
                  boolean cAlternativeFuel = Boolean.parseBoolean(scanLine.
                        next().trim());
                  
                  Car c = new Car(cOwner, cYearMakeModel, 
                        cValue, cAlternativeFuel);
                  
                  addVehicle(c);
                  
                  break;
               
               case 'T':
                  
                  String tOwner = scanLine.next().trim();
                  String tYearMakeModel = scanLine.next().trim();
                  double tValue = Double.parseDouble(scanLine.next().trim());
                  boolean tAlternativeFuel = Boolean.parseBoolean(scanLine.
                        next().trim());
                  double tons = Double.parseDouble(scanLine.next().trim());
                  
                  Truck t = new Truck(tOwner, tYearMakeModel, tValue, 
                        tAlternativeFuel, tons);
                  
                  addVehicle(t);
                  
                  break;
               
               case 'S':
                  
                  String sOwner = scanLine.next().trim();
                  String sYearMakeModel = scanLine.next().trim();
                  double sValue = Double.parseDouble(scanLine.next().trim());
                  boolean sAlternativeFuel = Boolean.parseBoolean(scanLine.
                        next().trim());
                  double sTons = Double.parseDouble(scanLine.next().trim());
                  int axles = Integer.parseInt(scanLine.next().trim());
                  
                  SemiTractorTrailer s = new SemiTractorTrailer(sOwner, 
                        sYearMakeModel, sValue, sAlternativeFuel, sTons, axles);
                  
                  addVehicle(s);
                  
                  break;
               
               case 'M': 
                  
                  String mOwner = scanLine.next().trim();
                  String mYearMakeModel = scanLine.next().trim();
                  double mValue = Double.parseDouble(scanLine.next().trim());
                  boolean mAlternativeFuel = Boolean.parseBoolean(scanLine.
                        next().trim());
                  double engineSize = 
                        Double.parseDouble(scanLine.next().trim());
                  
                  Motorcycle m = new Motorcycle(mOwner, mYearMakeModel, 
                        mValue, mAlternativeFuel, engineSize);
                  
                  addVehicle(m);
                  
                  break;         
               
               default:
                  
                
                  addExcludedRecord("Invalid Vehicle Category in:\n" + line);
                  break;    
               
            }
         }
            
         catch (NegativeValueException e) {
            
            String nve = e + " in:\n" + line;
            
            addExcludedRecord(nve);
            
            Vehicle.vehicleCount--;
            
         }
            
         catch (NumberFormatException e) {
            
            String nfe = e + " in:\n" + line;
            
            addExcludedRecord(nfe); 
            
         }
            
         catch (NoSuchElementException e) {
            
            String nsee = e + " in:\n" + line;
            
            addExcludedRecord(nsee);
            
         } 
      }
   }
      
      

/**
*gets the tax district.
*
*@return String.
*/
   public String getTaxDistrict() {
   
      return taxDistrict;
   
   }
   
/**
*sets the tax district.
*
*@param taxDistrictIn used.
*/
   public void setTaxDistrict(String taxDistrictIn) {
   
      taxDistrict = taxDistrictIn;
   
   }
   
/**
*returns the vehicle list.
*
*@return Vehicle[].
*/
   public Vehicle[] getVehicleList() {
   
      return vehicleList;
   
   }
   
/**
*returns the list of excluded records.
*
*@return String[]. 
*/
   public String[] getExcludedRecords() {
   
      return excludedRecords;
   
   }
   
/**
*adds a vehicle to the vehicle list.
*
*@param vehicleIn used.
*/
   public void addVehicle(Vehicle vehicleIn) {
   
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   
   }

/**
*adds an excluded record to the excluded records list.
*
*@param excludedRecordIn used.
*/
   public void addExcludedRecord(String excludedRecordIn) {
   
      excludedRecords = Arrays.copyOf(excludedRecords,
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = excludedRecordIn;
   
   }
   
/**
*creates a string of all the vehicles in the vehicle list. 
*
*@return String.
*/
   public String toString() {
   
      String output = "";
   
      for (Vehicle v : vehicleList) {
      
         output += "\n" + v + "\n";
      
      } 
   
      return output;
   
   }
   
/**
*calculates the total use tax of all the vehicles in vehicle list.
*
*@return double.
*/
   public double calculateTotalUseTax() {
   
      double total = 0.0;
      
      for (Vehicle v : vehicleList) {
      
         total += v.useTax();
      
      }
   
      return total;
   
   }
   
/**
*calculates the total value of all the vehicles in vehicle list.
*
*@return double.
*/
   public double calculateTotalValue() {
   
      double total = 0.0;
      
      for (Vehicle v : vehicleList) {
      
         total += v.getValue();
      
      }
   
      return total;
   
   }
   
/**
*returns a summary of information.
*
*@return String.
*/
   public String summary() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String output = "------------------------------\n";
      output += "Summary for " + taxDistrict + "\n";
      output += "------------------------------\n";
      output += "Number of Vehicles: " + vehicleList.length;
      output += "\nTotal Value: " + df.format(calculateTotalValue());
      output += "\nTotal Use Tax: " + df.format(calculateTotalUseTax()) + "\n";
   
      return output;
   
   }
   
/**
*returns the vehicle list in order by owner.
*
*@return String.
*/
   public String listByOwner() {
   
      Arrays.sort(vehicleList);
      
      String output = "------------------------------\n";
      output += "Vehicles by Owner\n";
      output += "------------------------------\n";
      
      for (Vehicle v : vehicleList) {
      
         output += "\n" + v + "\n";
      
      }
   
      return output;
   
   }
   
/**
*returns the vehicle list in order by use tax. 
*
*@return String.
*/
   public String listByUseTax() {
   
      Arrays.sort(vehicleList, new UseTaxComparator());
   
      String output = "------------------------------\n";
      output += "Vehicles by Use Tax\n";
      output += "------------------------------\n";
     
      for (Vehicle v : vehicleList) {
      
         output += "\n" + v + "\n";
      
      }
   
      return output;
   
   }
   
/**
*returns the list of excluded records.
*
*@return String.
*/
   public String excludedRecordsList() {
   
      String output = "------------------------------\n";
      output += "Excluded Records\n------------------------------\n";
   
      for (String s : excludedRecords) {
      
         output += "\n" + s + "\n";
      
      }
   
      return output;
   
   }                    
}