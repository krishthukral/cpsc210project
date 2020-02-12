package model;



import java.util.ArrayList;
import java.util.*;

public class TodoList {
    private ArrayList<Task> taskList;
    private ArrayList<Task> completed;
    private ArrayList<Task> incomplete;

    public TodoList() {

        taskList = new ArrayList<>();
        completed = new ArrayList<>();
        incomplete = new ArrayList<>();
        // stub
    }

    // MODIFES : this
    // EFFECTS: adds task to a Todo list
    public void addTask(String str) {
        Task t = new Task(str);
        taskList.add(t);
        // stub
    }

    // MODIFES : this
    // EFFECTS: removes task to a Todo list
    public void deleteTask(String str) {
        for (int i = 0; i < taskList.size(); i++) {
            if (str.equals(taskList.get(i).getDescription())) {
                taskList.remove(i);
            }
        }

        // stub
    }



    // EFFECTS: To String
    //
    //
    //
    /*@Override
    public String toString() {
        String str = "";
        for (int i = 0; i < taskList.size(); i++) {
            str = str + i + "." + taskList.get(i).getDescription() + "\n";

        }
        return str;
    }*/

    // EFFECTS: Goes through the list and puts them in Completed and Incompleted lists respectively
    /*public void completedList() {
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getIsCompleted() == true) {
                completed.add(taskList.get(i));

            } else if (taskList.get(i).getIsCompleted() == false) {
                incomplete.add(taskList.get(i));
            }
        }
    }*/


    /*//EFFECTS: Switches isCompleted to true if user inputs it to be true
    public void markComplete(String str){
        for (int i = 0; i < taskList.size(); i++) {
            if (str.equals(taskList.get(i).getDescription())) {
                //
            }
        }

    }*/


    // EFFECTS: Returns the size of the list
    public int sizeOfList() {
        int x = 0;
        x = taskList.size();
        return x;
    }

    // EFFECTS: Returns task from list of tasks
    public Task getTask(int i) {

        return taskList.get(i);
    }
}


