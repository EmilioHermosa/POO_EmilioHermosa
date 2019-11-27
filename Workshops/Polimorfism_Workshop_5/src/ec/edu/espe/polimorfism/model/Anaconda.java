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
public class Anaconda extends Reptile {
    
    private int snoutScales;

    @Override
    public String toString() {
        return "Anaconda{" + "snoutScales=" + getSnoutScales() + '}';
    }
    
    

    public Anaconda(int snoutScales, boolean scales, boolean legs, int size, boolean poisonous, int id, String name, String gender, float weight, Cage cage) {
        super(scales, legs, size, poisonous, id, name, gender, weight, cage);
        this.snoutScales = snoutScales;
    }

    /**
     * @return the snoutScales
     */
    public int getSnoutScales() {
        return snoutScales;
    }

    /**
     * @param snoutScales the snoutScales to set
     */
    public void setSnoutScales(int snoutScales) {
        this.snoutScales = snoutScales;
    }
    
    
    
}
