import java.util.ArrayList;
import java.util.Scanner;

public class MedicalSystemUI {

    public static void main(String[] args) 
    {
        //Creates a Scanner object to allow the program read input from the keyboard.
        Scanner input = new Scanner(System.in);
        
        //This line creates an ArrayList that can store Nurse objects.
        ArrayList<Nurse> listOfNurses = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n=== Nurse Menu (CRUD) ===");
            System.out.println("1. Add Nurse");
            System.out.println("2. View All Nurses");
            System.out.println("3. Update Nurse Shift");
            System.out.println("4. Remove Nurse");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1: {
                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter employee ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter department: ");
                    String dept = input.nextLine();

                    System.out.print("Enter shift: ");
                    String shift = input.nextLine();

                    System.out.print("Enter years of experience: ");
                    int years = input.nextInt();
                    input.nextLine();

                    Nurse newNurse = new Nurse(name, id, dept, shift, years);
                    listOfNurses.add(newNurse);

                    System.out.println("Nurse added.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- All Nurses ---");

                    if (listOfNurses.size() == 0) {
                        System.out.println("No nurses stored.");
                    } else {
                        for (int i = 0; i < listOfNurses.size(); i++) {
                            System.out.println("Index " + i + ":");
                            System.out.println(listOfNurses.get(i)); // calls toString()
                            System.out.println();
                        }
                    }
                    break;
                }

                case 3:
                    {
                    if (listOfNurses.size() == 0) {
                        System.out.println("No nurses stored.");
                        break;
                    }

                    System.out.print("Enter nurse index to update (0 to " + (listOfNurses.size() - 1) + "): ");
                    int index = input.nextInt();
                    input.nextLine();

                    if (index < 0 || index >= listOfNurses.size()) {
                        System.out.println("Invalid index.");
                        break;
                    }

                    System.out.print("Enter new shift: ");
                    String newShift = input.nextLine();

                    listOfNurses.get(index).setShift(newShift);
                    
                    System.out.println("Shift updated.");
                    break;
                }

                case 4: {
                    if (listOfNurses.size() == 0) {
                        System.out.println("No nurses stored.");
                        break;
                    }

                    System.out.print("Enter nurse index to remove (0 to " + (listOfNurses.size() - 1) + "): ");
                    int index = input.nextInt();
                    input.nextLine();

                    if (index < 0 || index >= listOfNurses.size()) {
                        System.out.println("Invalid index.");
                        break;
                    }

                    listOfNurses.remove(index);
                    System.out.println("Nurse removed.");
                    break;
                }

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        
    }
}