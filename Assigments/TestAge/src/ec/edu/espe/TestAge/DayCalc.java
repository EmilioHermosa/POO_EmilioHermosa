package ec.edu.espe.TestAge;





public class DayCalc {
    
    MonthCalc month = new MonthCalc();
    
      public static int calcDay(int day, int mes, int year){
    
        if(day < 31){
            if(day >0){
        int meses, años;
        meses = MonthCalc.calcMonth(mes, year);
        años = YearCalc.calcYear(year);
        int conversor = meses * 30;
        int conversorAños = años*12;
        int days = conversor +conversorAños;
        return days;
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
