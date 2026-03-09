public class Nurse {
    private String name;
    private int employeeId;

    public Nurse(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Nurse  {" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
