
package teamwork;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalcAge {
    
    
     public String restar_fecha(String fechaInicio) {
        
        Calendar calendario = new GregorianCalendar();
        int diaActual;
        int mesActual;
        int anioActual;

        String[] aFechaIng = fechaInicio.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer anioInicio = Integer.parseInt(aFechaIng[2]);

          anioActual=calendario.get(Calendar.YEAR);
          mesActual = calendario.get(Calendar.MONTH);
          diaActual = calendario.get(Calendar.DATE);
          mesActual=mesActual+1;

        /*System.out.println(diaActual);
        System.out.println(mesActual);
        System.out.println(anioActual);*/
        int totalDias = 0;
        int dias = 0;
        int mes = 0;
        int anios = 0;
        int meses = 0;
        if (mes == 2) {
            if ((anioActual % 4 == 0) && ((anioActual % 100 != 0) || (anioActual % 400 == 0))) {
                totalDias = 29;
            } else {
                totalDias = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                totalDias = 31;
            } else if (mes % 2 == 0) {
                totalDias = 30;
            } else {
                totalDias = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                totalDias = 31;
            } else {
                totalDias = 30;
            }
        }
        if (anioInicio>=1000){
            /*System.out.println("Año invalido");*/
        }
            
        if ((anioInicio > anioActual) || (anioInicio == anioActual && mesInicio > mesActual)
                || (anioInicio == anioActual && mesInicio == mesActual && diaInicio > diaActual)) {
            //System.out.println("La fecha de inicio debe ser anterior a la fecha Actual");
        } else {
            if (mesInicio <= mesActual) {
                anios = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    meses = mesActual - mesInicio;
                    dias = totalDias - (diaActual - diaInicio );
                } else {
                    if (mesActual == mesInicio) {
                        anios = anios - 1;
                    }
                    meses = (mesActual - mesInicio - 1 + 12) % 12;
                    dias = totalDias - ( diaInicio - diaActual);
                }
            } else {
                anios = anioActual - anioInicio - 1;
                //System.out.println(anios);
                if (diaInicio > diaActual) {
                    meses = mesActual - mesInicio - 1 + 12;
                    dias = totalDias - (diaInicio - diaActual);
                } else {
                    meses = mesActual - mesInicio + 12;
                    dias = diaActual - diaInicio;
                }
            }
        }

        /*System.out.println("Años: " + anios);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + dias);*/
        
        String amd =anios + " años "+meses + " meses " + dias + " dias " ;
        
        return amd;

    }


}
    

