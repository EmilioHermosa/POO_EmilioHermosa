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
public class GiantToad extends Amphibian {
    
    private int size;

    @Override
    public String toString() {
        return "GiantToad{" + "size=" + getSize() + ", poisonous=" + poisonous + '}';
    }

    public GiantToad(int size, boolean poisonous, boolean jump, int id, String name, String gender, float weight, Cage cage) {
        super(poisonous, jump, id, name, gender, weight, cage);
        this.size = size;
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
    
    
}
