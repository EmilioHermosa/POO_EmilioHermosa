
package files;
import java.io.File;
import java.io.IOException;

public class Files {

  
    public static void main(String[] args) {
        
        File file = new File("MiArchivo.txt");
        if(!file.exists());
        {
            try{
            file.createNewFile();
            System.out.println(file.getName()+"Ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
        }
        
    }
    
}
