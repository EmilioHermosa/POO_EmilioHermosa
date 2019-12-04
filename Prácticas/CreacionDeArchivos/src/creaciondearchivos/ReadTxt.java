
package creaciondearchivos;

import java.io.*;
import java.util.ArrayList;


public class ReadTxt {
    
    public ArrayList readTxt(String direccion){
    
        ArrayList<String> text = new ArrayList<>();
        
    try{
        BufferedReader bf = new BufferedReader(new FileReader(direccion));
        String temp = "";
        String bfRead;
        while((bfRead = bf.readLine()) !=null){
            
            temp=temp + bfRead;//Se guarda el texto del archivo
            
            
        }
        
        text = temp;
        
    }catch(IOException e){
        System.out.println("No se encontro el archivo");
    }
    return text;
}
}
