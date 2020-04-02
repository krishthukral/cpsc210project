//package persistence;
//
//import java.awt.event.ActionEvent;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.*;
//
//import exception.EmptyException;
//import model.*;
//import ui.TodoApp;
//
//import javax.swing.*;
//
//public class Writer implements Serializable {
//    protected TodoApp todoApp;
//
//    public void save() throws EmptyException {
//        todoApp = new TodoApp();
//        //This method can be called only if
//        //there's a valid selection
//        //so go ahead and remove whatever's selected.
//
//        try {
//            FileOutputStream fileOut =
//                    new FileOutputStream("./data/myFile.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//
//            out.writeObject(todoApp.list);
//
//            //
//            out.close();
//            fileOut.close();
//
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//
//    }
//}
//
//
