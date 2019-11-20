/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig2;
import ec.edu.espe.manageSystem.model.fig2.Password;

import java.util.ArrayList;

/**
 *
 * @author Labs-DCCO
 */
public class Account {
    protected String label;
    protected String createdOnDate;
    protected String lastModifiedOn;
    private ArrayList<Reminder> reminders;
    private ArrayList<Property>properties;
    private ArrayList<Comment>comments;
    private ArrayList<Username>userNames;
    private ArrayList<Password>passwords;
    
  

    
    
    public Account(String label, String createdOnDate, String lastModifiedOn) {
        this.label = label;
        this.createdOnDate = createdOnDate;
        this.lastModifiedOn = lastModifiedOn;
    }
    
    public void uses (){
        
    }
    
    public void about(){
    
    }
    
}
