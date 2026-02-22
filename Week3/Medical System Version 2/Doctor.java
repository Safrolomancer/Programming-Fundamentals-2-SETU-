public class Doctor
{
    private String name;
    private int employeeId;
    private String department;
    
    private String specialization;
    private double salary;
    
    public Doctor(String name, int employeeId, String department, String specialization, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
        this.salary = salary;
    }
    
    public void printInfo() {
        System.out.println("Doctor information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}