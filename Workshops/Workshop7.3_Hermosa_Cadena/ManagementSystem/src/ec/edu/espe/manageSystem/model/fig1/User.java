/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.manageSystem.model.fig1;

import java.util.ArrayList;
import java.util.Scanner;

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
    
    public boolean checkPasword(String pasword){
        boolean checkedPassword=false;
        if(this.password.equals(pasword)){
            checkedPassword=true;
        }
        return checkedPassword;
    }
    
    public ArrayList<TrustFriendsGroup> getTrustFriendsGroups(){
        ArrayList<TrustFriendsGroup> friendGroups = new ArrayList<>();
        TrustFriendsGroup group = new TrustFriendsGroup();
        friendGroups.add(group);
        return friendGroups;
    }

    public boolean logIn(String userName, String password){
        Scanner scan = new Scanner(System.in);
        userName = scan.nextLine();
        password = scan.nextLine();
        boolean band = false;
        //if userName.equals("pepito")&& password.equals("pepito123") band=true;
        return band;
    }

    public void logOut(){
        //break;
    }

    public User(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        this.userName = userName;
        this.password = pasword;
        this.fullName = fullName;
        this.emailAdress = emailAdress;
        this.isActive = isActive;
    }
}
