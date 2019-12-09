
package ec.edu.espe.directEngineering.model;


public class G extends C{
    private I i;

    public G(D d, E e) {
        super(d, e);
    }

    G(I i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void print() {
        System.out.println("Print for G");
    }
 
    public G(I i, D d, E e) {
        super(d, e);
        this.i = i;
    }

    /**
     * @return the i
     */
    public I getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(I i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "G{" + "i=" + i + '}';
    }
    
    
}
