import java.util.Scanner;
//import ArrayList class
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Create an arraylist called listOfNurses<> that can store objects of type Nurse
        ArrayList<Nurse> listOfNurses = new ArrayList<>();
        //Method 1 - Create 3 nurse different Nurse objects and assign to the elements of the array
        //Add each nurse object to the arraylist
        Nurse nurse1 = new Nurse("Alice", 101, "ER", "Night", 5);
        Nurse nurse2 = new Nurse("Maria", 102, "ICU", "Day", 3);
        Nurse nurse3 = new Nurse("James", 103, "Surgery", "Night", 8);
        listOfNurses.add(nurse1);
        listOfNurses.add(nurse2);
        listOfNurses.add(nurse3);
        //OR 
        //Method 2 - Create a nurse object and add it to the arraylist directly
        //listOfNurses.add(new Nurse("Alice", 101, "ER", "Night", 5));
        //Print the contents of the arraylist by calling each toString() inside a for loop
        System.out.println("--- Nurses in ArrayList ---");
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i));
        }
        //Change Marias Department from ICU to Pediatrics
        listOfNurses.get(1).setDepartment("Pediatrics");
        //Print again
        System.out.println("\n--- After Update ---");
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i));
        }

        //=================================================================EXERCISE1===============================

        //Exercise 1:
        System.out.println();
        System.out.println("\n--- After Exercise 1 ---"); 
        // Add a new nurse
        listOfNurses.add(new Nurse("Killian", 105, "Cardiology", "Day", 18)); // Just was checking can I use two ways of adding in one code
        // Print the arraylist again
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i));
        }

        //=================================================================EXERCISE2===============================
        //Exercise 2:
        System.out.println();
        System.out.println("\n--- After Exercise 2 ---");
        //Print only the second nurse - Maria
        System.out.println("Second nurse:" + nurse2);
        System.out.println("Second Nurse: " + listOfNurses.get(1));
        // Print the fourth nurse object in the arraylist
        System.out.println("Fourth Nurse: " + listOfNurses.get(3));

        //=================================================================EXERCISE3===============================
        // Exercise 3:
        System.out.println();
        System.out.println("\n--- After Exercise 3 ---"); 
        //=================================================FOUND THE TEMPLATE AT STACKOFVERFLOW===============================
        //Print Nurse James object 
        //for (int i = 0; i<listOfNurses.size(); i++){  
        // if (listOfNurses.get(i).contains("James")) {
        //  System.out.println("Jame is nurse n. " + i);
        // System.out.println("Nurse James is: " + listOfNurses.get(i));
        // }
        //}  
        // boolean whoIsJames = listOfNurses.contains("James");
        // System.out.println("Info about James: " + whoIsJames );

        System.out.println("Jame is " + listOfNurses.get(2));
        // Change Nurse James’ shift to "Day"
        listOfNurses.get(2).setShift("Day");
        //Print Nurse James object to see the change
        System.out.println("Jame is " + listOfNurses.get(2));

        //=================================================================EXERCISE4===============================
        // Exercise 4:  
        System.out.println();
        System.out.println("\n--- After Exercise 4 ---"); 
        // Replace the nurse object at index 1 
        listOfNurses.set(1, new Nurse("Sophia", 104, "Oncology", "Evening", 6));
        // Print the arraylist again
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i));
        }

        // Exercise 5:
        System.out.println();
        System.out.println("\n--- After Exercise 5 ---"); 
        // Replace the nurse object at index 0
        listOfNurses.remove(0);

        //Print the arraylist again
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i));
        }
        //TODO - what happened the arraylist and the indexes?

        // Exercise 6:
        System.out.println();
        System.out.println("\n--- After Exercise 6 ---"); 
        // Check if the arraylist is empty or not:
        if (listOfNurses.isEmpty())
        {
            System.out.println("No nurses stored.");
        }
        else
        {
            System.out.println("Nurses exist.");
        }

        // Exercise 7:
        System.out.println();
        System.out.println("\n--- After Exercise 7 ---"); 
        //Print all Nurse names - using size() and get() and getName()
        for (int i = 0; i < listOfNurses.size(); i++)
        {
            System.out.println(listOfNurses.get(i).getName());
        }

    }
}