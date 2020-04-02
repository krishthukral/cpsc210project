package ui;

import exception.EmptyException;

public class Main {
    public static void main(String[] args) {
        try {
            new TodoApp();
        } catch (EmptyException e) {
            //
        }
    }
}
