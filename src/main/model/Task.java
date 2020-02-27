package model;

import java.io.Serializable;

// This is a single item that must be completed that is on the todolist
public class Task implements Serializable {
    private String description;
    //private int deadline;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        //this.deadline = deadline;
        this.isCompleted = false;
    }

    // EFFECTS: Returns description of task
    public String getDescription() {
        return description;
    }

    /*// EFFECTS: Returns deadline of task
    public int getDeadline() {
        return deadline;
    }*/

    public void completeTask() {
        isCompleted = true;
    }


    // EFFECTS: Returns if task is completed
    public boolean getIsCompleted() {
        return isCompleted;
    }
}
