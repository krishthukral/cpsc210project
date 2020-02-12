package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoListTest {
    private TodoList lists;
    private Task exercise;
    private Task homework;
    private Task artProject;

    @BeforeEach
    void runBefore() {
        exercise = new Task("exercise");
        homework = new Task("homework");
        artProject = new Task("Art");

        lists = new TodoList();
    }

    ////
    @Test
    void testConstructor() {
        assertEquals("exercise", exercise.getDescription());
        assertEquals(false, homework.getIsCompleted());

    }

    @Test
    public void testAddTask() {
        lists.addTask(exercise.getDescription());
        assertEquals(1, lists.sizeOfList());
    }

    @Test
    public void testDeleteTask() {
        lists.addTask(exercise.getDescription());
        lists.deleteTask(exercise.getDescription());
        assertEquals(0, lists.sizeOfList());
    }

    @Test
    public void testGetTask() {
        lists.addTask(exercise.getDescription());
        lists.addTask(homework.getDescription());
        lists.addTask(artProject.getDescription());
        assertEquals(3, lists.sizeOfList());
        assertEquals(3, lists.sizeOfList());
        assertEquals(artProject.getDescription(), lists.getTask(2).getDescription());
    }

   /* @Test
    public void testCompletedList() {
        lists.addTask(exercise.getDescription());
        lists.addTask(homework.getDescription());
        lists.addTask(artProject.getDescription());
        lists.completedList();

        assertEquals(3, lists.sizeOfList());
    }*/


}
