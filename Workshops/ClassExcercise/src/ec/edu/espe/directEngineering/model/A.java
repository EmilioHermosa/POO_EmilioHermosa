
package ec.edu.espe.directEngineering.model;

import java.util.ArrayList;


public class A {
   private ArrayList<F>fs = new ArrayList();
   private ArrayList<G>gs = new ArrayList();
   private ArrayList<H>hs = new ArrayList();
   private B[] b = new B[3];

    public A() {
    }

    /**
     * @return the fs
     */
    public ArrayList<F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList<F> fs) {
        this.fs = fs;
    }

    /**
     * @return the gs
     */
    public ArrayList<G> getGs() {
        return gs;
    }

    /**
     * @param gs the gs to set
     */
    public void setGs(ArrayList<G> gs) {
        this.gs = gs;
    }

    /**
     * @return the hs
     */
    public ArrayList<H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList<H> hs) {
        this.hs = hs;
    }

    /**
     * @return the b
     */
    public B[] getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B[] b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" + "fs=" + fs + ", gs=" + gs + ", hs=" + hs + ", b=" + b + '}';
    }

   
}
