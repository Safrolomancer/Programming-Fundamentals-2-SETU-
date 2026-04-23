public class Nurse extends MedicalStaff {

    private String shift;
    private int yearsOfExperience;

    public Nurse(String name, int employeeId, String department, String shift, int yearsOfExperience)
    {
        super(name, employeeId, department);

        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getShift() {
        return shift;
    }
    public void setShift(String shift)
    { 
        this.shift = shift;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String toString() {
        return super.toString() +
               ", Shift: " + shift +
               ", Experience: " + yearsOfExperience + " \n";
    }
}

