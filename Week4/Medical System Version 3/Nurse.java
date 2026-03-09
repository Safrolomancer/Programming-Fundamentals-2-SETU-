public class Nurse
{
    // 1. Create Attributes/Instance Variables

    private String name;
    private int employeeId;
    private String department;

    private String shift;
    private int yearsOfExperience; 

    //2. Constructor Method
    public Nurse(String name, int employeeId, String department, String shift, int yearsOfExperience){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }
    
        public void printInfo() {
        System.out.println("Nurse Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }

    @Override
    public String toString() {
        return "Nurse name: " + name
        + ", \nID: " + employeeId
        + ", \nDepartment: " + department
        + ", \nShift: " + shift
        + ", \nYears of experience: " + yearsOfExperience;
    }
    
    /*public String setName(String nameIn)
    {
        return name = nameIn;
    }*/
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    } 
    
    public void setDepartment(String department)
    {
        this.department = department;
    } 
    
    public void setShift(String shift)
    {
        this.shift = shift;
    }
    
    public void setYearsOfExperience(int yearsOfExperience)
    {
        this.yearsOfExperience = yearsOfExperience;
    } 
    
    public String getName()
    {
        return name;
    }
    
    public int getEmployeeId()
    {
        return employeeId;
    } 
    
    public String getDepartment()
    {
        return department;
    } 
    
    public String getShift()
    {
        return shift;
    }
    
    public int getYearsOfExperience()
    {
        return yearsOfExperience;
    } 
}


