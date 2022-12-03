/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DBUTIL.DBUTIL;
import UI.Admin.AdminWorkArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rishikagurram
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    
    
    
    public LoginScreen() {
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

        btndonar = new javax.swing.JButton();
        btnngo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnstatus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btndonar.setText("Donor Registration");
        btndonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndonarActionPerformed(evt);
            }
        });
        getContentPane().add(btndonar);
        btndonar.setBounds(20, 110, 150, 40);

        btnngo.setText("NGO Registration");
        btnngo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnngoActionPerformed(evt);
            }
        });
        getContentPane().add(btnngo);
        btnngo.setBounds(20, 200, 160, 40);

        jButton2.setText("Request For Plasma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 280, 170, 40);

        btnstatus.setText("Availability Status");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });
        getContentPane().add(btnstatus);
        btnstatus.setBounds(20, 360, 160, 40);

        jButton1.setText("Analyse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 440, 160, 40);
        getContentPane().add(txtUserName);
        txtUserName.setBounds(560, 100, 118, 30);
        getContentPane().add(pwdField);
        pwdField.setBounds(560, 150, 120, 30);

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("PASSWORD :");
        getContentPane().add(lblPassword);
        lblPassword.setBounds(462, 160, 80, 17);

        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("USERNAME :");
        getContentPane().add(lblUser);
        lblUser.setBounds(443, 97, 100, 30);

        lblTitle.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        lblTitle.setText("PlasMain - The Plasma Managery");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(210, 0, 439, 57);

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(580, 210, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/rishikagurram/Downloads/plasma login (1).jpeg")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 599));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndonarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btndonarActionPerformed

    private void btnngoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnngoActionPerformed

    }//GEN-LAST:event_btnngoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnstatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUserName.getText(); 
       char[] passwordCharArray = pwdField.getPassword();
       String password = String.valueOf(passwordCharArray);
       //flag to track if the password given is true or false
       boolean flag = false; 
       DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
       ResultSet resultSet1 = null;
       
System.out.println("Connected to database !!");
  String selectSql = "SELECT * from logins";
      Statement stmt;
        try {
            stmt = conn.createStatement();
       
            resultSet1 = stmt.executeQuery(selectSql);
            
            while(resultSet1.next())
            {
                System.out.println("here1");
                if(resultSet1.getString(1).equals(username) && resultSet1.getString(2).equals(password))
                {
                     System.out.println("here2");
                   flag = true; 
                   int x = Integer.valueOf(resultSet1.getString(3));
                   if(x==1)
                   {
                        //JOptionPane.showMessageDialog(this , "NOW OPEN THE ADMIN PAGE");
                        AdminWorkArea AWA= new AdminWorkArea();
                        
                        this.dispose();
                        AWA.setVisible(true);
           }
                   if(x==2)
                {
                    JOptionPane.showMessageDialog(this , "NOW OPEN THE hospital ADMIN PAGE");
                 }
                }
            }
            if(flag==false)
            {
                JOptionPane.showMessageDialog(this , "invalid username password");
            }
        }catch (SQLException ex) {
              System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this , "Connection error1");
          }
            
            
            
            
       
            
          
         

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btndonar;
    private javax.swing.JButton btnngo;
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
