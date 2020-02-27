package persistence;

import model.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class WriterTest {
    //private String TEST_FILE = "./data/testAccounts.txt";
    private Writer testWriter;
    private TodoList list;
    private Task hw = new Task("Homework");
    private Task soccer = new Task("compsci");


    @Test
    void save() {

        try {

            TodoList l = new TodoList();
            l.addTask("cow");
            l.addTask("chicken");
            l.addTask("pig");


            FileOutputStream fileOut =
                    new FileOutputStream("./data/" + "xD" + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(l);

            //
            out.close();
            fileOut.close();

            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
//    private void save() {
//        try {
//
//            TodoList l = new TodoList();
//            l.addTask("cow");
//            l.addTask("chicken");
//            l.addTask("pig");
//
//
//            FileOutputStream fileOut =
//                    new FileOutputStream("./data/myFile.txt");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//
//            out.writeObject(l);
//
//            //
//            out.close();
//            fileOut.close();
//
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }
//    }
