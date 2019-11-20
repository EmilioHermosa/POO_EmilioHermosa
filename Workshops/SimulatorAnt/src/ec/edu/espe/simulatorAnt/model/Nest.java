/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulatorAnt.model;
import  ec.edu.espe.simulatorAnt.controller.Cell;
/**
 *
 * @author Angel castillo
 */
public class Nest {
    
    private Cell position;
    private Food stockPile = new Food();

    /**
     * @return the position
     */
    public Cell getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Cell position) {
        this.position = position;
    }

    /**
     * @return the stockPile
     */
    public Food getStockPile() {
        return stockPile;
    }

    /**
     * @param stockPile the stockPile to set
     */
    public void setStockPile(Food stockPile) {
        this.stockPile = stockPile;
    }
    
    
}
