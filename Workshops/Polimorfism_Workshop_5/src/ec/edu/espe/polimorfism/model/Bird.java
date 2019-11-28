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
public class Bird extends Animal {
    /**
     * The wingSize in milimmeters
     */
    private int wingSize;
    /**
     * true is fly and false is dont fly
     */
    private boolean fly;

    @Override
    public String toString() {
        return "Bird{" + "wingSize=" + wingSize + ", fly=" + fly + '}';
    }

    
    
    public Bird(int wingSize, boolean fly, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.wingSize = wingSize;
        this.fly = fly;
    }

    
    
    /**
     * @return the wingSize
     */
    public int getWingSize() {
        return wingSize;
    }

    /**
     * @param wingSize the wingSize to set
     */
    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    /**
     * @return the fly
     */
    public boolean isFly() {
        return fly;
    }

    /**
     * @param fly the fly to set
     */
    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
