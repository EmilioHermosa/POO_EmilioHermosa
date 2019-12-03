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
public class Reptile extends Animal {
    
    private boolean scales;
    private boolean legs;
    private int size;
    private boolean poisonous;

    @Override
    public String toString() {
        return "Reptile{" + "scales=" + scales + ", legs=" + legs + ", size=" + size + ", poisonous=" + poisonous + '}';
    }

    
    
    public Reptile(boolean scales, boolean legs, int size, boolean poisonous, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.scales = scales;
        this.legs = legs;
        this.size = size;
        this.poisonous = poisonous;
    }

    /**
     * @return the scales
     */
    public boolean isScales() {
        return scales;
    }

    /**
     * @param scales the scales to set
     */
    public void setScales(boolean scales) {
        this.scales = scales;
    }

    /**
     * @return the legs
     */
    public boolean isLegs() {
        return legs;
    }

    /**
     * @param legs the legs to set
     */
    public void setLegs(boolean legs) {
        this.legs = legs;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the poisonous
     */
    public boolean isPoisonous() {
        return poisonous;
    }

    /**
     * @param poisonous the poisonous to set
     */
    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
