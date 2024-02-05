/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolisting;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TodoListing {

    public static ArrayList<String> tasks = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("\n===================================\n"
                        + "Welcome to Notes."
                        + "\n===================================\n");
                System.out.println("1.Add notes.\n"
                        + "2.Remove notes.\n"
                        + "3.Edit notes.\n"
                        + "4.Displaying.\n"
                        + "5.Exit\n"
                        + "Enter  your choices...");
                String choice = scan.next();

                switch (choice) {
                    case "1":
                        addTask(scan);
                        break;
                    case "2":
                        DeleteTask(scan);
                        break;
                    case "3":
                        EditTask(scan);
                        break;
                    case "4":
                        Display();
                        break;
                    case "5":
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Thank you for using Notes");
                }
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }

    public static void addTask(Scanner scan) {//This is a function/Method for adding notes/task.
        System.out.println("\t\t\t Where will be entering yours notes \t\t\t");
        //String again;
        int again;//This variable will be in use when the user wants to enter other note or notes
        try {

            do {//This do-while loop works to ask for the input of the first note and then ask if the user wants to other note or task
                System.out.print("Enter your note: ");
                String note = scan.next().toLowerCase();
                if (tasks.contains(note) != true) {//this conditional checks if the note or task is already in the system or in this case memory
                    tasks.add(note);//this is the ArrayList that will be storing each note or task 
                } else {
                    System.out.println("task already added.\n Try again... ");
                }
                System.out.println("Want to add other note (0 - stop) or (1 - add)...");
                again = scan.nextInt();
            } while (again != 0);
        } catch (Exception error) {

            System.err.println(error.getStackTrace());
        }
    }

    public static void DeleteTask(Scanner scan) {//This is a function/Method for deletung  notes/task.
        System.out.println("Here will be deleting tasks completed...");
        System.out.print(" Enter the task you want to delete:");
        String deleteTask = scan.next().toLowerCase();
        try {
            tasks.forEach((n) -> {//This foreach loop goes through the ArrayList 
                if (n.matches(deleteTask)) {//Checks if the input note match in the item in the ArraList
                    tasks.remove(n.indexOf(deleteTask));//And this then it delete the note from the index of the input.
                    System.out.println("removed");
                }
                // System.out.println(n);
            });
        } catch (Exception error) {
            System.err.println(error.getMessage());
        }
    }

    public static void Display() {//This function/Method for displaying the items stored in the memory
        try {
            System.out.println("\t\t\t\t Listing all the Tasks stored in memory \t\t\t\t");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("-->" + tasks.get(i));
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }

    public static void EditTask(Scanner scan) {//This function/Method is for editing an note a specific index
        try {
            System.out.println("You will Editing any task you want...");
            System.out.println("Choose  The Task You Want To Edit: ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("=>" + tasks.get(i));
            }
            String taskName = scan.next().toLowerCase();
            if (tasks.indexOf(taskName) != -1) {//This conidional statement checks if the wanted task/note to be edit is found
                System.out.println("Found");
                System.out.println("Enter the change name: ");
                String changeTask = scan.next().toLowerCase();//This inputs is the changed task/note
                tasks.set(tasks.indexOf(taskName), changeTask);//this changes the original with the new input at its specific index
                System.out.println("changed");
            } else {
                System.out.println("Not Found");
            }
        } catch (Exception p) {
            System.out.println(p.getMessage());
        }
    }
}
