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
public class UserSession {
    private User user;
    
    public void UserSession(User user){
        this.user = user;
    }
    public void clearUser(){
        user=null;
        user = new User();
    }
    public void getCurrentUser(){
        
    }
}
