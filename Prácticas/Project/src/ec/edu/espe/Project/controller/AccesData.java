
package ec.edu.espe.Project.controller;

import ec.edu.espe.Project.model.User;
import org.json.simple.JSONArray;


public class AccesData {
    
    public JSONArray arrayUsers(){
        JSONArray users = new JSONArray();
        users.add(new User("Emilio","hola","Administrador"));
        users.add(new User("Arturo","holi","Vendedor"));
        return users;
    }
}
