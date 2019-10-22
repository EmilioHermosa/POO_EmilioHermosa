package ec.edu.espe.demo.dao.imp;

import ec.edu.espe.demo.dao.IPerson;

public class Teacher implements IPerson{

    @Override
    public String sayHello() {
        
        return "Hola spy un PROFESOR";
    }

}