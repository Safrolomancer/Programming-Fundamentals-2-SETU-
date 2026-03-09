public class Doctor
{
    

    private String name;
    private int employeeId;
    private String department;

    private String specialization;
    private double salary;

    public Doctor(String name, int employeeId, String department, String specialization, double salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.specialization = specialization;
        this.salary = salary;
    }
    // Getters
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

    // Setters
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

    @Override
    public String toString() {
        return "Doctor Name: " + name
        + ", ID: " + employeeId 
        + ", Department: " + department 
        + ", Specialization: " + specialization 
        + ", Salary Euro: " + salary;
    }
}

