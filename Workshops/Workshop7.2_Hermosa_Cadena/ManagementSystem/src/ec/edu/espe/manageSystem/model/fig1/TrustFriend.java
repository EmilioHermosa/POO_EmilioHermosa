
package ec.edu.espe.manageSystem.model.fig1;


public class TrustFriend extends User {
    
    
    
    public String viewSharedAccount(Account account){
        return account.toString;
    }

    public String shareView(ArrayList<Account> accounts){
        return accounts.toString;
    }
    
    public TrustFriend(String userName, String pasword, String fullName, String emailAdress, String isActive) {
        super(userName, pasword, fullName, emailAdress, isActive);
    }
    
      
}
