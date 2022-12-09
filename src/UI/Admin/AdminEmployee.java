/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import UI.LoginScreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishikagurram
 */
public class AdminEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AdminEmployee
     */
    Vector originalTableModel;
    ResultSet resultSet1, resultSet2 = null;
    DBUTIL dbconn= new DBUTIL();
    public AdminEmployee() {
        initComponents();
        populateTable();
        UpdateComboxes();
                originalTableModel = (Vector) ((DefaultTableModel) tblEmployees.getModel()).getDataVector().clone();

        
        
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT EMp_ID, EMPLOYEE_NAME FROM EMPLOYEE";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet1 = stmt.executeQuery(selectSql);

             while (resultSet1.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet1.getInt(1);
            row[1] = resultSet1.getString(2);
             
            
                model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(AdminEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboOrganizationList = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        ComboPlasmaCenter = new javax.swing.JComboBox<>();
        lblEmployeeName = new javax.swing.JLabel();
        ComboHospital = new javax.swing.JComboBox<>();
        lblbank = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblOrganizationPicker = new javax.swing.JLabel();
        lblhos = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployeeName1 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        lblEmployeeName2 = new javax.swing.JLabel();
        lblEmployeeName3 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ComboOrganizationList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital", "Plasma Center" }));
        ComboOrganizationList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboOrganizationListActionPerformed(evt);
            }
        });
        getContentPane().add(ComboOrganizationList);
        ComboOrganizationList.setBounds(350, 120, 163, 31);

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Employee_ID", "Employee_Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 170, 680, 140);

        getContentPane().add(ComboPlasmaCenter);
        ComboPlasmaCenter.setBounds(520, 470, 72, 31);

        lblEmployeeName.setText("Username :");
        getContentPane().add(lblEmployeeName);
        lblEmployeeName.setBounds(220, 520, 110, 25);

        ComboHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHospitalActionPerformed(evt);
            }
        });
        getContentPane().add(ComboHospital);
        ComboHospital.setBounds(200, 470, 72, 31);

        lblbank.setText("Plasma Center");
        getContentPane().add(lblbank);
        lblbank.setBounds(320, 470, 150, 25);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(400, 520, 360, 31);

        lblOrganizationPicker.setText(" Organization:");
        getContentPane().add(lblOrganizationPicker);
        lblOrganizationPicker.setBounds(160, 120, 130, 25);

        lblhos.setText("Hospital");
        getContentPane().add(lblhos);
        lblhos.setBounds(70, 470, 110, 25);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(790, 50, 100, 31);

        btndel.setText("DELETE");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        getContentPane().add(btndel);
        btndel.setBounds(670, 320, 100, 31);

        btnAdd.setText("CREATE EMPLOYEE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(240, 620, 210, 31);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("EMPLOYEES ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(170, 20, 220, 29);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(400, 560, 360, 31);

        lblEmployeeName1.setText("Password :");
        getContentPane().add(lblEmployeeName1);
        lblEmployeeName1.setBounds(230, 560, 100, 25);
        getContentPane().add(txtEmpID);
        txtEmpID.setBounds(280, 370, 360, 31);

        lblEmployeeName2.setText("Employee ID: ");
        getContentPane().add(lblEmployeeName2);
        lblEmployeeName2.setBounds(90, 370, 150, 25);

        lblEmployeeName3.setText("Name:");
        getContentPane().add(lblEmployeeName3);
        lblEmployeeName3.setBounds(90, 410, 110, 25);
        getContentPane().add(txtEmpName);
        txtEmpName.setBounds(280, 410, 360, 31);

        lbSearch.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        lbSearch.setText("SEARCH");
        getContentPane().add(lbSearch);
        lbSearch.setBounds(70, 70, 90, 30);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch);
        txtSearch.setBounds(150, 70, 430, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboOrganizationListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboOrganizationListActionPerformed
        
            
    }//GEN-LAST:event_ComboOrganizationListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
        
        Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblEmployees.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblEmployees.getModel();
         int emp_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from employees where emp_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, emp_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Employee Deleted");
        populateTable();
    }//GEN-LAST:event_btndelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            String emp_name = txtEmpID.getText(); 
            int user_id = Integer.valueOf(txtUsername.getText()); 
            String password = txtPassword.getText(); 
            
            int emp_id = Integer.valueOf(txtEmpID.getText());
            
            
            
            String shos_id = (String) ComboHospital.getSelectedItem();
            int hos_id = Integer.valueOf(shos_id);
            
            String spc_id = (String) ComboPlasmaCenter.getSelectedItem();
            int pc_id = Integer.valueOf(spc_id);
            
            
            int x = 2; 
            //validate username and password
            Connection conn = dbconn.getConnection();
        //do validation here.
        if(txtEmpID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid id");
           return;
        }
        if(txtUsername.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid username");
            return;
        }
        //check if the id already exists
     String INSERLOGINSSQL = "insert into logins(user_id, pass_word,role_id) values(?,?,?) ";
     String INSERTEMPLOYEESQL = "insert into employee(emp_id, hos_id, pc_id,employee_name, user_id) values(?,?,?,?,?)";

        PreparedStatement stmt1, stmt2; 
        try
        {
            stmt1 = conn.prepareStatement(INSERLOGINSSQL);
            stmt2 = conn.prepareStatement(INSERTEMPLOYEESQL);
            
            stmt1.setInt(1,user_id); 
            stmt1.setString(2,password); 
            stmt1.setInt(3,x);//role_id is set to =2// hospital_admin
            
            stmt2.setInt(1,emp_id); 
            // get hos_id or pc_id from combo box
            stmt2.setInt(2,hos_id); 
            stmt2.setInt(3, pc_id);
            stmt2.setString(4, emp_name);
            stmt2.setInt(5,user_id);
            
            stmt1.executeUpdate(); 
            stmt2.executeUpdate(); 
            
          }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }



        JOptionPane.showMessageDialog(this,"Employee Added");

       populateTable(); 
   
  //stop
   txtEmpName.setText("");
   ComboOrganizationList.setSelectedItem("");
   txtEmpID.setText("");
   txtUsername.setText("");
   txtPassword.setText("");
        
   
            
            
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void ComboHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHospitalActionPerformed
        // TODO add your handling code here:
        
       // ComboHospital.addItem("abcd");
        //ComboHospital.addItem("efgh");
            
    }//GEN-LAST:event_ComboHospitalActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblEmployees.getModel();

        model.setRowCount(0);
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(txtSearch.getText())) {
                    //content found so adding to table
                    model.addRow(rowVector);
                    break;
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEmployee().setVisible(true);
            }
        });
    }
    private void UpdateComboxes()
{
    
    Connection conn = dbconn.getConnection();
        String SELECTSQL1 = "SELECT HOS_ID FROM HOSPITAL";
        String SELECTSQL2 = "SELECT PC_ID FROM PLASMAC";

        PreparedStatement stmt1,stmt2; 
        try
        {
            stmt1 = conn.prepareStatement(SELECTSQL1);
            stmt2 = conn.prepareStatement(SELECTSQL2);
            resultSet1 = stmt1.executeQuery();
            resultSet2 = stmt2.executeQuery(); 
            
            
            while(resultSet1.next())
            {
                ComboHospital.addItem(resultSet1.getString(1));
            }
            while(resultSet2.next())
            {
                ComboPlasmaCenter.addItem(resultSet2.getString(1));
            }
       
             
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboHospital;
    private javax.swing.JComboBox<String> ComboOrganizationList;
    private javax.swing.JComboBox<String> ComboPlasmaCenter;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btndel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lblEmployeeName;
    private javax.swing.JLabel lblEmployeeName1;
    private javax.swing.JLabel lblEmployeeName2;
    private javax.swing.JLabel lblEmployeeName3;
    private javax.swing.JLabel lblOrganizationPicker;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbank;
    private javax.swing.JLabel lblhos;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
