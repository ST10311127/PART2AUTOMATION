/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1.and.part.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManager {
 private TaskList taskList;

    public TaskManager() {
        taskList = new TaskList();
    }

    public void run() {
        boolean running = true;
        while (running) {
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n"
                    + "1) Add tasks\n"
                    + "2) Show report (Coming Soon)\n"
                    + "3) Quit"));

            switch (choice) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Report feature is still in development. Coming soon.");
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again.");
                    break;
            }
        }
    }

    private void addTasks() {
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
        for (int i = 0; i < numTasks; i++) {
            Task task = createTask(i);
            if (task == null) {
                i--; // Decrement counter to retry the same task number
                continue;
            }
            taskList.addTask(task);
            displayTaskDetails(task);
            JOptionPane.showMessageDialog(null, "Task successfully captured");
        }
        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + taskList.getTotalHours());
    }

    private Task createTask(int taskNumber) {
        String taskName = JOptionPane.showInputDialog("Enter Task Name:");
        String taskDescription = JOptionPane.showInputDialog("Enter Task Description:");
        if (taskDescription.length() > 50) {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
            return null;
        }
        String developerName = JOptionPane.showInputDialog("Enter Developer Name:");
        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration (in hours):"));
        String taskStatus = JOptionPane.showInputDialog("Enter Task Status (To Do/Done/Doing):");

        return new Task(taskName, taskNumber, taskDescription, developerName, taskDuration, taskStatus);
    }

    private void displayTaskDetails(Task task) {
        String taskDetails = "Task Status: " + task.getTaskStatus() + "\n"
                + "Developer Details: " + task.getDeveloperName() + "\n"
                + "Task Number: " + task.getTaskNumber() + "\n"
                + "Task Name: " + task.getTaskName() + "\n"
                + "Task Description: " + task.getTaskDescription() + "\n"
                + "Task ID: " + task.getTaskID() + "\n"
                + "Duration: " + task.getTaskDuration() + " hours";

        JOptionPane.showMessageDialog(null, taskDetails);
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        TaskManager taskManager = new TaskManager();
        taskManager.run();
    }
}