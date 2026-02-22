
public class MedicalTest
{
    public static void main(String[] args)
    {
    
        Nurse nurse1 = new Nurse();
        
        nurse1.name = " Alice Johnson " ;
        nurse1.id = 001;
        nurse1.department = " AID ";
        nurse1.shift = " Night "; 
        nurse1.yearsOfExperience = 3;
        
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" INFO ABOUT NURSE:");
        System.out.println( " Name " + nurse1.name );
        System.out.println( " Id " + nurse1.id );
        System.out.println( " Dep " + nurse1.department );
        System.out.println( " Shift " + nurse1.shift );
        System.out.println( " Experience " + nurse1.yearsOfExperience );
        System.out.println();
        System.out.println(" Updated Name: " + nurse1.name );
        System.out.println();
        
        Doctor doctor1 = new Doctor(); // I declare a new storage and named it docotr1 with a template from class Doctor 
        
        doctor1.name = " Dr. BlaBlaBla ";
        doctor1.id = 001;
        doctor1.department = " Surgery "; 
        doctor1.spec = " Neuro ";
        doctor1.salary = 1200000;
        
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" INFO ABOUT DOCTOR:");
        System.out.println( " Name " + doctor1.name );
        System.out.println( " Id " + doctor1.id );
        System.out.println( " Dep " + doctor1.department );
        System.out.println( " Spec " + doctor1.spec );
        System.out.println( " Salary " + doctor1.salary );
        System.out.println();
        
        Doctor doctor2 = new Doctor();
        Nurse nurse2 = new Nurse();
        
        doctor2.name = " Dr. Java Script ";
        doctor2.id = 002;
        doctor2.department = " Dantist "; 
        doctor2.spec = " General ";
        doctor2.salary = 300000;
        
        nurse2.name = " Lemon Tart " ;
        nurse2.id = 002;
        nurse2.department = " Assistant ";
        nurse2.shift = " Morning "; 
        nurse2.yearsOfExperience = 50;
        
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" INFO ABOUT NURSE:");
        System.out.println( " Name " + nurse2.name );
        System.out.println( " Id " + nurse2.id );
        System.out.println( " Dep " + nurse2.department );
        System.out.println( " Shift " + nurse2.shift );
        System.out.println( " Experience " + nurse2.yearsOfExperience );
        System.out.println();
        
        System.out.println("=========================================");
        System.out.println();
        System.out.println(" INFO ABOUT DOCTOR:");
        System.out.println( " Name " + doctor2.name );
        System.out.println( " Id " + doctor2.id );
        System.out.println( " Dep " + doctor2.department );
        System.out.println( " Spec " + doctor2.spec );
        System.out.println( " Salary " + doctor2.salary );
        System.out.println();
        
        
        
        
    
    }
}
