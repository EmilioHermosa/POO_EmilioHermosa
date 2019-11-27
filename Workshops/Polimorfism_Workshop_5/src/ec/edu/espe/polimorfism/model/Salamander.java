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
public class Salamander extends Amphibian {
    
    private boolean stains;

    @Override
    public String toString() {
        return "Salamander{" + "stains=" + isStains() + '}';
    }

    public Salamander(boolean stains, boolean poisonous, boolean jump, int id, String name, String gender, float weight, Cage cage) {
        super(poisonous, jump, id, name, gender, weight, cage);
        this.stains = stains;
    }

    /**
     * @return the stains
     */
    public boolean isStains() {
        return stains;
    }

    /**
     * @param stains the stains to set
     */
    public void setStains(boolean stains) {
        this.stains = stains;
    }

   
    
    
    
}
