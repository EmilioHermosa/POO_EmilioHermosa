package ec.edu.espe.TestAge;





public class MonthCalc {
    
    YearCalc year = new YearCalc();
    
    public static int calcMonth(int month, int año){
    
        if(month < 13){
            if(month > 0){
        int años;
        años = YearCalc.calcYear(año);
        int conversor = años * 12;
        int months = conversor - month;
        return months;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
            
        
     
    }
    
}


