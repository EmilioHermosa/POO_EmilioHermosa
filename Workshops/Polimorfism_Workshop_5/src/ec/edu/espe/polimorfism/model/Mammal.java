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
public class Mammal extends Animal {
    
    private boolean isBreastFeeding;

    @Override
    public String toString() {
        return "Mammal{" + "isBreastFeeding=" + isBreastFeeding + '}';
    }

    
    
    public Mammal( int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        System.out.println("Mammal constructor");
        this.isBreastFeeding = isBreastFeeding;
    }

    
    
    
    
    /**
     * @return the isBreastFeeding
     */
    public boolean isIsBreastFeeding() {
        return isBreastFeeding;
    }

    /**
     * @param isBreastFeeding the isBreastFeeding to set
     */
    public void setIsBreastFeeding(boolean isBreastFeeding) {
        this.isBreastFeeding = isBreastFeeding;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
