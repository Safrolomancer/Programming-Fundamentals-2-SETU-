public class Doctor extends MedicalStaff {

    private String specialization;
    private double salary;

    public Doctor(String name, int employeeId, String department,
                  String specialization, double salary) {

        super(name, employeeId, department);

        this.specialization = specialization;
        this.salary = salary;
    }
 
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String toString() {
        return super.toString() +
               ", Salary: " + salary +
               ", Specialization: " + specialization +"\n";
    }
}

