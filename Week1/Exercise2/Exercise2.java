import java.util.Scanner; // I asked to add util in java code. Scanner 

public class Exercise2
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // This line is adding the scanner to the system in my code 
    String firstName; // I made a variable without value. So it is like I have a label but there is nthing written and I will ask a user to fill it up. 
    String surName; // Just made another one variable with no value.
    
    System.out.println("Enter Username: " ); // It is just outpur with a text.
    firstName = sc.nextLine(); // Here I give a value. Actually not me but whoever is typing a text into a scanner. Important that it will be text even if I will enter numbers, cause the data is collecting as a String what means that everything is a text.
    
    System.out.println( " Firstname is " + firstName); // Here I ask to print output and just using connector + that add my text + String with a value that had been written by user.
    
    System.out.println( " Enter Surname: " ); // Just add a text to a programm to clarify the activity that should be done
    surName = sc.nextLine(); // The same way that I did it above. Now I ask a user to make a value for my String.
    // It is like a have crated a 2 bottles with a Strings, but they are empty and suppose to be filled up with something. And the line 6 and line 11 and 16 make my programe that the bottle could be not only with something that I have chose before, but with everything what I want.
    System.out.println( " Surname is : " + surName ); // Again. I just have a text and now my string surName has a value that had been enterd because of line 16. I mean Scanner took actions from keyboard and made a value for my String.
    // the first I pointed which String should be valued. I wrote a "surName" than I add connector = that literaly mean =. And "sc.nextLine();" ask a user to type something. And it will be a value of the string surName.
}
}