public class MedicalTest
{
    public static void main(String[] args) {
        Nurse nurse_1 = new Nurse("Alice", 1, "Emergency", "Day", 5); //creates an object type of Nurse
        nurse_1.printInfo();
        
        Doctor doctor_1 = new Doctor("Dr. John Murphy", 10001, "Surgery", "Surgeon", 30000);
        doctor_1.printInfo();
        
        Nurse nurse_2 = new Nurse("Lara Collins", 2, "Therapy", "Night", 2);
        nurse_2.printInfo();
        
        Doctor doctor_2 = new Doctor("Sean Johnson", 10002, "Cardiology", "Heart Specialist", 45000);
        doctor_2.printInfo();
    }
}