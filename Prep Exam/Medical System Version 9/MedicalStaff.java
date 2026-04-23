public class MedicalStaff {

    protected String name;
    protected int employeeId;
    protected String department;

    public MedicalStaff(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return " Name: " + name +
               ", ID: " + employeeId +
               ", Department: " + department ;
    }
}
