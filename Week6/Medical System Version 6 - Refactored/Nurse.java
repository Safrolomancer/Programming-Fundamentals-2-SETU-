public class Nurse
{
    // 1. Create Attributes/Instance Variables

    private String name;
    private int employeeId;
    private String department;

    private String shift;
    private int yearsOfExperience; 

    public Nurse(String name, int employeeId, String department, String shift, int yearsOfExperience) 
    {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
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

    public String getShift()
    {
        return shift;
    }

    public int getYearsOfExperience()
    {
        return yearsOfExperience;
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

    public void setShift(String shift)
    {
        this.shift = shift;
    }

    public void setYearsOfExperience(int yearsOfExperience)
    {
        if(yearsOfExperience >=0)
        {
            this.yearsOfExperience = yearsOfExperience;
        }
    }

    public double bonus()
    {
        if (yearsOfExperience <= 5)
        {
            return 0.0;
        }
        else
        {
            int extraYears = yearsOfExperience - 5;
            return extraYears * 1000.0;
        }
    }

    @Override
    public String toString() {
        return "Nurse Name: " + name
        + ", ID: " + employeeId 
        + ", Department: " + department 
        + ", Shift: " + shift 
        + ", Years of Experience: " + yearsOfExperience;
    }

}
