/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Hospital;

import DBUTIL.DBUTIL;
import UI.LoginScreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Niharika
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form RequestToPlasmacenter
     */
    
    
    ResultSet resultSet = null;
    DBUTIL dbconn= new DBUTIL();
    
    public Doctor() {
        initComponents();
        
        populateTable();
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT doc_id, doc_name, spec, pager_id from doctors";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[4];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getString(3);
            row[3]= resultSet.getInt(4);
        
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdoc_name = new javax.swing.JTextField();
        txtdoc_id = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtpager_id = new javax.swing.JTextField();
        specCombox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor ID", "Name", "Specialization", "Pager ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoctorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoctor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(51, 95, 723, 132);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ADD DOCTOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(282, 14, 153, 55);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(259, 447, 72, 23);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(487, 245, 73, 23);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(584, 245, 72, 23);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(173, 298, 67, 16);

        jLabel3.setText("Doctor ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(173, 336, 50, 16);

        jLabel4.setText("Specialization");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(173, 383, 72, 16);

        txtdoc_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoc_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txtdoc_name);
        txtdoc_name.setBounds(337, 295, 131, 22);

        txtdoc_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoc_idActionPerformed(evt);
            }
        });
        getContentPane().add(txtdoc_id);
        txtdoc_id.setBounds(337, 336, 131, 22);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(74, 46, 72, 23);

        jLabel5.setText("Pager ID ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(173, 421, 47, 16);
        getContentPane().add(txtpager_id);
        txtpager_id.setBounds(337, 418, 131, 22);

        specCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiologist", "General Surgeon", "Orthopedician" }));
        specCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specComboxActionPerformed(evt);
            }
        });
        getContentPane().add(specCombox);
        specCombox.setBounds(337, 377, 121, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       int SelectedRowIndex=tblDoctor.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblDoctor.getModel();
         int doc_id=(int) model.getValueAt(SelectedRowIndex, 0);
        String doc_name = txtdoc_name.getText();
       //int doc_id = Integer.valueOf(txtdoc_id.getText());
       //String contact_doc = jTextField3.getText();
       String spec = (String) specCombox.getSelectedItem(); 
       int pager_id = Integer.valueOf(txtpager_id.getText()); 
       // int hos_id = this.hos_id ;       
            // validate the text from text boxes 
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
  String SELECTHOSSQL = "update doctors set doc_name=?, spec=?, pager_id=?  where doc_id =?";
                PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(SELECTHOSSQL);
       
             
            stmt.setString(1,doc_name); 
            //stmt.setInt(2,1);//put hos_id later.
            stmt.setString(2,spec);
            //stmt.setString(4, spec);
            stmt.setInt(3,pager_id);
            stmt.setInt(4,doc_id);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to Update");
            
        return;
        }
        // to display in the text boxes          
        DefaultTableModel tblModel = (DefaultTableModel) tblDoctor.getModel();
              
       tblModel.setValueAt(doc_id,tblDoctor.getSelectedRow(), 0);
       tblModel.setValueAt(doc_name,tblDoctor.getSelectedRow(), 1);
       tblModel.setValueAt(spec,tblDoctor.getSelectedRow(), 2);
       tblModel.setValueAt(pager_id,tblDoctor.getSelectedRow(), 3);
       
       
      JOptionPane.showMessageDialog(this,"Doctor data Updated");

  txtdoc_name.setText("");
  txtdoc_id.setText("");
  txtpager_id.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
       String doc_name = txtdoc_name.getText();
       int doc_id = Integer.valueOf(txtdoc_id.getText());
       String spec = (String) specCombox.getSelectedItem(); 
       int pager_id = Integer.valueOf(txtpager_id.getText());
       
       
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        if(txtdoc_name.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter doctor name");
           return;
        }
        if(txtdoc_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter valid doctor id");
            return;
        }

        if(txtpager_id.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please enter pager id");
            return;
        }
        //check if the id already exists
        String INSERTDOCSQL = "insert into doctors(doc_id, hos_id, doc_name, spec, pager_id) values (?,?,?,?,?)";
        // or handle exceptions here. 
        PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(INSERTDOCSQL);
       
             
            stmt.setInt(1,doc_id); 
            stmt.setInt(2,1);//put hos_id later.
            stmt.setString(3,doc_name);
            stmt.setString(4, spec);
            stmt.setInt(5,pager_id);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
        }

           JOptionPane.showMessageDialog(this,"Doctor Added");

       populateTable(); 
   
  //stop
  
  txtdoc_name.setText("");
  txtdoc_id.setText("");
  txtpager_id.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        HospitalWorkArea frame = new HospitalWorkArea();
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtdoc_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoc_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoc_idActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblDoctor.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblDoctor.getModel();
        
          int doc_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
         //int doc_id = Integer.valueOf(txtdoc_id.getText());
          String selectSql = "Delete from doctors where doc_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, doc_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Doctor Deleted");
        populateTable();
        txtdoc_name.setText("");
        txtdoc_id.setText("");
        txtpager_id.setText("");
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoctorMouseClicked
    DefaultTableModel tblModel = (DefaultTableModel) tblDoctor.getModel();
    
    String doc_id = tblModel.getValueAt(tblDoctor.getSelectedRow(),0).toString();
    String doc_name = tblModel.getValueAt(tblDoctor.getSelectedRow(),1).toString();
    String spec = tblModel.getValueAt(tblDoctor.getSelectedRow(),2).toString();
    String pager_id = tblModel.getValueAt(tblDoctor.getSelectedRow(),3).toString();
    
    txtdoc_name.setText(doc_name);
    txtdoc_id.setText(doc_id);
    txtpager_id.setText(pager_id); 

        
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDoctorMouseClicked

    private void txtdoc_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoc_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoc_nameActionPerformed

    private void specComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specComboxActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> specCombox;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtdoc_id;
    private javax.swing.JTextField txtdoc_name;
    private javax.swing.JTextField txtpager_id;
    // End of variables declaration//GEN-END:variables
}
