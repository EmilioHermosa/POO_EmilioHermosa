/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig1;

/**
 *
 * @author Labs-DCCO
 */
public class User {
    protected String userName;
    protected String password;
    protected String fullName;
    protected String emailAdress;
    protected String isActive;
    
    public void checkPasword(String pasword){
        
    }
    
    public void getTrustFriendsGroups(){
        
    }

    public User(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        this.userName = userName;
        this.password = pasword;
        this.fullName = fullName;
        this.emailAdress = emailAdress;
        this.isActive = isActive;
    }
}
