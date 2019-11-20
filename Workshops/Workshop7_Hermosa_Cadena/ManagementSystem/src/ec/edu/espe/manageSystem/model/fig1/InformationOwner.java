
package ec.edu.espe.manageSystem.model.fig1;

import java.util.ArrayList;


public class InformationOwner extends User {
    
    private ArrayList<TrustFriendsGroup> trustFriendsGroups;
    private ArrayList<AccountOrNote>accountOrNotes;
    
    public void defined (){
    
    }
    
    public InformationOwner(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        super(userName, pasword, fullName, emailAdress, isActive);
    }
    
}
