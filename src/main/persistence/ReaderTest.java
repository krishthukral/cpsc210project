package persistence;

import com.sun.corba.se.impl.oa.toa.TOA;
import model.Task;
import model.TodoList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {
    private TodoList list = new TodoList();
    private TodoList l1 = new TodoList();

    @Test
    void test() {
        {


            try {
                FileInputStream fileIn = new FileInputStream("./data/" + "xD" + ".txt");
                ObjectInputStream in = new ObjectInputStream(fileIn);


                l1 = (TodoList) in.readObject();
                hello();
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
        }


    }

    private void hello() {

        for (int i = 0; i < l1.sizeOfList(); i++) {
            list.addTask(l1.getTask(i).getDescription());
        }
        assertEquals(3, list.sizeOfList());
        String str1 = "";

        for (int i = 0; i < list.sizeOfList(); i++) {
            str1 = str1 + list.getTask(i).getDescription();
        }


        assertEquals("cowchickenpig", str1);
    }
}
//public class ReaderTest {
//
//    private TodoList list;
//    private Task hw = new Task("Homework");
//    private Task soccer = new Task("compsci");
//    private Reader r = new Reader();
//    private Writer w = new Writer();
//    private TodoList newList = new TodoList();
//
//    @BeforeEach
//    private void runBefore() {
//        list = new TodoList();
//
//
//    }
//
//    @Test
//    void test() {
//
//        w.save(list, "file1");
//
//        //r.load("file1", newList);
//
//        assertEquals("x", r.load("file1", newList ));
//        //String strs = list.getTask().getDescription();
//        //System.out.println(strs);
//       // assertEquals(strs, list.getTask().getDescription());
//    }
//
//
//}
