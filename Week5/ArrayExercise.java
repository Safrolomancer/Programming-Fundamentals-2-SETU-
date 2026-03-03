import java.util.Scanner;

public class ArrayExercise {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create array called nurses[] with 3 elements:
        Nurse[] nurses = new Nurse[3];

        //Create 3 nurse different Nurse objects and assign to the elements of the array
        nurses[0] = new Nurse("Alice", 101, "ER", "Night", 5);
        nurses[1] = new Nurse("Maria", 102, "ICU", "Day", 3);
        nurses[2] = new Nurse("James", 103, "Surgery", "Night", 8);

        //Print the contents of the array by calling each toString() inside a for loop
        System.out.println("--- Nurses in Array ---");

        for (int i = 0; i < nurses.length; i++)
        {
            System.out.println(nurses[i]); // calls toString()
        }

        //Change Marias Department from ICU to Pediatrics
        nurses[1].setDepartment("Pediatrics");

        //Print again
        System.out.println("\n--- After Update ---");

        for (int i = 0; i < nurses.length; i++)
        {
            System.out.println(nurses[i]);
        }

        //Exercise 1:
        System.out.println(nurses[0].getName());
        System.out.println("\n--- After Exercise 1 ---"); 

        // Print the name of the first nurse
        System.out.println(nurses[0].getName());
        // Print the department of the second nurse
        System.out.println(nurses[1].getDepartment());
        // Print the years of experience of the third nurse
        System.out.println(nurses[2].getYearsOfExperience());

        //Exercise 2:
        System.out.println();
        System.out.println("\n--- After Exercise 2 ---");
        // Change Alice → change shift to "Day"
        nurses[0].setShift("Day");
        // Change James→ change shift to "Day"
        nurses[2].setShift("Day");
        // Print Array again
        for (int i = 0; i < nurses.length; i++)
        {
            System.out.println(nurses[i]);
        }
        // Exercise 3:
        System.out.println();
        System.out.println("\n--- After Exercise 3 ---");   
        // Use getters and a loop to calculate total years of experience
        int totalExperience = 0;
        for (int i = 0; i < nurses.length; i++)
        {
            totalExperience += nurses[i].getYearsOfExperience();
        }
        System.out.println(" Total Experience " + totalExperience);
        // Exercise 4:  
        System.out.println();
        System.out.println("\n--- After Exercise 4 ---"); 
        // Use getters, a loop and an if statement to find and print nurse ID 102
        for (int i = 0; i < nurses.length; i++)
        {   if(nurses[1].getEmployeeId()==102){
                System.out.println(nurses[i]);
            }
        }
    }}