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
public class Toucan extends Bird {
    
    private int peakSize;

    @Override
    public String toString() {
        return "Toucan{" + "peakSize=" + getPeakSize() + '}';
    }

    public Toucan(int peakSize, int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(wingSize, fly, id, name, gender, weight, cage);
        this.peakSize = peakSize;
    }

    /**
     * @return the peakSize
     */
    public int getPeakSize() {
        return peakSize;
    }

    /**
     * @param peakSize the peakSize to set
     */
    public void setPeakSize(int peakSize) {
        this.peakSize = peakSize;
    }
    
    
}
