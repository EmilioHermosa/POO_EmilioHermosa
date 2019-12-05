
package creaciondearchivos;

import com.csvreader.CsvWriter;
import java.io.*;
import java.util.ArrayList;

public class CreacionDeArchivos {


    public static void main(String[] args) throws IOException {
        
        ArrayList<Producto> productos = new ArrayList();
        
        productos.add(new Producto(1,"productoA",50));
        productos.add(new Producto(2,"productoB",90));
        productos.add(new Producto(3,"productoC",40));
        
        CsvWriter csvWriter = new CsvWriter("fichero.csv");
        
        for (Producto producto : productos) {
            String [] datos = producto.getArray();
            csvWriter.writeRecord(datos);
        }
        
        csvWriter.close();
        
    }
}
