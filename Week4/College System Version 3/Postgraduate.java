public class Postgraduate
{
    private String name;
    private int studentId;
    private String program;
    private String researchArea;
    private String supervisor; 

    public Postgraduate(String name, int studentId, String program, String researchArea, String supervisor){
        this.name = name;
        this.studentId = studentId;
        this.program = program;
        this.researchArea = researchArea;
        this.supervisor = supervisor;
    }

    public void printInfo() {
        System.out.println("Postgraduate Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Program: " + program);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Supervisor: " + supervisor);
    }

    @Override
    public String toString() {
        return "Postgraduate name: " + name
        + ", \nID: " + studentId
        + ", \nProgram: " + program
        + ", \nResearch Area: " + researchArea
        + ", \nSupervisor: " + supervisor;
    }

    public String getName()
    {
        return name;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getProgram()
    {
        return program;
    }

    public String getResearchArea()
    {
        return researchArea;
    }

    public String getSupervisor()
    {
        return supervisor;
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

    public void setProgram(String program)
    {
        this.program = program;
    }

    public void setResearchArea(String researchArea)
    {
        this.researchArea = researchArea;
    }

    public void setSupervisor(String supervisor)
    {
        this.supervisor = supervisor;
    }
}


