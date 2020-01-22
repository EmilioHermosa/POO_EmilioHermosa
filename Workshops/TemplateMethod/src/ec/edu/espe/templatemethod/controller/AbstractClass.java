
package ec.edu.espe.templatemethod.controller;


public abstract class AbstractClass {
    public int getValue(int num){
    
    int number = this.multiply(num);
    number = this.sum(number);
    return number;
    }
    
    
    
    public abstract int multiply(int num);
    public abstract int sum(int num);
}
