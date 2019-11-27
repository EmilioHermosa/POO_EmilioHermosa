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
public class Amphibian extends Animal {
    
    boolean poisonous;
    private boolean jump;

    @Override
    public String toString() {
        return "Amphibian{" + "poisonous=" + isPoisonous() + ", jump=" + isJump() + '}';
    }

    public Amphibian(boolean poisonous, boolean jump, int id, String name, String gender, float weight, Cage cage) {
        super(id, name, gender, weight, cage);
        this.poisonous = poisonous;
        this.jump = jump;
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

    /**
     * @return the jump
     */
    public boolean isJump() {
        return jump;
    }

    /**
     * @param jump the jump to set
     */
    public void setJump(boolean jump) {
        this.jump = jump;
    }
    
    
}
