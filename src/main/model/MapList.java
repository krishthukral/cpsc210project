//package model;
//
//import exception.EmptyException;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class MapList {
//    private Map taskList;
//    private ArrayList<Task> completed;
//    private ArrayList<Task> incomplete;
//
//    public MapList() {
//
//        taskList = new HashMap();
//
//        // stub
//    }
//
//    // MODIFES : this
//    // EFFECTS: adds task to a Todo list
//    public void addTask(String str) {
//        Task t = new Task(str);
//        taskList.(t);
//        // stub
//    }
//
//    // MODIFES : this
//    // EFFECTS: removes task to a Todo list
//    public void deleteTask(String str) {
//        try {
//            exception();
//        } catch (EmptyException e) {
//            //
//        }
//
//        for (int i = 0; i < taskList.size(); i++) {
//            if (str.equals(taskList.get(i).getDescription())) {
//                taskList.remove(i);
//            }
//        }
//
//        // stub
//    }
//}
