
package ec.edu.espe.manageSystem.model.fig1;

import java.util.ArrayList;


public class InformationOwner extends User {
    
    private ArrayList<TrustFriendsGroup> trustFriendsGroups;
    private ArrayList<AccountOrNote>accountOrNotes;
    
    public void defined (){
    
    }
    
    public String storeWebInfo(){
        Scanner scan = new Scanner.System(in);
        String information="";
        int opc=1;
        while (opc=!2){
            System.println("si ya no quiere almacenar informacion web digite 2 (al final)");
            String information += scan.nextLine();
            opc= scan.nextLine();
        }
        return inforamtion;
    }

    public String storeNoWebInfo(){
        Scanner scan = new Scanner.System(in);
        int opc=1;
        String information="";
        while (opc=!2){
            System.println("si ya no quiere almacenar informacion  no web digite 2 (al final)");
            String information += scan.nextLine();
            opc= scan.nextLine();
        }
        return inforamtion;
    }

    public String storeWebCompu(){
        Scanner scan = new Scanner.System(in);
        int opc=1;
        String information="";
        while (opc=!2){
            System.println("si ya no quiere almacenar informacion de computadoras digite 2 (al final)");
            String information += scan.nextLine();
            opc= scan.nextLine();
        }
        return inforamtion;
    }

    public String storePersonalInfo(){
        Scanner scan = new Scanner.System(in);
        int opc=1;
        String information="";
        while (opc=!2){
            System.println("si ya no quiere almacenar informacion digite 2 (al final)");
            String information += scan.nextLine();
            opc= scan.nextLine();
        }
        return inforamtion;
    }

    public String giveTotalAccess(){
        return "UserAdmin:pepito"+"PasswordAdmin:pepito123"
    }

    public InformationOwner(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        super(userName, pasword, fullName, emailAdress, isActive);
    }
    
}
