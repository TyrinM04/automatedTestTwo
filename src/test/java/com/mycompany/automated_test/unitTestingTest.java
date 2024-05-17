/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lab_services_student
 */
public class unitTestingTest {
    
    public unitTestingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addition method, of class unitTesting.
     */
    @Test
    public void testAddition() {
          System.out.println("addition");
        int valOne = 4;
        int valTwo = 4;
        unitTesting instance = new unitTesting();
        int expResult = 8;
        int actual = instance.addition(valOne, valTwo);
        assertEquals(expResult, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class unitTesting.
     */
    @Test
    public void testSubtraction() {
           System.out.println("subtraction");
        int valOne = 0;
        int valTwo = 0;
        unitTesting instance = new unitTesting();
        int expResult = 0;
        int actual = instance.subtraction(valOne, valTwo);
        assertEquals(expResult, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of message method, of class unitTesting.
     */
    @Test
    public void testMessage() {
        System.out.println("message");
        unitTesting instance = new unitTesting();
        String expResult = "hello world";
        String actual = instance.message();
        assertEquals(expResult, actual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
