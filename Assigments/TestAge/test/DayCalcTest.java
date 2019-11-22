/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ec.edu.espe.TestAge.DayCalc;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emilio Hermosa
 */
public class DayCalcTest {
    
    public DayCalcTest() {
    }
    
    

    /**
     * Test of calcDay method, of class DayCalc.
     */
    @Test
    public void myDay() {
        System.out.println("calcDay");
        int day = 10;
        int mes = 2;
        int year = 2000;
        int expResult = 7226;
        int result = DayCalc.calcDay(day, mes, year);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void stringDay() {
        System.out.println("calcDay");
        int day = 10;
        int mes = 2;
        int year = 2000;
        int expResult = -1;
        int result = DayCalc.calcDay(day, mes, year);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void negative() {
        System.out.println("calcDay");
        int day = -5;
        int mes = 2;
        int year = -1980;
        int expResult = 7226;
        int result = DayCalc.calcDay(day, mes, year);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void inconsistentDay() {
        System.out.println("calcDay");
        int day = 32;
        int mes = 2;
        int year = 2000;
        int expResult = -1;
        int result = DayCalc.calcDay(day, mes, year);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void ceroDay() {
        System.out.println("calcDay");
        int day = 0;
        int mes = 2;
        int year = 2000;
        int expResult = -1;
        int result = DayCalc.calcDay(day, mes, year);
        assertEquals(expResult, result);
        
    }
    
    
    
}
