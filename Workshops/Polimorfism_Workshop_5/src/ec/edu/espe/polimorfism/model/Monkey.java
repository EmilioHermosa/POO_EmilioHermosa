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
