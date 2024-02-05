/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolisting;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class TodoListingIT {

    ArrayList<String> store = new ArrayList<>();

    public TodoListingIT() {
    }

    /**
     * Test of main method, of class TodoListing.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"pop1", "pop2"};
        TodoListing.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addTask method, of class TodoListing.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        Scanner scan = new Scanner(System.in);
        TodoListing.addTask(scan);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of DeleteTask method, of class TodoListing.
     */
    @Test
    public void testDeleteTask(){
        System.out.println("DeleteTask");
        Scanner scan = new Scanner(System.in);
        try{
            TodoListing.DeleteTask(scan);

        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Display method, of class TodoListing.
     */
    @Test
    public void testDisplay() {
        System.out.println("Display");
        TodoListing.Display();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of EditTask method, of class TodoListing.
     */
    @Test
    public void testEditTask() {
        System.out.println("EditTask");
        Scanner scan = new Scanner(System.in);
        TodoListing.EditTask(scan);
        // TODO review the generated test code and remove the default call to fail.
    }

}
