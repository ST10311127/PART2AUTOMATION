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
public class UserAuthenticationTest {

    
    @Test
    public void testCheckPasswordComplexity() {
        UserAuthentication userAuth = new UserAuthentication("username", "Password1@", "John", "Doe");
        assertTrue(userAuth.checkPasswordComplexity("Password1@")); // Valid password
        assertFalse(userAuth.checkPasswordComplexity("password")); // Missing capital letter
        assertFalse(userAuth.checkPasswordComplexity("password1")); // Missing special character
        assertFalse(userAuth.checkPasswordComplexity("Pass1@")); // Short password
    }

    

    @Test
    public void testLogin() {
        UserAuthentication userAuth = new UserAuthentication("username", "Password1@", "John", "Doe");
        assertTrue(userAuth.login("username", "Password1@")); // Valid login
        assertFalse(userAuth.login("username", "password")); // Invalid password
        assertFalse(userAuth.login("user", "Password1@")); // Invalid username
    }

    @Test
    public void testGetFirstName() {
        UserAuthentication userAuth = new UserAuthentication("username", "Password1@", "John", "Doe");
        assertEquals("John", userAuth.getFirstName());
    }

    @Test
    public void testGetLastName() {
        UserAuthentication userAuth = new UserAuthentication("username", "Password1@", "John", "Doe");
        assertEquals("Doe", userAuth.getLastName());
    }
}