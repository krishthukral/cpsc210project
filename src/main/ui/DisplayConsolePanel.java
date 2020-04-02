package ui;

import exception.EmptyException;

public class DisplayConsolePanel extends TodoApp {

    public DisplayConsolePanel() throws EmptyException {
    }

    //TELLER APP CITATION
    // MODIFIES: this
    // EFFECTS: processes user command
    protected void processCommand(String command) throws EmptyException {
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
        } else if (command.equals("c")) {
            doClear();
        } else {
            System.out.println("Selection not valid...");
        }
    }
}
