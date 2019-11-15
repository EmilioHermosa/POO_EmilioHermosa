/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig1;

import java.util.ArrayList;

/**
 *
 * @author Labs-DCCO
 */
public class InformationOwner extends User {
    
    private ArrayList<TrustFriendsGroup> trustFriendsGroups;
    private ArrayList<AccountOrNote>accountOrNotes;
    
    
    public InformationOwner(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        super(userName, pasword, fullName, emailAdress, isActive);
    }
    
}
