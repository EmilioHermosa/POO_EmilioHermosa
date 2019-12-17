
package ec.edu.espe.Project.controller;

import java.io.File;
import java.io.IOException;


public class FileTxt {
    
    public void createTxt(){
    
    File file;     
        try{
        file = new File("C:\\POO_EmilioHermosa\\Prácticas\\Project\\Users.txt");
        
        if(file.createNewFile()){
            System.out.println("Se ha creado el archivo");
        } 
        }catch(IOException e){
            System.err.println("No se ha podido guardar el archivo");
        }
    
    }
    
}
