/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.NGO;

import UI.LoginScreen;

/**
 *
 * @author Niharika
 */
public class NGOWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form NGOWorkArea
     */
    public NGOWorkArea() {
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

        btnDonorsList = new javax.swing.JButton();
        btnPlasmaReq = new javax.swing.JButton();
        btnPC = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnDonorsList.setText("DONORS LIST");
        btnDonorsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorsListActionPerformed(evt);
            }
        });
        getContentPane().add(btnDonorsList);
        btnDonorsList.setBounds(220, 280, 190, 50);

        btnPlasmaReq.setText("PLASMA REQUESTS");
        btnPlasmaReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlasmaReqActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlasmaReq);
        btnPlasmaReq.setBounds(220, 100, 181, 50);

        btnPC.setText("PLASMA CENTERS");
        btnPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCActionPerformed(evt);
            }
        });
        getContentPane().add(btnPC);
        btnPC.setBounds(220, 190, 190, 50);

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(480, 30, 100, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCActionPerformed
      Plasmacenters PLA = new Plasmacenters();
      PLA.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPCActionPerformed

    private void btnDonorsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorsListActionPerformed
      ViewDonors DON= new ViewDonors();
      DON.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDonorsListActionPerformed

    private void btnPlasmaReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlasmaReqActionPerformed
      PlasmaReq REQ= new PlasmaReq();
      REQ.setVisible(true);
      this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlasmaReqActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.hide();
        LoginScreen frame = new  LoginScreen();
        frame.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(NGOWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NGOWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NGOWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NGOWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NGOWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonorsList;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPC;
    private javax.swing.JButton btnPlasmaReq;
    // End of variables declaration//GEN-END:variables
}
