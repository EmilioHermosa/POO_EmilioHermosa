/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondate;

/**
 *
 * @author Angel castillo
 */
class User {
    private String name;
    private String BDate;

    public User(String name, String BDate) {
        this.name = name;
        this.BDate = BDate;
    }
    

    

    User() {
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
   
    void getName(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return " Nombre: "+name+" BDate: "+getBDate();
    }

    /**
     * @return the BDate
     */
    public String getBDate() {
        return BDate;
    }

    /**
     * @param BDate the BDate to set
     */
    public void setBDate(String BDate) {
        this.BDate = BDate;
    }



    
}

