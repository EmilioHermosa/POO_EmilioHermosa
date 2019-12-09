
package ec.edu.espe.directEngineering.model;


public class H extends C{
    private J j;

    public H(D d, E e) {
        super(d, e);
    }

    @Override
    public void print() {
        System.out.println("Print for H"); 
    }

    public H(J j, D d, E e) {
        super(d, e);
        this.j = j;
    }

    /**
     * @return the j
     */
    public J getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(J j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "H{" + "j=" + j + '}';
    }
    
    
}
