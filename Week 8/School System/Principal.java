public class Principal extends Person
{
    private int officeNumber ;
   
    public  Principal(String name, int yearOfBirth,String email,int officeNumber )
    {
        super(name, yearOfBirth, email);
        this.officeNumber = officeNumber;
    }
    public String displayInfo() {
     return super.displayInfo() + 
      ", Office Number: " + officeNumber ;
    }
    public String manageSchool()
    {
        return "Managing the school ! ";
    }
}