public class Postgraduate
{
    private String name;
    private String program;
    private String researchArea;
    private String supervisor;
    private int studentId;
    
    public Postgraduate(String name, String program, String researchArea, String supervisor, int studentId) {
       this.name = name;
       this.program = program;
       this.researchArea = researchArea;
       this.supervisor = supervisor;
       this.studentId = studentId;
   }
   
   public void printInfo() {
       System.out.println("Postgraduate student information:");
       System.out.println("Name: " + name);
       System.out.println("Program: " + program);
       System.out.println("Research Area: " + researchArea);
       System.out.println("Supervisor: " + supervisor);
       System.out.println("Student ID: " + studentId);
       System.out.println();
   }
}