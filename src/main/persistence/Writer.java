package persistence;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

import model.*;

public class Writer implements Serializable {


    public void save() {

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

