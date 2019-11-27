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
public class Chameleon extends Reptile {
    
    private int tongueSize;

    @Override
    public String toString() {
        return "Chameleon{" + "tongueSize=" + getTongueSize() + '}';
    }

    public Chameleon(int tongueSize, boolean scales, boolean legs, int size, boolean poisonous, int id, String name, String gender, float weight, Cage cage) {
        super(scales, legs, size, poisonous, id, name, gender, weight, cage);
        this.tongueSize = tongueSize;
    }

    /**
     * @return the tongueSize
     */
    public int getTongueSize() {
        return tongueSize;
    }

    /**
     * @param tongueSize the tongueSize to set
     */
    public void setTongueSize(int tongueSize) {
        this.tongueSize = tongueSize;
    }
    
    
}
