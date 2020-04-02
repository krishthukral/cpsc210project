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
            loadState();
        } catch (IOException i) {
            i.printStackTrace();
        }


    }

    @Test
    private void loadState() {
        TodoList list = new TodoList();

        try {
            FileInputStream fileIn = new FileInputStream("./data/" + "xD" + ".txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);


            TodoList l1 = (TodoList) in.readObject();
            for (int i = 0; i < l1.sizeOfList(); i++) {
                list.addTask(l1.getTask(i).getDescription());
            }
            assertEquals("cow", list.getTask(0).getDescription());
            String str1 = "";
            System.out.println(list.sizeOfList());
            for (int i = 0; i < list.sizeOfList(); i++) {
                str1 = str1 + list.getTask(i).getDescription();
            }
            //(assertEquals("pig",));


            in.close();
            fileIn.close();

        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Task class not found");
            
            return;
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
