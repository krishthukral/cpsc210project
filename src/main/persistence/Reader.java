package persistence;

import java.io.*;

import model.*;

public class Reader implements Serializable {


    public static void main() {
        TodoList list = new TodoList();

        try {
            FileInputStream fileIn = new FileInputStream("./data/" + "xD" + ".txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);


            TodoList l1 = (TodoList) in.readObject();
            for (int i = 0; i < l1.sizeOfList(); i++) {
                list.addTask(l1.getTask(i).getDescription());
            }
            String str1 = "";
            System.out.println(list.sizeOfList());
            for (int i = 0; i < list.sizeOfList(); i++) {
                str1 = str1 + list.getTask(i).getDescription();
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

        //System.out.println("Deserialized Task...");
        //System.out.println("Task: " + mas.getDescription());

    }

}

