/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part.pkg1.and.part.pkg2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PART1ANDPART2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get username and password using JOptionPane
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");

        UserAuthentication user = new UserAuthentication(username, password, firstName, lastName);
        JOptionPane.showMessageDialog(null, user.registerUser(username, password)); // Output: User registered successfully!

        // Getting login credentials using JOptionPane
        String loginUsername = JOptionPane.showInputDialog("Enter username for login:");
        String loginPassword = JOptionPane.showInputDialog("Enter password for login:");

        boolean loginSuccess = user.login(loginUsername, loginPassword);
        JOptionPane.showMessageDialog(null, "Login " + (loginSuccess ? "successful!" : "failed!")); // Output: true/false

        // Proceed only if login is successful
        if (loginSuccess) {
            // Show welcome message with user's first and last name
            JOptionPane.showMessageDialog(null, "Welcome to EasyKanban, " + user.getFirstName() + " " + user.getLastName());

            // Assuming TaskManager has a method run() to start the task management process
            TaskManager taskManager = new TaskManager();
            taskManager.run();
        }
    }
}