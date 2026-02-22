public class Nurse
{
    private String name;
    private int employeeId;
    private String department;
    
    private String shift;
    private int yearsOfExperience;
    

    public Nurse(String name, int employeeId, String department, String shift, int yearsOfExperience) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }
    
   
    public void printInfo() {
        System.out.println("Nurse information:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
        System.out.println("Years of experience: " + yearsOfExperience);
        System.out.println();
    }
    
}