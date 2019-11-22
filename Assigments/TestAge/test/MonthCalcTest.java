/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ec.edu.espe.TestAge.MonthCalc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emilio Hermosa
 */
public class MonthCalcTest {
    
    public MonthCalcTest() {
    }
    
 

    /**
     * Test of calcMonth method, of class MonthCalc.
     */
    @Test
    public void myMonth() {
        System.out.println("calcMonth");
        int month = 2;
        int año = 2000;
        int expResult = 226;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void negativeMonth() {
        System.out.println("calcMonth");
        int month = -2;
        int año = -1;
        int expResult = 226;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void stringMonth() {
        System.out.println("calcMonth");
        int month = dos;
        int año = -1;
        int expResult = 226;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void futureMonth() {
        System.out.println("calcMonth");
        int month = 2;
        int año = 2020;
        int expResult = -1;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void inconsistentMonth() {
        System.out.println("calcMonth");
        int month = 14;
        int año = 2020;
        int expResult = -1;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void ceroMonth() {
        System.out.println("calcMonth");
        int month = 0;
        int año = 2020;
        int expResult = -1;
        int result = MonthCalc.calcMonth(month, año);
        assertEquals(expResult, result);
        
    }
    
    
    
    
}
