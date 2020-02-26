package persistence;

import java.io.*;

import model.*;

public class Reader implements Serializable {


    public static void main(String[] args) {
        Task mas;
        String str = "";
        try {
            FileInputStream fileIn = new FileInputStream("./data/myFile.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            TodoList l1 = (TodoList) in.readObject();
            for (int i = 0; i < l1.sizeOfList(); i++) {
                System.out.println("Task:" + l1.getTask(i).getDescription());
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

        System.out.println("Deserialized Task...");
        //System.out.println("Task: " + mas.getDescription());

    }
}

