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
public class Fish extends Animal {
    
    private int fins;
    private int size;

    @Override
    public String toString() {
        return "Fish{" + "fins=" + getFins() + ", size=" + getSize() + '}';
    }

    public Fish(int fins, int size, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.fins = fins;
        this.size = size;
    }

    /**
     * @return the fins
     */
    public int getFins() {
        return fins;
    }

    /**
     * @param fins the fins to set
     */
    public void setFins(int fins) {
        this.fins = fins;
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
