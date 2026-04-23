import java.util.Scanner;

public class MedicalSystemUI {

    static Scanner input = new Scanner(System.in);
    static MedicalSystem system = new MedicalSystem();

    public static void main(String[] args) {

        int choice;

        do {
            displayMenu();
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addNurseUI();
                    break;
                case 2:
                    addDoctorUI();
                    break;
                case 3:
                    printAllStaffUI();
                    break;
                case 4:
                    removeStaffUI();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

    }

    public static void displayMenu() {
        System.out.println("\n=== Medical System Menu ===");
        System.out.println("1. Add Nurse");
        System.out.println("2. Add Doctor");
        System.out.println("3. Print all Staff");
        System.out.println("4. Remove Staff Member");

        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    public static void addNurseUI() {
        System.out.println("\n--- Add Nurse ---");

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

        Nurse nurse = new Nurse(name, id, dept, shift, years);
        system.addStaff(nurse);

        System.out.println("Nurse added.");
        
    }

    public static void addDoctorUI() {
        System.out.println("\n--- Add Doctor ---");

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

        Doctor doctor = new Doctor(name, id, dept, spec, salary);
        system.addStaff(doctor);

        System.out.println("Doctor added.");
    }

    public static void removeStaffUI() {
        System.out.println("\n--- Remove Staff Member ---");

        if (system.getStaffCount() == 0) {
            System.out.println("No staff stored.");
            return;
        }

        System.out.println(system.getAllStaff());
        System.out.print("Enter index to remove: ");
        int index = input.nextInt();
        input.nextLine();

        if (!system.isValidStaffIndex(index)) {
            System.out.println("Invalid index.");
            return;
        }

        system.removeStaff(index);
        System.out.println("Staff member removed.");
    }

    
    public static void printAllStaffUI() {
        System.out.println("\n--- Print All Staff ---");

        if (system.getStaffCount() == 0) {
            System.out.println("No staff stored.");
            return;
        }

       System.out.println(system.getAllStaff());
    }
}
