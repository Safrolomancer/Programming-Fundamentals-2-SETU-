public class Doctor
{
    // Create attributes/Instance Variables

    private String name;
    private int employeeId;
    private String department;

    private String specialization;
    private double salary;

    public Doctor(String name, int employeeId, String department, String specialization, double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
        this.salary = salary;
    }

    /* public void printInfo() {
        System.out.println("Doctor Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: €" + salary);
    }*/
    
    @Override
    public String toString() {
        return "Doctor name: " + name
        + ", \nID: " + employeeId
        + ", \nDepartment: " + department
        + ", \nSpecialization: " + specialization
        + ", \nSalary: " + salary;
    }
    
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
    
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
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
    
    public String getSpecialization()
    {
        return specialization;
    }
    
    public double getSalary()
    {
        return salary;
    } 
}

