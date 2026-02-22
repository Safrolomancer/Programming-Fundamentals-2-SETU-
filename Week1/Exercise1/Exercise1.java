public class Exercise1
{
    public static void main(String[] args)  // This is the main line of code that depict everything from other classes to instruct them what they have to do etc.
    {
         String firstName = "Cat";   // This is a variable that store data as a String meaning only letters, and we gave a name fistName of this variable with instant meaning "Cat"
         String surName = "Fitz"; // The same way we did it here, but changing the template 
         
         System.out.println("First Name is " + firstName.toUpperCase()); // We are ask code to print everything what is in a brecets. And we are using connector + to combine output from variable. Than we assk to print variable in Uppercase.
         System.out.println("Surname is " + surName.toLowerCase()); // The same we are doing it here but asking to print output from variable in lower case. It is like to values that adding to each other by using + 
         System.out.println(firstName.length()); // Here I ask to output the lenght of my String , I just added .length() to the name of a string and that is it. I did it because in a future the variable I mean string could be changed by asking a user to define the String and the length could be changed.
         System.out.println(surName.length()); // The same way i did it here.
    
    }
}