/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

/**
 *
 * @author Aish
 */
public class AdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form AdminWorkArea
     */
    public AdminWorkArea() {
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

        btnStock = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnPlasmaCenter = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnEmployees = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnStock.setText("ANALYSE STOCK");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnStock);
        btnStock.setBounds(500, 370, 170, 40);

        btnHospital.setText("HOSPITALS");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHospital);
        btnHospital.setBounds(170, 370, 180, 40);

        btnPlasmaCenter.setText("PLASMA CENTERS");
        btnPlasmaCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasmaCenterActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlasmaCenter);
        btnPlasmaCenter.setBounds(160, 130, 190, 40);

        lblTitle.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblTitle.setText("ADMIN PORTAL");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 350, 50);

        btnEmployees.setText("EMPLOYEES");
        btnEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmployees);
        btnEmployees.setBounds(500, 130, 180, 40);

        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(2, 0, 800, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed

    }//GEN-LAST:event_btnStockActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
      AdminHospital AH= new AdminHospital();
      AH.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnPlasmaCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlasmaCenterActionPerformed
      AdminPC APC= new AdminPC();
      APC.setVisible(true);
      this.dispose();
      
    }//GEN-LAST:event_btnPlasmaCenterActionPerformed

    private void btnEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeesActionPerformed
      AdminEmployee AE= new AdminEmployee();
      AE.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnEmployeesActionPerformed

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
            java.util.logging.Logger.getLogger(AdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPlasmaCenter;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
