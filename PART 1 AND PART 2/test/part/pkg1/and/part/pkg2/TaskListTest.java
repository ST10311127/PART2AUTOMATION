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
public class TaskListTest {
    
    @Test
    public void testAddTask() {
        TaskList taskList = new TaskList();
        Task task1 = new Task("Task 1", 1, "Description 1", "Developer A", 5, "To Do");
        Task task2 = new Task("Task 2", 2, "Description 2", "Developer B", 3, "Done");
        
        taskList.addTask(task1);
        taskList.addTask(task2);
        
        assertEquals(8, taskList.getTotalHours()); // Total duration should be 8 hours (5 + 3)
        
    }

    @Test
    public void testGetTotalHours() {
        TaskList taskList = new TaskList();
        Task task1 = new Task("Task 1", 1, "Description 1", "Developer A", 5, "To Do");
        Task task2 = new Task("Task 2", 2, "Description 2", "Developer B", 3, "Done");
        
        taskList.addTask(task1);
        taskList.addTask(task2);
        
        assertEquals(8, taskList.getTotalHours()); // Total duration should be 8 hours (5 + 3)
    }
}
