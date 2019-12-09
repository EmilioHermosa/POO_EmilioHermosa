
package ec.edu.espe.directEngineering.model;


public abstract class C {
    
    private D d;
    private E e;
    
    public abstract void print();

    public C(D d, E e) {
        this.d = d;
        this.e = e;
    }

    public C() {
    }
    
    

    /**
     * @return the d
     */
    public D getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(D d) {
        this.d = d;
    }

    /**
     * @return the e
     */
    public E getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(E e) {
        this.e = e;
    }
    
        
        
    
    
    
}
