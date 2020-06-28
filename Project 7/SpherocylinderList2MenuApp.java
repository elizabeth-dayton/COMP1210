import java.util.Scanner;
import java.io.FileNotFoundException;
/**
*Creates a SpherocylinderList2MenuApp that presents the user with.
*eight different options.
*
*Project 6.
*Elizabeth Dayton - Fundamentals of Computing - 001.
*10/18/17.
*/
public class SpherocylinderList2MenuApp {
/**
 * 
 * @param args - is not used.
 * @throws FileNotFoundException if the file cannot be opened.
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      String sListName = "*** no list name assigned ***";
      Spherocylinder[] myList = new Spherocylinder[100];
      SpherocylinderList2 mySList 
         = new SpherocylinderList2(sListName, myList, 0);
      String fileName = "no file name";
      
      String label;
      double radius;
      double cylinderHeight;   
      
      String code = "";
   
      Scanner scan = new Scanner(System.in);
   
      System.out.println("Spherocylinder List System Menu\n"
         + "R - Read File and Create Spherocylinder List\n"
         + "P - Print Spherocylinder List\n"
         + "S - Print Summary\n"
         + "A - Add Spherocylinder\n"
         + "D - Delete Spherocylinder\n"
         + "F - Find Spherocylinder\n"
         + "E - Edit Spherocylinder\n"
         + "Q - Quit");
         
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = scan.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R':
               System.out.print("\tFile name: ");
               fileName = scan.nextLine();
            
               mySList = mySList.readFile(fileName);
            
               System.out.println("\tFile read in and Spherocylinder "
                  + "List created\n");
                  
               break;
               
            case 'P':
            
               System.out.println("\n" + mySList);
               break;
               
            case 'S':
               
               System.out.println("\n" + mySList.summaryInfo());
               break;
               
            case 'A':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeight = Double.parseDouble(scan.nextLine());
               
               mySList.addSpherocylinder(label, radius, cylinderHeight);
               System.out.println("\t*** Spherocylinder added ***\n");
               break;
               
            case 'D':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (mySList.deleteSpherocylinder(label) != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (mySList.findSpherocylinder(label) != null) {
                  System.out.println(mySList.findSpherocylinder(label) + "\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeight = Double.parseDouble(scan.nextLine());
            
               if (mySList.editSpherocylinder(label, radius, cylinderHeight)) {
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q':
               break;   
               
            default:
               System.out.print("\t*** invalid code ***\n\n"); 
               break;
         }
      } while (!code.equalsIgnoreCase("Q"));
   }  
}

