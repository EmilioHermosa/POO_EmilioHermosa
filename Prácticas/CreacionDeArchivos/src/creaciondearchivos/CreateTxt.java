
package creaciondearchivos;

import java.io.*;



public class CreateTxt {
    
    
    public void createTxt(){
    
    File file;     
        try{
        file = new File("C:\\POO_EmilioHermosa\\Prácticas\\CreacionDeArchivos\\archivo.txt");
        
        if(file.createNewFile()){
            System.out.println("Se ha creado el archivo");
        } 
        }catch(IOException e){
            System.err.println("No se ha podido guardar el archivo");
        }
    
    }
    
    
    
}
