/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.workshop24menus.view;

/**
 *
 * @author H304
 */
public class FrmVideoGameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmVideoGameMenu
     */
    public FrmVideoGameMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGameOn = new javax.swing.JMenu();
        mnuItmAbout = new javax.swing.JMenuItem();
        mnuItmExit = new javax.swing.JMenuItem();
        mnuAccesories = new javax.swing.JMenu();
        mnuStorage = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuReport = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuGameOn.setText("GameOn");

        mnuItmAbout.setText("About");
        mnuGameOn.add(mnuItmAbout);

        mnuItmExit.setText("Exit");
        mnuGameOn.add(mnuItmExit);

        jMenuBar1.add(mnuGameOn);

        mnuAccesories.setText("Accesories");

        mnuStorage.setText("Storage");

        jMenuItem3.setText("jMenuItem3");
        mnuStorage.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        mnuStorage.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        mnuStorage.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        mnuStorage.add(jMenuItem6);

        mnuAccesories.add(mnuStorage);

        mnuReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReport.setText("Report");
        mnuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportActionPerformed(evt);
            }
        });
        mnuAccesories.add(mnuReport);

        jMenuBar1.add(mnuAccesories);

        mnuHelp.setText("Help");

        jMenu4.setText("jMenu4");
        mnuHelp.add(jMenu4);

        jMenu5.setText("jMenu5");
        mnuHelp.add(jMenu5);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportActionPerformed
        
        FrmReport frmReport = new FrmReport();
        frmReport.setVisible(true);
        
        
    }//GEN-LAST:event_mnuReportActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVideoGameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu mnuAccesories;
    private javax.swing.JMenu mnuGameOn;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuItmAbout;
    private javax.swing.JMenuItem mnuItmExit;
    private javax.swing.JMenuItem mnuReport;
    private javax.swing.JMenu mnuStorage;
    // End of variables declaration//GEN-END:variables
}
