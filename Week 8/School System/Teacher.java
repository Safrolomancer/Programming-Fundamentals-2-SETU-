
public class Teacher extends Person
{
    private String subject;
    private String department;
   
    public Teacher(String name, int yearOfBirth,String email,String subject, String department )
    {
        super(name, yearOfBirth, email);
        this.subject = subject;
        this.department = department ;
    }
    public String displayInfo() {
     return super.displayInfo() + 
      ", Subject: " + subject +
      ", Department: " + department ;
    }
    public String teach()
    {
        return "Teaching class! ";
    }
}