package ec.edu.espe.demo.dao.imp;

import ec.edu.espe.demo.dao.IPerson;

public class Student implements IPerson{

    @Override
    public String sayHello() {   
        return "Holoa soy un ESTUDIANTE";
    }
    
}