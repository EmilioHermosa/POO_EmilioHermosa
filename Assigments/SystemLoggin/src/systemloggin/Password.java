
package systemloggin;

import java.io.Serializable;


public class Password implements Serializable {
    
    public String user;
    public String password;

    public Password(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Password{" + "user=" + user + ", password=" + password + '}';
    }

    
    
    Password() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
