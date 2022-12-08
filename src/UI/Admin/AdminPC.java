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
 * @author Aish
 */
public class AdminPC extends javax.swing.JFrame {

    /**
     * Creates new form AdminPC
     */
    Vector originalTableModel;
    ResultSet resultSet = null;
    DBUTIL dbconn= new DBUTIL();
    public AdminPC() {
        initComponents();
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblPlasma.getModel()).getDataVector().clone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        txtmobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlasma = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblSelectOrgType = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txthos_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpcname = new javax.swing.JTextField();
        lbSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(570, 30, 100, 23);

        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        getContentPane().add(txtmobile);
        txtmobile.setBounds(180, 490, 74, 23);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 370, 70, 17);

        jLabel5.setText("Mobile");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 490, 90, 30);

        tblPlasma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Hospital_ID", "Address", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        tblPlasma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlasmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPlasma);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 140, 680, 130);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(160, 570, 87, 23);

        lblSelectOrgType.setText("ID");
        getContentPane().add(lblSelectOrgType);
        lblSelectOrgType.setBounds(80, 330, 60, 17);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(400, 280, 100, 23);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("PLASMA CENTER");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(190, 30, 220, 29);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(180, 410, 74, 23);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(280, 280, 100, 23);
        getContentPane().add(txthos_id);
        txthos_id.setBounds(180, 450, 74, 23);

        jLabel4.setText("Hospital_ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 450, 110, 17);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(180, 320, 74, 23);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 410, 80, 17);
        getContentPane().add(txtpcname);
        txtpcname.setBounds(180, 370, 74, 23);

        lbSearch.setFont(new java.awt.Font("American Typewriter", 1, 14)); // NOI18N
        lbSearch.setText("SEARCH");
        getContentPane().add(lbSearch);
        lbSearch.setBounds(70, 80, 90, 30);

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
        txtSearch.setBounds(150, 80, 430, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     this.hide();
     AdminWorkArea frame = new AdminWorkArea();
     frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int pc_id = Integer.valueOf(txtid.getText());
       String pc_name = txtid.getText();
       int hos_id = Integer.valueOf(txthos_id.getText());
       String address = txtaddress.getText();
      
       String mobile = txtmobile.getText();
       
        Connection conn = dbconn.getConnection();
        //do validation here.
        if(txtid.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid");
           return;
        }
        if(txthos_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid hospital ID");
            return;
        }

        if(txtaddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter address");
            return;
        }
        if(!txtmobile.getText().matches("\\d+")){

            JOptionPane.showMessageDialog(this, "enter a valid 10 digit contact number");
            return;

        }
        //check if the id already exists and a valid hospital id laready exists
                String INSERTPCSQL = "insert into plasmaC(pc_id,pc_name,hospital_id,address,mobile) values (?,?,?,?,?) ";

        PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(INSERTPCSQL);
       
             
            stmt.setInt(1,pc_id); 
            stmt.setString(2,pc_name);
            stmt.setInt(3,hos_id);
            stmt.setString(4,address);
            stmt.setString(5,mobile);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(this,"New Plasma Center Added");

       populateTable(); 
   
  //stop
        txtid.setText("");
        txtpcname.setText("");
         txtaddress.setText("");
         txthos_id.setText("");
          txtmobile.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblPlasma.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblPlasma.getModel();
         int hos_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from plasmaC where pc_id=?";
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

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int pc_id = Integer.valueOf(txtid.getText());
       String pc_name = txtid.getText();
       int hos_id = Integer.valueOf(txthos_id.getText());
       String address = txtaddress.getText();
      
       String mobile = txtmobile.getText();
       
    
       
            // validate the text from text boxes 
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
                String SELECTHOSSQL = "update plasmaC set pc_name=? ,hospital_id =?,address=?,mobile=? where pc_id=? ";
                PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(SELECTHOSSQL);
       
             
            stmt.setString(1,pc_name); 
            stmt.setInt(2,hos_id);
            stmt.setString(3,address);
            stmt.setString(4,mobile);
            stmt.setInt(5,pc_id);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        int SelectedRowIndex=tblPlasma.getSelectedRow();
       System.out.println("SelectedRowIndex "+SelectedRowIndex);
                  if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to Update");
            
        return;
        }
        // to display in the text boxes          
        DefaultTableModel tblModel = (DefaultTableModel) tblPlasma.getModel();
              
       tblModel.setValueAt(pc_id,tblPlasma.getSelectedRow(), 0);
       tblModel.setValueAt(pc_name,tblPlasma.getSelectedRow(), 1);
       tblModel.setValueAt(hos_id,tblPlasma.getSelectedRow(), 2);
       tblModel.setValueAt(address,tblPlasma.getSelectedRow(), 3);
       tblModel.setValueAt(mobile,tblPlasma.getSelectedRow(), 4);
       
        

  JOptionPane.showMessageDialog(this,"Plasma Center Details updated!!");

       populateTable(); 
   
  //stop
        txtid.setText("");
        txtpcname.setText("");
         txtaddress.setText("");
         txthos_id.setText("");
          txtmobile.setText("");
        
        

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tblPlasmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlasmaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblPlasma.getModel();

        // set data to textfield when raw is selected

        String id = tblModel.getValueAt(tblPlasma.getSelectedRow(),0).toString();
        String pc_name = tblModel.getValueAt(tblPlasma.getSelectedRow(),1).toString();
        String hos_id = tblModel.getValueAt(tblPlasma.getSelectedRow(),2).toString();
        String address = tblModel.getValueAt(tblPlasma.getSelectedRow(),3).toString();
        String mobile = tblModel.getValueAt(tblPlasma.getSelectedRow(),4).toString();
      
        

        txtid.setText(String.valueOf(id));
        txtpcname.setText(pc_name);
        txthos_id.setText(hos_id);
        txtaddress.setText(address);
        txtmobile.setText(mobile);
    }//GEN-LAST:event_tblPlasmaMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPlasma.getModel();

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
            java.util.logging.Logger.getLogger(AdminPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPC().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lblSelectOrgType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPlasma;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txthos_id;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtpcname;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPlasma.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT * from plasmaC";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[5];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getInt(3);
            row[3]=resultSet.getString(4);
            row[4]=resultSet.getString(5);  
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
