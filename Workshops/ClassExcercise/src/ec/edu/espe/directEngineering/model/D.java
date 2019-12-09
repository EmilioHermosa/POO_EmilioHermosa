
package ec.edu.espe.directEngineering.model;


public class D {
    private int a;
    
    public void m(){
        System.out.println("Calling method m of class D");
    }

    public D(int a) {
        this.a = a;
    }

    
    @Override
    public String toString() {
        return "D{" + "a=" + a + '}';
    }
    
    
}
