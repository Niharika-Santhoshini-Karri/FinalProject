/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Hospital;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import UI.Admin.AdminHospital;
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
 * @author Niharika
 */
public class Patient extends javax.swing.JFrame {

    /**
     * Creates new form Patient
     */
    Validations validations;
    ResultSet resultSet, resultSet1, resultSet2 = null;
    DBUTIL dbconn= new DBUTIL();
    Vector originalTableModel;
    public Patient() {
        initComponents();
        UpdateComboxdoc_id();
        populateTable();
        validations = new Validations();
        originalTableModel = (Vector) ((DefaultTableModel) tblPatient.getModel()).getDataVector().clone();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
       String selectSql = "SELECT patient_id,patient_name,age, gender, doc_id,address from patients ";
        

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[6];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getInt(3);
            row[3]=resultSet.getString(4);
            row[4]=resultSet.getInt(5);
            row[5]=resultSet.getString(6);
            
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
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

        btnGender = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpat_id = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        Gender = new javax.swing.JLabel();
        comboxdoc_id = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Gender1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        txtAddress = new javax.swing.JTextField();
        valAddress = new javax.swing.JLabel();
        valGender = new javax.swing.JLabel();
        valAge = new javax.swing.JLabel();
        valName = new javax.swing.JLabel();
        valDoc = new javax.swing.JLabel();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("    ADD PATIENT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(255, 21, 175, 39);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Gender", "Doctor ID", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);
        if (tblPatient.getColumnModel().getColumnCount() > 0) {
            tblPatient.getColumnModel().getColumn(5).setMinWidth(0);
            tblPatient.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblPatient.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 150, 580, 180);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 460, 80, 17);

        jLabel3.setText("Patient ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 430, 56, 17);

        jLabel4.setText("Age ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 490, 26, 17);
        getContentPane().add(txtpat_id);
        txtpat_id.setBounds(230, 420, 100, 23);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(120, 660, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(360, 340, 73, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(480, 340, 72, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(85, 31, 72, 23);

        Gender.setText("Address");
        getContentPane().add(Gender);
        Gender.setBounds(100, 590, 84, 17);

        getContentPane().add(comboxdoc_id);
        comboxdoc_id.setBounds(230, 560, 100, 23);

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 520, 43, 17);

        Gender1.setText("Doctor");
        getContentPane().add(Gender1);
        Gender1.setBounds(100, 550, 38, 17);

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
        txtName.setBounds(230, 460, 100, 23);

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
        txtAge.setBounds(230, 490, 100, 23);

        btnGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMale);
        btnMale.setBounds(220, 530, 51, 21);

        btnGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(btnFemale);
        btnFemale.setBounds(290, 530, 65, 21);

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
        txtAddress.setBounds(230, 590, 100, 23);

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAddress);
        valAddress.setBounds(360, 590, 190, 20);

        valGender.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valGender);
        valGender.setBounds(390, 530, 170, 20);

        valAge.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valAge);
        valAge.setBounds(370, 490, 160, 20);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(370, 460, 180, 20);

        valDoc.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valDoc);
        valDoc.setBounds(390, 560, 170, 20);

        lbSearch.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        lbSearch.setText("SEARCH");
        getContentPane().add(lbSearch);
        lbSearch.setBounds(80, 90, 90, 30);

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
        txtSearch.setBounds(160, 90, 430, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       //int pat_id = Integer.valueOf(txtpat_name.getText());
       var valid = true;
         if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }


        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
        }
       if (comboxdoc_id.getSelectedItem() == null || comboxdoc_id.getSelectedItem().toString().isEmpty()) {
            valDoc.setText("Please Select Doctor");
            valid = false;
        }
       

        
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
        }
        if (valid) {

            String gender = null;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }
            int SelectedRowIndex=tblPatient.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblPatient.getModel();
         int pat_id=(int) model.getValueAt(SelectedRowIndex, 0);
         
         
       txtpat_id.setVisible(false);
       String patient_name = txtName.getText();
       int age = Integer.valueOf(txtAge.getText()); 
       //String gender = (String) comboxgender.getSelectedItem();
       int doc_id = Integer.valueOf((String)comboxdoc_id.getSelectedItem());
       String address = txtAddress.getText();
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
                String UPDATEPATIENTSQL = "update patients set patient_name=?, "
                        + "age=?, gender=?, doc_id=?, address=? where patient_id =?";

        PreparedStatement stmt; 
         
        try
        {
            stmt = conn.prepareStatement(UPDATEPATIENTSQL);
       
             
            stmt.setString(1,patient_name); 
            stmt.setInt(2,age);
            stmt.setString(3,gender);
            stmt.setInt(4,doc_id);
            stmt.setString(5,address); 
            stmt.setInt(6,pat_id);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      JOptionPane.showMessageDialog(this,"Patient data Updated");

//  txtName.setText("");
//  txtpat_id.setText("");
//  txtAge.setText("");
//  txtAddress.setText("");
  populateTable();
  setTextNull();  
    
      setValidationNull();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        var valid = true;
         if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }


        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
        }
       if (comboxdoc_id.getSelectedItem() == null || comboxdoc_id.getSelectedItem().toString().isEmpty()) {
            valDoc.setText("Please Select Doctor");
            valid = false;
        }
       

        
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is Invalid");
            valid = false;
        }

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
        }
        if (valid) {

            String gender = null;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }
        int patinet_id = Integer.valueOf(txtpat_id.getText());
       String patient_name = txtName.getText();
       int age = Integer.valueOf(txtAge.getText()); 
       //String gender = (String) comboxgender.getSelectedItem();
        
       int doc_id = Integer.valueOf((String) comboxdoc_id.getSelectedItem());
       String address = txtAddress.getText();
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        
        //check if the id already exists
                String INSERTHOSSQL = "insert into patients(patient_id,patient_name,"
                        + "age,gender, doc_id, address) values (?,?,?,?,?,?) ";

        PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(INSERTHOSSQL);
       
             
            stmt.setInt(1,patinet_id); 
            stmt.setString(2,patient_name);
            stmt.setInt(3,age);
            stmt.setString(4,gender);
            stmt.setInt(5,doc_id);
            stmt.setString(6,address);
            
            
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(this,"Patient Added");

       populateTable(); 
       setTextNull();  
      setValidationNull();
   
  //stop
  txtName.setText("");
  txtpat_id.setText("");
  txtAge.setText("");
  txtAddress.setText("");
  //populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblPatient.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblPatient.getModel();
         int pat_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
         //int pat_id = Integer.valueOf(txtpat_id.getText());
          String selectSql = "Delete from patients where patient_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, pat_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Patient Deleted");
        populateTable(); 
     
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    this.hide();
        HospitalWorkArea frame = new HospitalWorkArea();
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked
    DefaultTableModel tblModel = (DefaultTableModel) tblPatient.getModel();

        // set data to textfield when raw is selected

        String patient_id = tblModel.getValueAt(tblPatient.getSelectedRow(),0).toString();
        String patient_name = tblModel.getValueAt(tblPatient.getSelectedRow(),1).toString();
        String age = tblModel.getValueAt(tblPatient.getSelectedRow(),2).toString();
        String gender = tblModel.getValueAt(tblPatient.getSelectedRow(),3).toString();
        String doc_id = tblModel.getValueAt(tblPatient.getSelectedRow(),4).toString();
        String address = tblModel.getValueAt(tblPatient.getSelectedRow(),5).toString();
      
        

        txtpat_id.setText(String.valueOf(patient_id));
        txtName.setText(patient_name);
        txtAge.setText(age);
        //comboxgender.
        //comboxdoc_id.
        txtAddress.setText(address);
        
          setValidationNull();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPatientMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
        }
        else {
            valAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnFemaleActionPerformed

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

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPatient.getModel();

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }
    
     private void setTextNull() {
     
   txtName.setText(null);
  txtAddress.setText(null);
  txtAge.setText(null);
  btnGender.clearSelection();
  comboxdoc_id.setSelectedItem(null);
  
    }
    private void setValidationNull() {
        valName.setText(null);
         valAddress.setText(null);
        valAge.setText(null);
        valGender.setText(null);
        valDoc.setText(null);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Gender1;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboxdoc_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtpat_id;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valAge;
    private javax.swing.JLabel valDoc;
    private javax.swing.JLabel valGender;
    private javax.swing.JLabel valName;
    // End of variables declaration//GEN-END:variables

    private void UpdateComboxdoc_id() {
        Connection conn = dbconn.getConnection();
        String SELECTSQL1 = "select doc_id from doctors where hos_id =?";
        //String SELECTSQL2 = "SELECT PC_ID FROM PLASMAC";
        // int hos_id = this.hos_id ; 

        PreparedStatement stmt1,stmt2; 
        try
        {
            stmt1 = conn.prepareStatement(SELECTSQL1);
            
            stmt1.setInt(1,1);// later change it to stmt1.setInt(1,hos_id); 
            
            resultSet1 = stmt1.executeQuery();
            
            
            
            while(resultSet1.next())
            {
                comboxdoc_id.addItem(resultSet1.getString(1));
            }
            
       
             
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
