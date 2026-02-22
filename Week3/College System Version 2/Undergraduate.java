public class Undergraduate
{
   private String name;
   private String major;
   private int studentId;
   private int yearLevel;
   private double GPA;
   
   public Undergraduate(String name, String major, int studentId, int yearLevel, double GPA) {
       this.name = name;
       this.major = major;
       this.studentId = studentId;
       this.yearLevel = yearLevel;
       this.GPA = GPA;
   }
   
   public void printInfo() {
       System.out.println("Undergraduate student information:");
       System.out.println("Name: " + name);
       System.out.println("Major: " + major);
       System.out.println("Student ID: " + studentId);
       System.out.println("Year level: " + yearLevel);
       System.out.println("GPA: " + GPA);
       System.out.println();
   }
}