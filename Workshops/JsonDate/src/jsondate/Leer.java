/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Angel castillo
 */
public class Leer {
    
    public ArrayList<User> leerCsv(){
        
        ArrayList<User> addDatas = new ArrayList<User>();
           
        try{
            File f=new File("Datos.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    User data = new User();
                    String[] contact = line.split(",");
                    
                    data.setName(contact[0]);
                    data.setBDate(contact[1]);
                    
            
                    addDatas.add(data);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
        return addDatas;
    }
    
    
}

