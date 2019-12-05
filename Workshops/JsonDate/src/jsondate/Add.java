/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsondate;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel castillo
 */
public class Add {

    Leer leers = new Leer();
   
    public User addCsv() {
        User addData = new User();
   
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        addData.setName(in.nextLine());
        System.out.println("Ingrese Fecha: ");
        addData.setBDate(in.nextLine());

        return addData;
    }

    public void file(User addData) {
        ArrayList<User> users = new ArrayList();
        try{
        File f = new File("Datos.csv");
        FileWriter fw;
        BufferedWriter bw;
        if (f.exists()) {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            users.add(new User("Juan", "15/05/2010"));
            users.add(new User("Pedro", "09/10/2001"));
            users.add(new User("Jimena", "20/08/2005"));
            Gson gson = new Gson();
            String jsonString = gson.toJson(addData);
            bw.newLine();
            bw.write(users.hashCode());

        } else {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            Gson gson = new Gson();
            String jsonString = gson.toJson(addData);
            bw.write(jsonString);
        }
        bw.close();
        }
        catch(IOException e){
            
        }
    }
       
     public User searchData(String name){
        ArrayList<User> arrData = new ArrayList<User>();
        User data = new User();
        arrData = leers.leerCsv();
        for (int i = 0; i < arrData.size(); i++) {
            if (arrData.get(i).getName()== name) {
                data =  arrData.get(i);
            }
        }
        return data;
    }


}

