package ui;

import exception.EmptyException;
import model.TodoList;

public class Main {
    public static void main(String[] args) {
        try {
            new TodoApp();
        } catch (EmptyException e) {
            //
        }
    }
}
