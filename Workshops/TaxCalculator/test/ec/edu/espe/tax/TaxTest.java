/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author H304
 */
public class TaxTest {
    
    public TaxTest() {
    }
    
   
    /**
     * Test of computeIva method, of class Tax.
     */
    @Test
    public void testComputeIva() {
        System.out.println("computeIva");
        float base = 10;
        float exptedValue = 1.2F;
        float actualValue=0F;
        actualValue = Tax.computeIva(base);
        assertEquals(exptedValue, actualValue, 2);
        
    }
    
    @Test
    public void testComputeIvaDeciamls() {
        System.out.println("computeIva");
        float base = 50388.37F;
        float exptedValue = 6046.6044F;
        float actualValue=0F;
        actualValue = Tax.computeIva(base);
        assertEquals(exptedValue, actualValue, 10);
        
    }
    
}
