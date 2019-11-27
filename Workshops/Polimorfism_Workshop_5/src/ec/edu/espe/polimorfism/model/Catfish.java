/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.polimorfism.model;

/**
 *
 * @author User
 */
public class Catfish extends Fish {
    
    private int mustacheSize;

    @Override
    public String toString() {
        return "Catfish{" + "mustacheSize=" + getMustacheSize() + '}';
    }

    public Catfish(int mustacheSize, int fins, int size, int id, String name, String gender, float weight, Cage cage) {
        super(fins, size, id, name, gender, weight, cage);
        this.mustacheSize = mustacheSize;
    }

    /**
     * @return the mustacheSize
     */
    public int getMustacheSize() {
        return mustacheSize;
    }

    /**
     * @param mustacheSize the mustacheSize to set
     */
    public void setMustacheSize(int mustacheSize) {
        this.mustacheSize = mustacheSize;
    }
    
    
}
