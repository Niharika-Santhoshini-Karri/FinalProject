/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import UI.LoginScreen;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aish
 */
public class AdminHospital extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminHospital
     */
     Vector originalTableModel;
   
    ResultSet resultSet = null;
    DBUTIL dbconn= new DBUTIL();
    
    public AdminHospital() {
        initComponents();
        
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblHospital.getModel()).getDataVector().clone();
    
        

    
    }
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT hos_id,hospital_name,address,zipcode,mobile from hospital";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getString(3);
            row[3]=resultSet.getInt(4);
            row[4]=resultSet.getString(5);  
            
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

        txtid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblSelectOrgType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospital = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtHospital_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txthos_id = new javax.swing.JTextField();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        txtid.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 370, 70, 17);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("HOSPITALS ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(40, 20, 150, 50);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 410, 80, 17);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(350, 410, 74, 23);

        lblSelectOrgType.setText("ID");
        getContentPane().add(lblSelectOrgType);
        lblSelectOrgType.setBounds(250, 320, 12, 17);

        jLabel5.setText("Zip Code");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 440, 100, 40);
        getContentPane().add(txtmobile);
        txtmobile.setBounds(350, 490, 74, 23);

        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Zipcode", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospital.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHospitalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHospital);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 650, 92);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(270, 530, 87, 23);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(250, 240, 100, 23);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(370, 240, 100, 23);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(550, 10, 100, 23);
        getContentPane().add(txtHospital_name);
        txtHospital_name.setBounds(350, 370, 74, 23);

        jLabel6.setText("Mobile");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 480, 100, 40);
        getContentPane().add(txtZipCode);
        txtZipCode.setBounds(350, 450, 74, 23);

        txthos_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthos_idActionPerformed(evt);
            }
        });
        getContentPane().add(txthos_id);
        txthos_id.setBounds(350, 320, 64, 23);

        lbSearch.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        lbSearch.setText("SEARCH");
        getContentPane().add(lbSearch);
        lbSearch.setBounds(90, 70, 90, 30);

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
        txtSearch.setBounds(170, 70, 430, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       int hos_id = Integer.valueOf(txthos_id.getText());
       String hospital_name = txtHospital_name.getText();
       String address = txtAddress.getText();
       Integer zipcode = Integer.valueOf(txtZipCode.getText());
       String mobile = txtmobile.getText();
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
                
        if(txthos_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid hospital id");
           return;
        }
        if(txtHospital_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid hospital Name");
            return;
        }

        if(txtAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter address");
            return;
        }
        if(!txtZipCode.getText().matches("\\d+")){

            JOptionPane.showMessageDialog(this, "enter a valid zipcode");
            return;

        }
            if(!txtmobile.getText().matches("\\d+")){

            JOptionPane.showMessageDialog(this, "enter a valid 10 digit contact number");
            return;

        }
        //check if the id already exists
                String INSERTHOSSQL = "insert into hospital(hos_id,hospital_name,address,zipcode,mobile) values (?,?,?,?,?) ";

        PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(INSERTHOSSQL);
       
             
            stmt.setInt(1,hos_id); 
            stmt.setString(2,hospital_name);
            stmt.setString(3,address);
            stmt.setInt(4,zipcode);
            stmt.setString(5,mobile);
            
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(this,"Hospital Added");

       populateTable(); 
   
  //stop
  txthos_id.setText("");
  txtHospital_name.setText("");
  txtAddress.setText("");
  txtZipCode.setText("");
   txtmobile.setText("");
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int hos_id = Integer.valueOf(txthos_id.getText());
       String hospital_name = txtHospital_name.getText();
       String address = txtAddress.getText();
       Integer zipcode = Integer.valueOf(txtZipCode.getText());
       String mobile = txtmobile.getText();
    
       
            // validate the text from text boxes 
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
                String SELECTHOSSQL = "update hospital set hospital_name=? ,address =?,zipcode=?,mobile=? where hos_id=? ";
                PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(SELECTHOSSQL);
       
             
            stmt.setInt(1,hos_id); 
            stmt.setString(2,hospital_name);
            stmt.setString(3,address);
            stmt.setInt(4,zipcode);
            stmt.setString(5,mobile);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        int SelectedRowIndex=tblHospital.getSelectedRow();
       System.out.println("SelectedRowIndex "+SelectedRowIndex);
                  if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to Update");
            
        return;
        }
        // to display in the text boxes          
        DefaultTableModel tblModel = (DefaultTableModel) tblHospital.getModel();
              
       tblModel.setValueAt(hos_id,tblHospital.getSelectedRow(), 0);
       tblModel.setValueAt(hospital_name,tblHospital.getSelectedRow(), 1);
       tblModel.setValueAt(address,tblHospital.getSelectedRow(), 2);
       tblModel.setValueAt(zipcode,tblHospital.getSelectedRow(), 3);
       tblModel.setValueAt(mobile,tblHospital.getSelectedRow(), 4);
       
       
      JOptionPane.showMessageDialog(this,"Hospital data Updated");

  txthos_id.setText("");
  txtHospital_name.setText("");
  txtAddress.setText("");
  txtZipCode.setText("");
   txtmobile.setText("");
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
                                               
        // TODO add your handling code here:
        Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblHospital.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblHospital.getModel();
         int hos_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from hospital where hos_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, hos_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Hospital Deleted");
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblHospitalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHospitalMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblHospital.getModel();

        // set data to textfield when raw is selected

        String hos_id = tblModel.getValueAt(tblHospital.getSelectedRow(),0).toString();
        String hospital_name = tblModel.getValueAt(tblHospital.getSelectedRow(),1).toString();
        String address = tblModel.getValueAt(tblHospital.getSelectedRow(),2).toString();
        String zipcode = tblModel.getValueAt(tblHospital.getSelectedRow(),3).toString();
        String mobile = tblModel.getValueAt(tblHospital.getSelectedRow(),4).toString();
      
        

        txthos_id.setText(String.valueOf(hos_id));
        txtHospital_name.setText(hospital_name);
        txtAddress.setText(address);
        txtZipCode.setText(String.valueOf(zipcode));
        txtmobile.setText(mobile);
    }//GEN-LAST:event_tblHospitalMouseClicked

    private void txthos_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthos_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthos_idActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblHospital.getModel();

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
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtHospital_name;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txthos_id;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    // End of variables declaration//GEN-END:variables
}
