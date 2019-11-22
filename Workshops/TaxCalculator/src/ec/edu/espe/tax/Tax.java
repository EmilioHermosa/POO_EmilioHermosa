/**
 *  this is a tax computation class
 *  @author Emilio Hermosa
 *  @version 0.0.1
 *  @since 2019-11-21
 */
package ec.edu.espe.tax;


public class Tax {
    /**
     * This variable is the value of the Iva provided by the state
     */
    private static float ivaPersentage=12;
    
    
    /**
     * This method compute the taxes
     * @param base the amount of money in dollars with two decimals
     * @return the Iva Value with two decimals
     */
    
    public static float computeIva(float base){
    float iva;
    iva=base*(ivaPersentage/100);
    return iva;
    }
    
}
