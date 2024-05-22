/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part.pkg1.and.part.pkg2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testGetTaskName() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals("Task Name", task.getTaskName());
    }

    @Test
    public void testGetTaskNumber() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals(1, task.getTaskNumber());
    }

    @Test
    public void testGetTaskDescription() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals("Description", task.getTaskDescription());
    }

    @Test
    public void testGetDeveloperName() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals("Developer", task.getDeveloperName());
    }

    @Test
    public void testGetTaskDuration() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals(5, task.getTaskDuration());
    }

    
    @Test
    public void testGetTaskStatus() {
        Task task = new Task("Task Name", 1, "Description", "Developer", 5, "To Do");
        assertEquals("To Do", task.getTaskStatus());
    }
}
