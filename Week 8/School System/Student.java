public class Student extends Person
{
    private int gradeLevel ;
    private String nextOfKin;
   
    public Student(String name, int yearOfBirth,String email,int gradeLevel, String nextOfKin )
    {
        super(name, yearOfBirth, email);
        this.gradeLevel = gradeLevel;
        this.nextOfKin = nextOfKin ;
    }
      public String displayInfo() {
     return super.displayInfo() + 
      ", Grade Level: " + gradeLevel +
      ", Next Of Kin: " + nextOfKin ;
    }
    public String study()
    {
        return "Studying hard ! ";
    }
}