/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.proyecto.view;


import ec.espe.edu.proyecto.model.IPersonal;
import ec.espe.edu.proyecto.model.Menu;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Invitado
 */
public class JfrmMain extends javax.swing.JFrame {

    /**
     * Creates new form userMainVist
     */
    public JfrmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Video games");
        this.setIconImage(new ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/iconSystem.png")).getImage());
        this.setTitle("Game On System - Loggin");
        this.setLocationRelativeTo(JfrmMain.this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbutLogIn = new javax.swing.JButton();
        jfrmGetPassword = new javax.swing.JPasswordField();
        jfrmGetUserName = new javax.swing.JTextField();
        JbutExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Almacen VideoGames ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 136, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 23));

        jbutLogIn.setText("Log In");
        jbutLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutLogInActionPerformed(evt);
            }
        });
        getContentPane().add(jbutLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jfrmGetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfrmGetPasswordActionPerformed(evt);
            }
        });
        jfrmGetPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfrmGetPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(jfrmGetPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 104, -1));

        jfrmGetUserName.setToolTipText("Tu usuario");
        jfrmGetUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfrmGetUserNameActionPerformed(evt);
            }
        });
        jfrmGetUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jfrmGetUserNameKeyPressed(evt);
            }
        });
        getContentPane().add(jfrmGetUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 104, -1));

        JbutExit.setText("Salir");
        JbutExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbutExitActionPerformed(evt);
            }
        });
        getContentPane().add(JbutExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 65, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/espe/edu/imagenes/fondo verde.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 290, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutLogInActionPerformed
        String userName, userContra;
        userName = jfrmGetUserName.getText();
        userContra = jfrmGetPassword.getText();
        String admName = "pepito";
        String admContraseña = "pepito123";
        Menu menu = new Menu();
        IPersonal archivoPersonal = new IPersonal();
        if (userName.equals(admName) && userContra.equals(admContraseña)){

            menu.showMenuAdm();
        }
        else if (archivoPersonal.existPersonal(userName, userContra))try {
            menu.showMenuUser();
        } catch (IOException ex) {
            Logger.getLogger(JfrmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos","Mesage error" , 0);
        jfrmGetUserName.setText("");
        jfrmGetPassword.setText("");
    }//GEN-LAST:event_jbutLogInActionPerformed

    private void jfrmGetUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfrmGetUserNameActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jfrmGetUserNameActionPerformed

    private void jfrmGetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfrmGetPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfrmGetPasswordActionPerformed

    private void jfrmGetPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfrmGetPasswordKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || Character.isLetter(c))) evt.consume();
    }//GEN-LAST:event_jfrmGetPasswordKeyPressed

    private void jfrmGetUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jfrmGetUserNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfrmGetUserNameKeyPressed

    private void JbutExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbutExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JbutExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbutExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbutLogIn;
    private javax.swing.JPasswordField jfrmGetPassword;
    private javax.swing.JTextField jfrmGetUserName;
    // End of variables declaration//GEN-END:variables
}