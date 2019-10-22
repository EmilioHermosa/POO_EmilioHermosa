package ec.edu.espe.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.dao.IPerson;
import ec.edu.espe.demo.dao.imp.Student;
import ec.edu.espe.demo.dao.imp.Teacher;
import ec.edu.espe.demo.util.Person;

@RestController
@RequestMapping("/api/demo")
public class DemoRestController{
   
    

    IPerson person = new Student();
    IPerson person2 = new Teacher();

    @GetMapping("/student")
    public String getStudent(){
            return person.sayHello();
    }

    @GetMapping("/teacher")
    public String getTeacher(){
        return person2.sayHello();
    }






    @GetMapping
    public String hello(){
       return "HOLA MUNDO, SOY EL SERVICIO REST";
   }
    @GetMapping("/goodbye")
    public String goodbye(){
       return "ADIOS!!!!!!!!!!!!";
   }
    
    @GetMapping(value = "/callme/{name}/{age}")
    public Person getpPerson(@PathVariable String name,@PathVariable int age){
       return new Person(name, age);
   }

    @PostMapping
    public Person person(@RequestBody Person per){
    per.setAge(50);
    return per;
}


}

