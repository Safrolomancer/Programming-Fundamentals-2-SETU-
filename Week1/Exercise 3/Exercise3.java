import javax.swing.JOptionPane;

public class Exercise3
{
    public static void main(String[] args){
    String firstName; // I made a variable without value. So it is like I have a label but there is nthing written and I will ask a user to fill it up. 
    String surName; // Just made another one variable with no value.
    
    firstName = JOptionPane.showInputDialog("Enter your surname:"); 
    surName = JOptionPane.showInputDialog("Enter your surname:");
    
    // By using the JOptionPane I removed at least some liines of code, and I kinda depict what I want and ask to type in at hte same time that will save some time, and storage of the code 
    
    System.out.println("First name is: " + firstName);
    System.out.println(" Surname is: " + surName);
}
}