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
public class Polimorfism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal;
        Cage cage = new Cage(1, "wood", 1, 1);
        animal = new Monkey(1, "Pepito", "male", 5, cage);
        System.out.println(animal);
        
        
        
    }
    
}
