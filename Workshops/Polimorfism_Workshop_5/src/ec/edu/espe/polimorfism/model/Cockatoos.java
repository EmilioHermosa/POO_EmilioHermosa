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
public class Cockatoos extends Bird {
    
    private int crestSize;

    @Override
    public String toString() {
        return "Cockatoos{" + "crestSize=" + getCrestSize() + '}';
    }

    public Cockatoos(int crestSize, int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, id, name, gender, weight, cage);
        this.crestSize = crestSize;
    }

    

    /**
     * @return the crestSize
     */
    public int getCrestSize() {
        return crestSize;
    }

    /**
     * @param crestSize the crestSize to set
     */
    public void setCrestSize(int crestSize) {
        this.crestSize = crestSize;
    }
    
    
}
