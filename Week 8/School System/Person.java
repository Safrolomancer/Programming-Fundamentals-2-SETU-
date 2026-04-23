

public class Person
{
    protected String name;
    protected int yearOfBirth;
    protected String email;
    public Person(String name, int yearOfBirth,String email){
     this.name = name;
     this.yearOfBirth = yearOfBirth;
     this.email = email;
    }
    public String displayInfo() {
     return "Name: "+ name + 
     ", Year of Birth: " +yearOfBirth +
     ", Email: " + email;
    }
  
}