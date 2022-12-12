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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Aish
 */
public class VDonorRegForm extends javax.swing.JFrame {

    /**
     * Creates new form VDonorRegForm
     */
    Validations validations;
    ResultSet resultSet1, resultSet2= null;
     Random rand = new Random();
    DBUTIL dbconn= new DBUTIL();
    public VDonorRegForm() {
        initComponents();
        validations = new Validations();
        updatecombox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNGO = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser_ID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboxNGO = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        valName = new javax.swing.JLabel();
        valAge = new javax.swing.JLabel();
        valGender = new javax.swing.JLabel();
        valPhone = new javax.swing.JLabel();
        valAddress = new javax.swing.JLabel();
        valUsername = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();
        valBlood = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBlood1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        valEmail = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnBack.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(510, 20, 72, 24);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 60, 100, 18);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel2.setText("BLOOD GROUP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 180, 170, 18);

        lblNGO.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblNGO.setText("NGO");
        getContentPane().add(lblNGO);
        lblNGO.setBounds(110, 340, 130, 18);

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 470, 80, 20);

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
        txtUser_ID.setBounds(200, 420, 150, 30);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(220, 100, 120, 40);

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
        txtName.setBounds(220, 51, 120, 40);

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
        txtAddress.setBounds(220, 290, 130, 40);

        jLabel5.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 140, 70, 18);

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel6.setText("AGE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 100, 90, 18);

        comboxNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxNGOActionPerformed(evt);
            }
        });
        getContentPane().add(comboxNGO);
        comboxNGO.setBounds(220, 330, 130, 31);

        jLabel7.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel7.setText("CONTACT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 210, 130, 20);

        jLabel8.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel8.setText("USER ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 420, 80, 20);

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
        txtContact.setBounds(220, 210, 130, 30);

        btnRegister.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister);
        btnRegister.setBounds(220, 540, 110, 30);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(360, 60, 210, 20);

        valAge.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAge);
        valAge.setBounds(370, 100, 190, 20);

        valGender.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valGender);
        valGender.setBounds(350, 140, 200, 20);

        valPhone.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPhone);
        valPhone.setBounds(370, 210, 200, 20);

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAddress);
        valAddress.setBounds(360, 300, 210, 20);

        valUsername.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valUsername);
        valUsername.setBounds(360, 430, 220, 20);

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPassword);
        valPassword.setBounds(360, 480, 230, 20);

        btnGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMale);
        btnMale.setBounds(210, 140, 64, 29);

        btnGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnFemale);
        btnFemale.setBounds(280, 140, 81, 29);

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(200, 470, 150, 30);

        valBlood.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valBlood);
        valBlood.setBounds(360, 170, 210, 20);

        jLabel9.setBackground(new java.awt.Color(51, 102, 255));
        jLabel9.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel9.setText("SETUP ACCOUNT AND VIEW DONATIONS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 380, 540, 32);

        jLabel10.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 290, 130, 18);

        ComboBlood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "AB+", "AB-", "A+", "A-", "B+", "B-" }));
        ComboBlood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBlood1ActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBlood1);
        ComboBlood1.setBounds(220, 170, 120, 31);

        jLabel11.setBackground(new java.awt.Color(51, 102, 255));
        jLabel11.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel11.setText("VOLUNTARY DONOR REGISTRATION");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 0, 480, 32);

        jLabel12.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel12.setText("EMAIL");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 250, 70, 18);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(220, 250, 130, 40);

        valEmail.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valEmail);
        valEmail.setBounds(370, 250, 200, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/VDONOR.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUser_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUser_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUser_IDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        var valid = true;
        
         if (comboxNGO.getSelectedItem() == null || comboxNGO.getSelectedItem().toString().isEmpty()) {
            valBlood.setText("Please Select Blood Group");
            valid = false;
            return ;
        }
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
            return ;
        }


        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
            return ;
        }

       

        if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
            valid = false;
            return ;
        }
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
            valid = false;
            return ;
        }

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
            return ;
        }

        if (!this.validations.ValidateUsername(txtUser_ID.getText()) ) {
            valUsername.setText("Username is Invalid");
            valid = false;
            return ;
        } 

        String pass_word = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(pass_word) ) {
            valPassword.setText("Should be 4-12 character long");
            valid = false;
            return ;
        }

        //
        if (valid) {

            String gender = null;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }
           
            
        String name = txtName.getText(); 
        int age = Integer.valueOf(txtAge.getText()); 
        //String gender = btnGender.getSelection();
        
        String bloodgroup = (String) ComboBlood1.getSelectedItem(); 
        String email = txtEmail.getText(); 
        
        
        
        String contact = txtContact.getText();
        String Address = txtAddress.getText();
        int user_id = Integer.valueOf(txtUser_ID.getText()); 
        //String pass_word = txtPassword.getText();
        
        
        
        String addDonor = "insert into vdonor(vdonor_id, user_id, vname, age, gender, "
                + "contact, address, blood_group, ngo_id, email) values (?,?,?,?,?,?,?,?,?,?)";
        
        String adduser = "insert into logins(user_id, pass_word, role_id) values(?,?,?)";
        
        String ngo_name = (String) comboxNGO.getSelectedItem();
        
        
        
        Connection conn = dbconn.getConnection();
        PreparedStatement stmt2, stmt3; 
        try
        {
            
           String strngo_id =(String) comboxNGO.getSelectedItem(); 
           int ngo_id = Integer.valueOf(strngo_id); 
            
            int vdonor_id = rand.nextInt(1,1000);
            
            
            
            stmt3 = conn.prepareStatement(adduser);
            
            stmt3.setInt(1,user_id); 
            stmt3.setString(2,pass_word);
            stmt3.setInt(3,7);
            
            stmt3.executeQuery();
            
            stmt2 = conn.prepareStatement(addDonor);
              
             
            stmt2.setInt(1,vdonor_id); 
            stmt2.setInt(2,user_id);
            stmt2.setString(3,name);
            stmt2.setInt(4,age);
            stmt2.setString(5,gender);
            stmt2.setString(6,contact);
            stmt2.setString(7,Address);
            stmt2.setString(8,bloodgroup);
            stmt2.setInt(9,ngo_id);
            stmt2.setString(10,email);
            
            
            stmt2.executeUpdate();
            
            
            
         JOptionPane.showMessageDialog(this,"Registered Successfully");   
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(VDonorRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
      setTextNull();
      setValidationNull();  
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void comboxNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxNGOActionPerformed
        // TODO add your handling code here:
        Object blood_group = comboxNGO.getSelectedItem();
        

        if (blood_group == null || blood_group.toString().equals("")) {
            valBlood.setText("Please Select Blood Group");
            comboxNGO.removeAllItems();
            valBlood.setText(null);
        } else {
            comboxNGO.setSelectedItem("");
        }
    }//GEN-LAST:event_comboxNGOActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
         if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
        }
        else {
            valAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
        // TODO add your handling code here:
                if (!this.validations.ValidatePhoneNumber(txtContact.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
        }
        else {
            valPhone.setText(null);
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void txtUser_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUser_IDKeyReleased
        // TODO add your handling code here:
         if (!this.validations.ValidateUsername(txtUser_ID.getText()) ) {
            valUsername.setText("User ID is Invalid");
         }

        else {
            valUsername.setText(null);
         }
    }//GEN-LAST:event_txtUser_IDKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        String password = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 4-12 character long");
        } else {
            valPassword.setText(null);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
         }

        else {
            valAddress.setText(null);
         }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.hide();
        LoginScreen frame = new LoginScreen();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ComboBlood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBlood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBlood1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        
        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email is Invalid");
         }

        else {
            valEmail.setText(null);
         }
    }//GEN-LAST:event_txtEmailKeyReleased

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
            java.util.logging.Logger.getLogger(VDonorRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDonorRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDonorRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDonorRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDonorRegForm().setVisible(true);
            }
        });
    }
    
    private void setTextNull() {
        
        btnGender.clearSelection();
        txtName.setText(null);
        txtAge.setText(null);
        txtContact.setText(null);
        txtUser_ID.setText(null);
        txtPassword.setText(null);
        txtAddress.setText(null);
        
    }
    
    private void setValidationNull() {
        
        valName.setText(null);
        valAddress.setText(null);
        valAge.setText(null);
        valGender.setText(null);
        valPhone.setText(null);
        valUsername.setText(null);
        valPassword.setText(null);
         valEmail.setText(null);
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBlood1;
    private javax.swing.JButton btnBack;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> comboxNGO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblNGO;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser_ID;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valAge;
    private javax.swing.JLabel valBlood;
    private javax.swing.JLabel valEmail;
    private javax.swing.JLabel valGender;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valPhone;
    private javax.swing.JLabel valUsername;
    // End of variables declaration//GEN-END:variables

    private void updatecombox() {
        Connection conn = dbconn.getConnection();
        String SELECTSQL1 = "select NGO_id from ngo";
       
        PreparedStatement stmt1; 
        try
        {
            stmt1 = conn.prepareStatement(SELECTSQL1);
             resultSet2 = stmt1.executeQuery();
           
            while(resultSet2.next())
            {
                comboxNGO.addItem(resultSet2.getString(1));
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(VDonorRegForm.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
