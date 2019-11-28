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
public class Cage {
    
    private int id;
    private String material;
    private int xPossition;
    private int yPossition;


    @Override
    public String toString() {
        return "Cage{" + "id=" + id + ", material=" + material + ", xPossition=" + xPossition + ", yPossition=" + yPossition + '}';
    }

    
    public Cage(int id, String material, int xPossition, int yPossition) {
        this.id = id;
        this.material = material;
        this.xPossition = xPossition;
        this.yPossition = yPossition;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the xPossition
     */
    public int getxPossition() {
        return xPossition;
    }

    /**
     * @param xPossition the xPossition to set
     */
    public void setxPossition(int xPossition) {
        this.xPossition = xPossition;
    }

    /**
     * @return the yPossition
     */
    public int getyPossition() {
        return yPossition;
    }

    /**
     * @param yPossition the yPossition to set
     */
    public void setyPossition(int yPossition) {
        this.yPossition = yPossition;
    }
    
    
}
