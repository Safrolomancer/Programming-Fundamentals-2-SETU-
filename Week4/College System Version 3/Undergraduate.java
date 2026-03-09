public class Undergraduate
{
    private String name;
    private int studentId;
    private String major;
    private int yearLevel;
    private double gpa;

    public Undergraduate(String name, int studentId, String major, int yearLevel, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.major = major;
        this.yearLevel = yearLevel;
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println("Undergraduate Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("major: " + major);
        System.out.println("Research Area: " + yearLevel);
        System.out.println("GPA: " + gpa);
    }

    @Override
    public String toString() {
        return "Undergraduate name: " + name
        + ", \nID: " + studentId
        + ", \nmajor: " + major
        + ", \nResearch Area: " + yearLevel
        + ", \nGPA: " + gpa;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getMajor()
    {
        return major;
    }

    public int getYearLevel()
    {
        return yearLevel;
    }

    public double getGpa()
    {
        return gpa;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setStudentId(int studentId)
    {
        do
        {
            if (studentId >= 0)
                this.studentId = studentId;
            else
                System.out.println("!");
        } while (studentId <= 0);
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public void setYearLevel(int yearLevel)
    {
        do
        {
            if (yearLevel >= 0)
                this.yearLevel = yearLevel;
            else
                System.out.println("!");
        } while (yearLevel <= 0);
    }

    public void setGpa(double gpa)
    {
        do
        {
            if (gpa >= 0)
                this.gpa = gpa;
            else
                System.out.println("!");
        } while (gpa <= 0);
    }
}

