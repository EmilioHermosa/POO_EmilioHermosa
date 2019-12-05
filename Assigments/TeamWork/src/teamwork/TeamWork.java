
package teamwork;

import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;


public class TeamWork {

   
    public static void main(String[] args) throws IOException {
        ArrayList<Person> persons = new ArrayList();
        CalcAge calcAge = new CalcAge();
        persons.add(new Person("Carlos","2000" ,calcAge.restar_fecha("10/02/2000")));
        persons.add(new Person("Pepe","2001" ,calcAge.restar_fecha("3/11/2001")));
        persons.add(new Person("Maria","1999" ,calcAge.restar_fecha("17/08/1999")));

        CsvWriter file = new CsvWriter("data.csv");
        Gson gson = new Gson();
        String pers = gson.toJson(persons);
        file.write(pers);
        
        
        //calcAge.restar_fecha(pers);
        
        /*for (Person person : persons) { 
            String [] data = person.getArray();
            file.writeRecord(data);
        }*/
        
        file.close();
    }
    
}
