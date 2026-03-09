import java.util.Scanner;

public class MedicalSystemUI{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Nurse nurse1 = null;
        Doctor doctor1 = null;
        //Setting an object to null means the reference variable exists
        //but does not point to an object yet. 
        //The object will be created later using the constructor.

        int choice;
        
        
        do {
            displayMenu();
            
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n--- Create Nurse ---");

                    System.out.print("Enter name: ");
                    String nName = input.nextLine();

                    System.out.print("Enter employee ID: ");
                    int nId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter department: ");
                    String nDept = input.nextLine();

                    System.out.print("Enter shift: ");
                    String nShift = input.nextLine();

                    System.out.print("Enter years of experience: ");
                    int nYears = input.nextInt();
                    input.nextLine();

                    nurse1 = new Nurse(nName, nId, nDept, nShift, nYears);
                    System.out.println("Nurse created successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Create Doctor ---");

                    System.out.print("Enter name: ");
                    String dName = input.nextLine();

                    System.out.print("Enter employee ID: ");
                    int dId = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter department: ");
                    String dDept = input.nextLine();

                    System.out.print("Enter specialization: ");
                    String dSpec = input.nextLine();

                    System.out.print("Enter salary: ");
                    double dSalary = input.nextDouble();
                    input.nextLine();

                    doctor1 = new Doctor(dName, dId, dDept, dSpec, dSalary);
                    System.out.println("Doctor created successfully.");
                    break;

                case 3:
                    System.out.println("\n--- View Nurse ---");
                    if (nurse1 == null) {
                        System.out.println("No nurse created yet. Choose option 1 first.");
                    } else {
                        System.out.println(nurse1); // calls toString()
                    }
                    break;

                case 4:
                    System.out.println("\n--- View Doctor ---");
                    if (doctor1 == null) {
                        System.out.println("No doctor created yet. Choose option 2 first.");
                    } else {
                        System.out.println(doctor1); // calls toString()
                    }
                    break;

                case 5:
                    System.out.println("\n--- Update Nurse Department ---");
                    if (nurse1 == null) {
                        System.out.println("No nurse created yet. Choose option 1 first.");
                    } else {
                        System.out.print("Enter new department: ");
                        String newDept = input.nextLine();
                        nurse1.setDepartment(newDept);
                        System.out.println("Department updated.");
                    }
                    break;
                
                case 6:
                    System.out.println("\n--- Update Nurse Shift ---");
                    if (nurse1 == null) {
                        System.out.println("No nurse created yet. Choose option 1 first.");
                    } else {
                        System.out.print("Enter new shift: ");
                        String newShift = input.nextLine();
                        nurse1.setShift(newShift);
                        System.out.println("Shift updated.");
                    }
                    break;    
                    
                case 7:
                    System.out.println("\n--- Update Doctor Salary ---");
                    if (doctor1 == null) {
                        System.out.println("No doctor created yet. Choose option 2 first.");
                    } else {
                        System.out.print("Enter new salary: ");
                        double newSalary = input.nextDouble();
                        input.nextLine();
                        doctor1.setSalary(newSalary);
                        System.out.println("Salary updated.");
                    }
                    break;
                    
                case 8:
                    System.out.println("\n--- Update Doctor Specialization ---");
                    if (doctor1 == null) {
                        System.out.println("No doctor created yet. Choose option 2 first.");
                    } else {
                        System.out.print("Enter new specialization: ");
                        String newSpecialization = input.nextLine();
                        input.nextLine();
                        doctor1.setSpecialization(newSpecialization);
                        System.out.println("Specialization updated.");
                    }
                    break;

                case 9:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);
        
    }
    public static void displayMenu() {
        System.out.println("\n=== Medical System Menu ===");
        System.out.println("1. Create Nurse");
        System.out.println("2. Create Doctor");
        System.out.println("3. View Nurse");
        System.out.println("4. View Doctor");
        System.out.println("5. Update Nurse Department");
        System.out.println("6. Update Nurse Shift");
        System.out.println("7. Update Doctor Salary");
        System.out.println("8. Update Doctor Specialization");
        System.out.println("9. Exit");
    }
}
