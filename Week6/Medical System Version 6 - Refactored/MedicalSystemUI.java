import java.util.ArrayList;
import java.util.Scanner;

public class MedicalSystemUI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //This line creates an ArrayList that can store Nurse objects.
        ArrayList<Nurse> listOfNurses = new ArrayList<>();
        //This line creates an ArrayList that can store dOCTOR objects.
        ArrayList<Doctor> listOfDoctors = new ArrayList<>();

        int choice;

        do {

            displayMenu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    addNurse(input, listOfNurses);
                    break;

                case 2:
                    viewNurses(listOfNurses);
                    break;

                case 3:
                    updateNurseShift(input, listOfNurses);
                    break;

                case 4:
                    removeNurse(input, listOfNurses);
                    break;

                case 5:
                    addDoctor(input, listOfDoctors);
                    break;

                case 6:
                    viewDoctors(listOfDoctors);
                    break;

                case 7:
                    updateDoctorSalary(input, listOfDoctors);
                    break;

                case 8:
                    removeDoctor(input, listOfDoctors);
                    break;
                case 9:
                    viewAllMedicalStaff(input, listOfNurses, listOfDoctors);
                    break;
                case 10:

                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

    }
    // ---------------- METHODS ----------------
    public static void displayMenu() {
        System.out.println("\n=== Medical System Menu (CRUD) ===");
        System.out.println("\n=== Nurse ===");
        System.out.println("1. Add Nurse");
        System.out.println("2. View All Nurses");
        System.out.println("3. Update Nurse Shift");
        System.out.println("4. Remove Nurse");
        System.out.println("\n=== Doctor ===");
        System.out.println("5. Add Doctor");
        System.out.println("6. View All Doctors");
        System.out.println("7. Update Doctor Salary");
        System.out.println("8. Remove Doctor");
        System.out.println("\n==================");
        System.out.println("9. View ALL Medical Staff ");
        System.out.println("10. Exit");
        System.out.print("Enter choice: ");
    }

    public static void addNurse(Scanner input, ArrayList<Nurse> listOfNurses) 
    {
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

        listOfNurses.add(new Nurse(name, id, dept, shift, years));

        System.out.println("Nurse added.");
    }

    public static void addDoctor(Scanner input, ArrayList<Doctor> listOfDoctors) 
    {
        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter employee ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter department: ");
        String dept = input.nextLine();

        System.out.print("Enter specialization: ");
        String spec = input.nextLine();

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        input.nextLine();

        Doctor newDoctor = new Doctor(name, id, dept, spec, salary);
        listOfDoctors.add(newDoctor);

        System.out.println("Doctor added.");
    }

    public static void viewNurses(ArrayList<Nurse> listOfNurses) {

        if (listOfNurses.size() == 0) {
            System.out.println("No nurses stored.");
            return;
        }

        for (int i = 0; i < listOfNurses.size(); i++) {
            System.out.println(listOfNurses.get(i));
        }
    }

    public static void viewDoctors(ArrayList<Doctor> listOfDoctors) {

        System.out.println("\n--- All Doctors ---");

        if (listOfDoctors.size() == 0) {
            System.out.println("No doctors stored.");
        } else {
            for (int i = 0; i < listOfDoctors.size(); i++) {
                System.out.println("Index " + i + ":");
                System.out.println(listOfDoctors.get(i)); // calls toString()
                System.out.println();
            }
        }

    }

    public static void updateNurseShift(Scanner input, ArrayList<Nurse> listOfNurses) 
    {

        if (listOfNurses.size() == 0) {
            System.out.println("No nurses stored.");
            return;
        }

        System.out.print("Enter index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfNurses.size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new shift: ");
        String newShift = input.nextLine();

        listOfNurses.get(index).setShift(newShift);
        System.out.println("Shift updated.");
    }

    public static void updateDoctorSalary(Scanner input, ArrayList<Doctor> listOfDoctors) 
    {
        System.out.println("\n--- Update Doctor Salary ---");

        if (listOfDoctors.size() == 0) {
            System.out.println("No doctors stored.");
            return; //Immediately stops the method and sends control back to the caller.
            //It does NOT return a value — it simply exits the method early.
        }

        System.out.print("Enter doctor index to update (0 to " + (listOfDoctors.size() - 1) + "): ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfDoctors.size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new salary: ");
        double newSalary = input.nextDouble();
        input.nextLine();

        listOfDoctors.get(index).setSalary(newSalary);

        System.out.println("Salary updated.");
    }

    public static void removeNurse(Scanner input, ArrayList<Nurse> listOfNurses) {

        if (listOfNurses.size() == 0) {
            System.out.println("No nurses stored.");
            return;
        }

        System.out.print("Enter index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfNurses.size()) {
            System.out.println("Invalid index.");
            return;
        }

        listOfNurses.remove(index);
        System.out.println("Nurse removed.");
    }

    public static void removeDoctor(Scanner input, ArrayList<Doctor> listOfDoctors) {

        if (listOfDoctors.size() == 0) {
            System.out.println("No doctors stored.");
            return;
        }

        System.out.print("Enter index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfDoctors.size()) {
            System.out.println("Invalid index.");
            return;
        }

        listOfDoctors.remove(index);
        System.out.println("Doctor removed.");
    }

    private static void viewAllMedicalStaff(Scanner input, ArrayList<Nurse> listOfNurses, ArrayList<Doctor> listOfDoctors) {

        System.out.println("\n--- ALL MEDICAL STAFF ---");

        System.out.println("\nNURSES:");
        if (listOfNurses.size() == 0) {
            System.out.println("No nurses stored.");
        } else {
            for (int i = 0; i < listOfNurses.size(); i++) {
                System.out.println(listOfNurses.get(i));
            }
        }

        System.out.println("\nDOCTORS:");
        if (listOfDoctors.size() == 0) {
            System.out.println("No doctors stored.");
        } else {
            for (int i = 0; i < listOfDoctors.size(); i++) {
                System.out.println(listOfDoctors.get(i));
            }
        }
    }
}