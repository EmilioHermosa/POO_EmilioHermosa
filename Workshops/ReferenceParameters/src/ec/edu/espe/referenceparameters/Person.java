
package ec.edu.espe.referenceparameters;


public class Person {
    
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
 
        String personInfo;
        personInfo= "id ->" +id + ", name ->" + name;
        return personInfo;
        
        
    }
    
    
    
    
    
    
    
}
