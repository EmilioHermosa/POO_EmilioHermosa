/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CalcAge {
    
    public int calcAge(int day, int month, int year){
    
        try{
        Scanner sca =new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        int actualDay=cal.get(Calendar.DAY_OF_MONTH);
        int actualMonth=cal.get(Calendar.MONTH);
        int actualYear=cal.get(Calendar.YEAR);
        int dayResult;
        int monthResult;
        int yearResult;
        System.out.println("Dime un dia");
        //day=sca.nextInt();
        
        System.out.println("Dime un mes");
        //month=sca.nextInt();
        //month=02;
        System.out.println("Dime un año");
        //year=sca.nextInt();
        //year=2000;
        
        if(day<0 || day>31){
        throw new Exception ("El dia esta mal puesto");
        }
        
         if(month<0 || month>12){
        throw new Exception ("El mes esta mal puesto");
        }
         
         if(year<0 || year>2019){
        throw new Exception ("El año esta mal puesto");
        }
         
         if(month==02 && day>28){
        throw new Exception ("El año esta mal puesto");
        }
        
        dayResult=Math.abs(day-actualDay);
        monthResult=Math.abs(month-actualMonth-1);
        yearResult=Math.abs(year-actualYear);
        System.out.println("Tienes" + yearResult + "años, " + monthResult + "meses y " + dayResult + "dias");
    }catch(Exception ex){
        
           System.out.println("Ha habido un error" + ex.toString());  
        
    }   return 0;
} 
    }
