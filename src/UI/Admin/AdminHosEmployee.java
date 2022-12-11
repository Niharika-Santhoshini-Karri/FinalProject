/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishikagurram
 */
public class AdminHosEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AdminHosEmployee
     */
     DBUTIL dbconn= new DBUTIL();
     Random rand = new Random();
    Validations validations;
    ResultSet resultSet1, resultSet2 = null;
    public AdminHosEmployee() {
        initComponents();
       
        validations= new Validations();
         UpdateComboxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblhos = new javax.swing.JLabel();
        ComboHospital = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        lblEmployeeName1 = new javax.swing.JLabel();
        lblEmployeeName2 = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        lblEmployeeName = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        valUsername = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtEmpName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        lblEmployeeName3 = new javax.swing.JLabel();
        lblhos1 = new javax.swing.JLabel();
        ComboDepts = new javax.swing.JComboBox<>();
        valDept = new javax.swing.JLabel();
        valHosp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblhos.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblhos.setText("HOSPITAL");
        getContentPane().add(lblhos);
<<<<<<< Updated upstream
        lblhos.setBounds(60, 260, 110, 16);
=======
        lblhos.setBounds(60, 220, 90, 17);
>>>>>>> Stashed changes

        ComboHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(ComboHospital);
<<<<<<< Updated upstream
        ComboHospital.setBounds(290, 260, 140, 22);
=======
        ComboHospital.setBounds(180, 220, 160, 30);
>>>>>>> Stashed changes

        btnAdd.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnAdd.setText("CREATE EMPLOYEE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
<<<<<<< Updated upstream
        btnAdd.setBounds(70, 480, 210, 23);
=======
        btnAdd.setBounds(180, 550, 230, 23);
>>>>>>> Stashed changes

        lblEmployeeName1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblEmployeeName1.setText("PASSWORD");
        getContentPane().add(lblEmployeeName1);
<<<<<<< Updated upstream
        lblEmployeeName1.setBounds(180, 420, 100, 16);
=======
        lblEmployeeName1.setBounds(40, 480, 120, 17);
>>>>>>> Stashed changes

        lblEmployeeName2.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblEmployeeName2.setText("EMPLOYEE ID");
        getContentPane().add(lblEmployeeName2);
<<<<<<< Updated upstream
        lblEmployeeName2.setBounds(60, 140, 150, 16);
=======
        lblEmployeeName2.setBounds(40, 110, 120, 17);
>>>>>>> Stashed changes

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPassword);
        valPassword.setBounds(350, 480, 320, 20);

        lblEmployeeName.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblEmployeeName.setText("USERNAME");
        getContentPane().add(lblEmployeeName);
<<<<<<< Updated upstream
        lblEmployeeName.setBounds(180, 380, 110, 16);

        txtEmpID.setEditable(false);
        getContentPane().add(txtEmpID);
        txtEmpID.setBounds(280, 130, 160, 22);
=======
        lblEmployeeName.setBounds(50, 430, 130, 17);
        getContentPane().add(txtEmpID);
        txtEmpID.setBounds(180, 110, 160, 30);
>>>>>>> Stashed changes

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("HOSPITAL EMPLOYEES ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(40, 10, 410, 29);

        valUsername.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valUsername);
        valUsername.setBounds(360, 430, 310, 20);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(370, 160, 310, 20);

        btnBack.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
<<<<<<< Updated upstream
        btnBack.setBounds(480, 10, 100, 23);
        getContentPane().add(txtEmpName);
        txtEmpName.setBounds(290, 190, 160, 22);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(270, 420, 140, 22);

        btndel.setText("DELETE");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        getContentPane().add(btndel);
        btndel.setBounds(360, 480, 170, 23);
=======
        btnBack.setBounds(460, 10, 120, 23);
        getContentPane().add(txtEmpName);
        txtEmpName.setBounds(180, 160, 160, 30);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(190, 480, 140, 23);
>>>>>>> Stashed changes

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername);
<<<<<<< Updated upstream
        txtUsername.setBounds(270, 380, 140, 22);
=======
        txtUsername.setBounds(190, 430, 140, 23);
>>>>>>> Stashed changes

        lblEmployeeName3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblEmployeeName3.setText("NAME");
        getContentPane().add(lblEmployeeName3);
<<<<<<< Updated upstream
        lblEmployeeName3.setBounds(60, 200, 110, 16);
=======
        lblEmployeeName3.setBounds(80, 170, 60, 17);
>>>>>>> Stashed changes

        lblhos1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        lblhos1.setText("DEPARTMENT");
        getContentPane().add(lblhos1);
<<<<<<< Updated upstream
        lblhos1.setBounds(40, 310, 110, 16);
=======
        lblhos1.setBounds(50, 280, 120, 17);
>>>>>>> Stashed changes

        ComboDepts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Laboratory", "Accountant" }));
        ComboDepts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDeptsActionPerformed(evt);
            }
        });
        getContentPane().add(ComboDepts);
<<<<<<< Updated upstream
        ComboDepts.setBounds(300, 310, 140, 22);
=======
        ComboDepts.setBounds(190, 270, 150, 30);
>>>>>>> Stashed changes

        valDept.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valDept);
        valDept.setBounds(370, 280, 320, 20);

        valHosp.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valHosp);
        valHosp.setBounds(370, 220, 330, 20);

        jLabel11.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel11.setText("SET UP ACCOUNT  ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 350, 270, 40);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/admin portal.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHospitalActionPerformed
        // TODO add your handling code here:
        Object hosp = ComboHospital.getSelectedItem();
        

        if (hosp  == null || hosp .toString().equals("")) {
            valHosp.setText("Please Select Blood Group");
            ComboHospital.removeAllItems();
           valHosp.setText(null);
        } else {
            ComboHospital.setSelectedItem("");
        }
        // ComboHospital.addItem("abcd");
        //ComboHospital.addItem("efgh");

    }//GEN-LAST:event_ComboHospitalActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        var valid = true;

        if (!this.validations.ValidateName(txtEmpName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateUsername(txtUsername.getText()) ) {
            valUsername.setText("Username is Invalid");
            valid = false;
        }

        String pass_word = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(pass_word) ) {
            valPassword.setText("Should be 4-12 character long");
            valid = false;
        }

        String emp_name = txtEmpName.getText();
        int user_id = Integer.valueOf(txtUsername.getText());
        String password = txtPassword.getText();

        //int emp_id = Integer.valueOf(txtEmpID.getText());
        int emp_id = rand.nextInt(1,1000);

        String shos_id = (String) ComboHospital.getSelectedItem();
        int hos_id = Integer.valueOf(shos_id);
        
        int role_id=100; 
        String role_name =(String) ComboDepts.getSelectedItem(); 
        
        System.out.println(role_name);
        
        if(role_name.equals("Administrator"))
        {
            role_id = 2; 
        }
        if(ComboDepts.getSelectedItem().equals("Laboratory"))
        {
            role_id = 8; 
        }
        if(ComboDepts.getSelectedItem().equals("Accountant"))
        {
            role_id = 9; 
        }
        if(role_id ==100)
        {
           JOptionPane.showMessageDialog(this,"Role not selected");
        }



        
        Connection conn = dbconn.getConnection();
        
        String INSERLOGINSSQL = "insert into logins(user_id, pass_word,role_id) values(?,?,?) ";
        String INSERTEMPLOYEESQL = "insert into emphos(emp_id, hos_id,employee_name, user_id) values(?,?,?,?)";

        PreparedStatement stmt1, stmt2;
        try
        {
            stmt1 = conn.prepareStatement(INSERLOGINSSQL);
            stmt2 = conn.prepareStatement(INSERTEMPLOYEESQL);

            stmt1.setInt(1,user_id);
            stmt1.setString(2,password);
            stmt1.setInt(3,role_id);
            
            System.out.println("inserted into logins!");

            stmt2.setInt(1,emp_id);
            stmt2.setInt(2,hos_id);
            
            stmt2.setString(3, emp_name);
            stmt2.setInt(4,user_id);

            stmt1.executeUpdate();
            stmt2.executeUpdate();

        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHosEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this,"Employee Created");

        //stop
        txtEmpName.setText("");
        txtEmpID.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        ComboDepts.setSelectedItem("");

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void ComboDeptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDeptsActionPerformed
        // TODO add your handling code here:
//        Object hosp_department = ComboDepts.getSelectedItem();
//        
//
//        if (hosp_department  == null || hosp_department .toString().equals("")) {
//            valDept.setText("Please Select ");
//            ComboDepts.removeAllItems();
//           valDept.setText(null);
//        } else {
//            ComboDepts.setSelectedItem("");
//        }
    }//GEN-LAST:event_ComboDeptsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHosEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHosEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDepts;
    private javax.swing.JComboBox<String> ComboHospital;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblEmployeeName1;
    private javax.swing.JLabel lblEmployeeName2;
    private javax.swing.JLabel lblEmployeeName3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblhos;
    private javax.swing.JLabel lblhos1;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel valDept;
    private javax.swing.JLabel valHosp;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPassword;
    private javax.swing.JLabel valUsername;
    // End of variables declaration//GEN-END:variables

    private void UpdateComboxes() {
       Connection conn = dbconn.getConnection();
        
        String SELECTSQL2 = "SELECT HOS_ID FROM HOSPITAL";

        PreparedStatement stmt2; 
        try
        {
            
            stmt2 = conn.prepareStatement(SELECTSQL2);
            
            resultSet2 = stmt2.executeQuery(); 
            
            
            
            while(resultSet2.next())
            {
                ComboHospital.addItem(resultSet2.getString(1));
            }
       
             
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHosEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
