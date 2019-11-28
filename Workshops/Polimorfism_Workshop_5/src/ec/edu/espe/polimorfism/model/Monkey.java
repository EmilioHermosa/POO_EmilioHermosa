/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.polimorfism.model;

/**
 *
 * @author H304
 */
public class Monkey extends Mammal {
    
    private int tailLenght;

    Monkey(int i, String pepito, String male, int i0, Cage cage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public String toString() {
        return "Monkey{" + "tailLenght=" + tailLenght + '}';
    }

    
    
    public Monkey(int tailLenght, boolean isBreastFeeding, int id, String name, String gender, float weight, Cage cage) {
        super(isBreastFeeding, id, name, gender, weight, cage);
        this.tailLenght = tailLenght;
    }

    
    /**
     * @return the tailLenght
     */
    public int getTailLenght() {
        return tailLenght;
    }

    /**
     * @param tailLenght the tailLenght to set
     */
    public void setTailLenght(int tailLenght) {
        this.tailLenght = tailLenght;
    }
    
    
    
}
