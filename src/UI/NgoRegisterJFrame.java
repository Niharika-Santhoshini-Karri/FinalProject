/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Niharika
 */
public class NgoRegisterJFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form NgoRegisterJFrame
     */
    Validations validations;
    ResultSet resultSet1= null;
    DBUTIL dbconn= new DBUTIL();
    public NgoRegisterJFrame() {
        initComponents();
        validations = new Validations();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        valPhone = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        valUsername = new javax.swing.JLabel();
        valAddress = new javax.swing.JLabel();
        valZipcode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtUser_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("NGO REGISTRATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(195, 61, 226, 25);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NGO Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(161, 135, 94, 25);

        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(161, 176, 78, 25);

        jLabel4.setText("CONTACT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(161, 263, 81, 25);

        jLabel5.setText("USER ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(161, 304, 66, 25);

        jLabel6.setText("PASSWORD");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 340, 96, 25);

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(200, 420, 94, 31);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(56, 32, 72, 31);

        jLabel7.setText("ZIPCODE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(165, 222, 73, 25);

        valPhone.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPhone);
        valPhone.setBounds(380, 260, 160, 20);

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPassword);
        valPassword.setBounds(370, 340, 200, 20);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(390, 130, 180, 20);

        valUsername.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valUsername);
        valUsername.setBounds(400, 300, 180, 20);

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAddress);
        valAddress.setBounds(380, 170, 190, 20);

        valZipcode.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valZipcode);
        valZipcode.setBounds(380, 220, 180, 20);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(350, 130, 120, 31);

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });
        getContentPane().add(txtContact);
        txtContact.setBounds(240, 260, 110, 20);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        getContentPane().add(txtAddress);
        txtAddress.setBounds(350, 170, 120, 31);

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });
        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyReleased(evt);
            }
        });
        getContentPane().add(txtZipCode);
        txtZipCode.setBounds(240, 220, 110, 31);

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(290, 340, 90, 31);

        txtUser_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUser_IDActionPerformed(evt);
            }
        });
        txtUser_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUser_IDKeyReleased(evt);
            }
        });
        getContentPane().add(txtUser_ID);
        txtUser_ID.setBounds(290, 300, 110, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
      var valid = true;
      if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("NGO Name is Invalid");
            valid = false;
        }
      if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
            valid = false;
        }
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipcode.setText("Zipcode is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateUsername(txtUser_ID.getText()) ) {
            valUsername.setText("Username is Invalid");
            valid = false;
        } 

        String pass_word = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(pass_word) ) {
            valPassword.setText("Should be 4-12 character long");
            valid = false;
        }
        
        String name = txtName.getText(); 
       String contact = txtContact.getText();
       String Address = txtAddress.getText();
       int zipcode = Integer.valueOf(txtZipCode.getText());
       int user_id = Integer.valueOf(txtUser_ID.getText()); 
      // String pass_word = txtPassword.getText();
       
  
       
       String countNGOs = "select count(*) from NGO";
        
        String addNGO = "insert into ngo(ngo_id, ngo_name, "
                + " address,zipcode,user_id,contact) values (?,?,?,?,?,?)";
        
        String adduser = "insert into logins(user_id, pass_word, role_id) values(?,?,?)";
        
        
        
        Connection conn = dbconn.getConnection();
        PreparedStatement stmt1, stmt2, stmt3 ; 
        try
        {
            stmt1 = conn.prepareStatement(countNGOs);
            resultSet1 = stmt1.executeQuery();
            resultSet1.next(); 
            int ngo_id = Integer.valueOf(resultSet1.getString(1));
            ngo_id ++; 
            
            
            
            stmt3 = conn.prepareStatement(adduser);
            
            stmt3.setInt(1,user_id); 
            stmt3.setString(2,pass_word);
            stmt3.setInt(3,5);
            
            stmt3.executeQuery();
            
            stmt2 = conn.prepareStatement(addNGO);
            
            
              
             
            stmt2.setInt(1,ngo_id); 
            stmt2.setString(2,name);
            stmt2.setString(3,Address);
            stmt2.setInt(4,zipcode);
            stmt2.setInt(5,user_id);
            stmt2.setString(6,contact);
            
            
            
            stmt2.executeUpdate();
            
            
            
            }
        catch (SQLException ex)
        {
            Logger.getLogger(NgoRegisterJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //
        //
        
        JOptionPane.showMessageDialog(this,"Registered Successfully");
        
        txtName.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        txtZipCode.setText("");
        txtUser_ID.setText("");
        txtPassword.setText("");
    
     
      
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("NGO Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
        }
        else {
            valPhone.setText(null);
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
        }

        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed

    private void txtZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipcode.setText("zipcode is Invalid");
        }

        else {
            valZipcode.setText(null);
        }
    }//GEN-LAST:event_txtZipCodeKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        String password = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 4-12 character long");
        } else {
            valPassword.setText(null);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtUser_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUser_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUser_IDActionPerformed

    private void txtUser_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_IDKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateUsername(txtUser_ID.getText()) ) {
            valUsername.setText("Username is Invalid");
         }

        else {
            valUsername.setText(null);
         }
    }//GEN-LAST:event_txtUser_IDKeyReleased

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
            java.util.logging.Logger.getLogger(NgoRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NgoRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NgoRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NgoRegisterJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NgoRegisterJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser_ID;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhone;
    private javax.swing.JLabel valUsername;
    private javax.swing.JLabel valZipcode;
    // End of variables declaration//GEN-END:variables
}
