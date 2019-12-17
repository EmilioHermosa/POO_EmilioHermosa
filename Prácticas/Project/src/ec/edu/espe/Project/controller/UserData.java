
package ec.edu.espe.Project.controller;

import org.json.simple.JSONArray;


public class UserData {
    
    public JSONArray arrayUsers(){
    AccesData data = new AccesData();
    return data.arrayUsers();
    }
}
