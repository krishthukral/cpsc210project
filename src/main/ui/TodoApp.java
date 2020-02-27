package ui;

import model.*;

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private TodoList list = new TodoList();
    private String first;
    private String last;
    private String savedTask;
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

        doLoad();
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
            doSave();
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
        savedTask = task;
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


    // EFFECTS: saves state of todolist to a file
    private void doSave() {
        try {
//            Task t = new Task("gay");
//            TodoList l = new TodoList();
//            l.addTask("cow");
//            l.addTask("chicken");
//            l.addTask("pig");


            FileOutputStream fileOut =
                    new FileOutputStream("./data/myFile.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(list);

            //
            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }



    private void doLoad() {
        Task mas;
        String str = "";
        try {
            FileInputStream fileIn = new FileInputStream("./data/myFile.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            TodoList l1 = (TodoList) in.readObject();
            for (int i = 0; i < l1.sizeOfList(); i++) {
                list.addTask(l1.getTask(i).getDescription());
            }

            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Task class not found");
            c.printStackTrace();
            return;
        }


        //System.out.println("Task: " + mas.getDescription());

    }


    // EFFECTS: displays menu of options to user
    private void displayMenu() {
        System.out.println("\n Hi" + " " + first + " " + last + " " + "select from:");
        System.out.println("\ta -> to add a task");
        System.out.println("\tr -> to remove a task");
        System.out.println("\tn -> number of items");
        System.out.println("\tp -> print to screen");
        System.out.println("\ts -> save todolist");
        System.out.println("\tq -> quit");

    }


}
