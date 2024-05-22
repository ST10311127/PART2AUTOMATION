/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part.pkg1.and.part.pkg2;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
 private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerName;
    private int taskDuration;
    private String taskID;
    private String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerName, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerName = developerName;
        this.taskDuration = taskDuration;
        this.taskStatus = taskStatus;
        this.taskID = generateTaskID();
    }

    private String generateTaskID() {
        String initials = taskName.substring(0, 2).toUpperCase();
        String lastThreeLetters = developerName.substring(developerName.length() - 3).toUpperCase();
        return initials + ":" + taskNumber + ":" + lastThreeLetters;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }
}