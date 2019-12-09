
package ec.edu.espe.directEngineering.model;


public class F extends C{
    
    private K k;
    

    public F(D d, E e) {
        super(d, e);
    }

    public F() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void print() {
        System.out.println("Print for F"); 
    }

    public F(K k, D d, E e) {
        super(d, e);
        this.k = k;
    }

    /**
     * @return the k
     */
    public K getK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(K k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "F{" + "k=" + k + '}';
    }
    
    
}
