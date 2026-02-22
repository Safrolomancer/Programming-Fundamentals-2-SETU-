
public class CollegeTest
{
    public static void main(String[] args){
    
    Undergraduate under1 = new Undergraduate();
    Postgraduate post1 = new Postgraduate();
    
        under1.name = " Emily Carter ";
        under1.Id = 1001;
        under1.major = " CS "; 
        under1.yearLvl = 2;
        under1.gpa = 3.6;
        
        post1.name = " Daniel See ";
        post1.Id = 2001;
        post1.program = " MSc CS "; 
        post1.researchArea = " AI ";
        post1.supervisor = " Dr. Yellow ";
    
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" Undergraduate Student:");
        System.out.println( " Name " + under1.name );
        System.out.println( " Id " + under1.Id );
        System.out.println( " Major " + under1.major );
        System.out.println( " Year " + under1.yearLvl );
        System.out.println( " GPA " + under1.gpa );
        System.out.println(); 
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" Postgraduate Student: ");
        System.out.println( " Name " + post1.name );
        System.out.println( " Id " + post1.Id );
        System.out.println( " Program " + post1.program );
        System.out.println( " Research Area: " + post1.researchArea );
        System.out.println( " Supervisor " + post1.supervisor );
        System.out.println();
    
        
        Undergraduate under2 = new Undergraduate();
    Postgraduate post2 = new Postgraduate();
    
        under2.name = " Jimbo ";
        under2.Id = 1111;
        under2.major = " Art "; 
        under2.yearLvl = 3;
        under2.gpa = 4.0;
        
        post2.name = " Mimimi ";
        post2.Id = 2234;
        post2.program = " Architecture "; 
        post2.researchArea = " Military Base ";
        post2.supervisor = " Dr. Pink ";
    
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" Undergraduate Student:");
        System.out.println( " Name " + under2.name );
        System.out.println( " Id " + under2.Id );
        System.out.println( " Major " + under2.major );
        System.out.println( " Year " + under2.yearLvl );
        System.out.println( " GPA " + under2.gpa );
        System.out.println(); 
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" Postgraduate Student: ");
        System.out.println( " Name " + post2.name );
        System.out.println( " Id " + post2.Id );
        System.out.println( " Program " + post2.program );
        System.out.println( " Research Area: " + post2.researchArea );
        System.out.println( " Supervisor " + post2.supervisor );
        System.out.println();
    
    
    
    
    }
}