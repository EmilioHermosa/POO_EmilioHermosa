package ec.edu.espe.TestAge;





public class YearCalc {
    
    int year;
    int month;
    int day;
    
    
    
    public static int calcYear(int year){
    
        if(year < 2019){
        int actualYear=2019;
        int years = actualYear - year;
        return years; 
        }
        else{
        return -1;
        } 
    }
    
    
    
    
  
    
    
}
