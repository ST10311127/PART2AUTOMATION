/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1.and.part.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class TaskList {
 private List<Task> tasks;
    private int totalHours;

    public TaskList() {
        tasks = new ArrayList<>();
        totalHours = 0;
    }

    public void addTask(Task task) {
        tasks.add(task);
        totalHours += task.getTaskDuration();
    }

    public int getTotalHours() {
        return totalHours;
    }
}

