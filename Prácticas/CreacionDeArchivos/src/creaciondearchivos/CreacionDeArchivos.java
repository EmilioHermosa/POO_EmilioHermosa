
package creaciondearchivos;

import java.io.*;

public class CreacionDeArchivos {


    public static void main(String[] args) {
        
     CreateTxt createTxt = new CreateTxt();
     ReadTxt readTxt = new ReadTxt();
     String readTxt1;
     
     createTxt.createTxt();
     readTxt1 = readTxt.readTxt("C:\\POO_EmilioHermosa\\Prácticas\\CreacionDeArchivos\\archivo.txt");
        System.out.println(readTxt1);
        
        
        
        
        
        
    }
}
