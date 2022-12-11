/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import UI.LoginScreen;

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

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnPlasmaCenter = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnPCEmployee = new javax.swing.JButton();
        btnHosEmployee = new javax.swing.JButton();

        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(580, 30, 100, 23);

        btnHospital.setText("HOSPITALS");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(btnHospital);
        btnHospital.setBounds(500, 130, 180, 40);

        btnPlasmaCenter.setText("PLASMA CENTERS");
        btnPlasmaCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasmaCenterActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlasmaCenter);
        btnPlasmaCenter.setBounds(100, 140, 190, 40);

        lblTitle.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        lblTitle.setText("ADMIN PORTAL");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(20, 10, 350, 50);

        btnPCEmployee.setText("PLASMA CENTER EMPLOYEES");
        btnPCEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnPCEmployee);
        btnPCEmployee.setBounds(60, 270, 290, 80);

        btnHosEmployee.setText("HOSPITAL EMPLOYEES");
        btnHosEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHosEmployee);
        btnHosEmployee.setBounds(470, 270, 270, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnPCEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCEmployeeActionPerformed
      AdminEmployee AE= new AdminEmployee();
      AE.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnPCEmployeeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        LoginScreen frame = new  LoginScreen();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnHosEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosEmployeeActionPerformed
        // TODO add your handling code here:
      AdminHosEmployee AHE= new AdminHosEmployee();
      AHE.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnHosEmployeeActionPerformed

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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHosEmployee;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPCEmployee;
    private javax.swing.JButton btnPlasmaCenter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
