/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcage;

/**
 *
 * @author User
 */
public class Age {
    public static void main(String[] args) {
            
        CalcAge calc = new CalcAge();
        calc.calcAge(13,07,1997);
        CalculateAge age = new CalculateAge();
        age.setTitle("Calcula tu edad");
        CalculateAge calcAge = new CalculateAge(); //SE CREA LA VENTANA PRINCIPAL
        calcAge.setVisible(true); //SE HACE VISIBLE LA VENTANA
        calcAge.setLocationRelativeTo(null);
    }
}
