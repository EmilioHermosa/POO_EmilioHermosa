/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondate;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Angel Castillo
 */
public class JsonDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        Add registry = new Add();
        Leer leer = new Leer();
        int op;
        boolean ext = false;
        while(!ext){
            
        System.out.println("--Registro--");
        System.out.println("1. Ingresar datos");
        System.out.println("2. Mostrar datos");
        System.out.println("3. Borrar el archivo completo");
        System.out.println("4. Modificar");
        System.out.println("5. Salir");
        System.out.println(">>  ");
        op = in.nextInt();
        switch(op){
            case 1:
                User addData = new User();
                addData = registry.addCsv();
                registry.file(addData);
                break;
            case 2:
                List<User> arrData = new ArrayList<>();
                arrData = leer.leerCsv();
                System.out.println(Arrays.toString(arrData.toArray()));
                break;
            case 3:

            case 4:
                ext = true;
                break;
        }
        } 
    }
    
}
