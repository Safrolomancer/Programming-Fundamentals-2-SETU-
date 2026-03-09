public class CollegeTest {

    public static void main(String[] args)
    {
        Undergraduate undergrad1 = new Undergraduate("Emily Carter", 1001, "Computer Scince", 2, 3.6);
        
        Undergraduate undergrad2 = new Undergraduate("Michael Johnson", 1002, "Software Development", 3, 3.2);
        
        Postgraduate postgrad1 = new Postgraduate("Daniel Lee", 2001, "MSc Computer Science", "Artificial Intelligence", "Dr. Brown");
        
        Postgraduate postgrad2 = new Postgraduate("Sophia Wilson", 2002, "MSc Data Science", "Machine Learning", "Dr. Smith");
        
        System.out.println(undergrad1);
        System.out.println();
        System.out.println(undergrad2);
        
        System.out.println("----------------------------");
        
        System.out.println(postgrad1);
        System.out.println();
        System.out.println(postgrad2);
    }
}
