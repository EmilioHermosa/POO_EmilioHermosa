/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig5;

/**
 *
 * @author Labs-DCCO
 */
public class User {
    private String userName;
    private String password;
    private String fullName;
    private String emailAdress;
    private String isActive;
    
    public void checkPasword(String password){
        
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
