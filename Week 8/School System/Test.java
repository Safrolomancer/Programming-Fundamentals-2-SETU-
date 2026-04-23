
public class Test
{
    public static void main (String[] args){
        Teacher teacher = new Teacher ("Kristina", 1983,"kristina1983@gmail.com", "Math", "Science");
        Student student = new Student ("Max", 2005 , "mark2005@gmail.com ", 2 , "Kin");
        Principal principal = new Principal ("Viktor", 2000 , "viktor2000@gmail.com ", 27);
        System.out.println(teacher.displayInfo());
        System.out.println(student.displayInfo());
        System.out.println(principal.displayInfo());
    }
}