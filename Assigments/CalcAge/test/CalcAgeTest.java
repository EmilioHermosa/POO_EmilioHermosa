/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calcage.CalcAge;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CalcAgeTest {
    
    public CalcAgeTest() {
    }
    
    

    /**
     * Test of calcAge method, of class CalcAge.
     */
    @Test
    public void MyAge() {
        System.out.println("calcAge");
        int day = 10;
        int month = 02;
        int year = 2000;
        CalcAge instance = new CalcAge();
        int expResult = 0;
        int result = instance.calcAge(day, month, year);
        assertEquals(expResult, result);
    }
    
    @Test
    public void nonexistentDate() {
        System.out.println("calcAge");
        int day = 30;
        int month = 02;
        int year = 2000;
        CalcAge instance = new CalcAge();
        int expResult = 0;
        int result = instance.calcAge(day, month, year);
        assertEquals(expResult, result);
    }
    
    @Test
    public void FutureDate() {
        System.out.println("calcAge");
        int day = 30;
        int month = 01;
        int year = 2020;
        CalcAge instance = new CalcAge();
        int expResult = 0;
        int result = instance.calcAge(day, month, year);
        assertEquals(expResult, result);
    }
    
}
