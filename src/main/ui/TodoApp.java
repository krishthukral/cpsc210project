package ui;

import model.*;
import persistence.*;

import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static final String TodoLists_FILE = "./data/todolists.txt";
    private TodoList list = new TodoList();
    private String first;
    private String last;
    private Scanner input;

    public TodoApp() {
        runTodoApp();
    }

    // MODIFIES: this
    // EFFECTS: initializes accounts
    private void init() {


    }

    private void introduction() {
        input = new Scanner(System.in);

        System.out.println("Hi what is your First Name?");
        first = input.next();

        System.out.println("What is your Last Name?");
        last = input.next();

    }

    //TELLER APP CITATION
    // MODIFIES: this
    // EFFECTS: processes user input
    private void runTodoApp() {
        boolean keepGoing = true;
        String command = null;
        input = new Scanner(System.in);
        introduction();

        while (keepGoing) {

            displayMenu();
            command = input.next();
            command = command.toLowerCase();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }
        System.out.println("\nGOODBYE");
    }

    //TELLER APP CITATION
    // MODIFIES: this
    // EFFECTS: processes user command
    private void processCommand(String command) {
        if (command.equals("a")) {
            doAddTask();
        } else if (command.equals("r")) {
            doRemoveTask();
        } else if (command.equals("p")) {
            doViewList();
        } else if (command.equals("m")) {
            //doMarkComplete();
        } else if (command.equals("n")) {
            doCount();
        } else if (command.equals("s")) {
            saveTodoList();
        } else {
            System.out.println("Selection not valid...");
        }
    }

    //boolean keepGoing = true;
    //String command = null;
    //input = new Scanner(System.in);

    //EFFECTS: Adds task to array
    private void doAddTask() {
        input = new Scanner(System.in);

        System.out.println("What is your task's name?");
        String task = input.next();
        list.addTask(task);

    }

    private void doRemoveTask() {
        input = new Scanner(System.in);

        System.out.println("Which task do you want to remove?");
        String task = input.next();
        list.deleteTask(task);
    }

    //
    private void doViewList() {
        for (int i = 0; i < list.sizeOfList(); i++) {
            System.out.println(i + 1 + ". " + list.getTask(i).getDescription());
        }
    }

    private void doCount() {
        int count = 0;
        for (int i = 0; i < list.sizeOfList(); i++) {
            count++;
        }
        System.out.println(count);
    }

    private void doMarkComplete() {
        input = new Scanner(System.in);

        System.out.println("Which task do you want to mark complete?");
        String str = input.next();

    }

    // EFFECTS: saves state of chequing and savings accounts to TodoList_FILE
    private void saveTodoList() {
        try {
            Writer writer = new Writer(new File(TodoLists_FILE));
            writer.write(list);
            writer.close();
            System.out.println("Accounts saved to file " + TodoLists_FILE);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to save accounts to " + TodoLists_FILE);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            // this is due to a programming error
        }
    }

    // EFFECTS: displays menu of options to user
    private void displayMenu() {
        System.out.println("\n Hi" + " " + first + " " + last + " " + "select from:");
        System.out.println("\ta -> to add a task");
        System.out.println("\tr -> to remove a task");
        System.out.println("\tn -> number of items");
        System.out.println("\tp -> print to screen");
        System.out.println("\ts -> save accounts to file");
        System.out.println("\tq -> quit");
    }


}
