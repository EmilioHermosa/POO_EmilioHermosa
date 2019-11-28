/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowspractice;

/**
 *
 * @author User
 */
public class WindowsPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Windows window = new Windows(); //SE CREA LA VENTANA PRINCIPAL
        window.setVisible(true); //SE HACE VISIBLE LA VENTANA
        window.setLocationRelativeTo(null); //SE CENTRA LA VENTANA
    }
    
}
