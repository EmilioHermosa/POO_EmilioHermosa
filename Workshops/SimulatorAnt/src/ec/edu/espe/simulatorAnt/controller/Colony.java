/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulatorAnt.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel castillo
 */
public class Colony {
    
    private List<Ant>ant=new ArrayList();
    //private Nest home;

    /**
     * @return the ant
     */
    public List<Ant> getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(List<Ant> ant) {
        this.ant = ant;
    }
    
    
}
