/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ec.edu.espe.TestAge.YearCalc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class YearCalcTest {
    
    public YearCalcTest() {
    }
    
    

    /**
     * Test of calcYear method, of class YearCalc.
     */
    @Test
    public void myYear() {
        System.out.println("calcYear");
        int year = 2000;
        int expResult = 19;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void stringYear() {
        System.out.println("calcYear");
        int year = 5;
        int expResult = -1;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void inconsistentYear() {
        System.out.println("calcYear");
        int year = 1;
        int expResult = 2018;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void futureYear() {
        System.out.println("calcYear");
        int year = 2020;
        int expResult = -1;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void negativeYear() {
        System.out.println("calcYear");
        int year = -2000;
        int expResult = -1;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void characterYear() {
        System.out.println("calcYear");
        int year = 4;
        int expResult = -1;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testYear() {
        System.out.println("calcYear");
        int year = 1970;
        int expResult = 48;
        int result = YearCalc.calcYear(year);
        assertEquals(expResult, result);
       
    }
    
}
