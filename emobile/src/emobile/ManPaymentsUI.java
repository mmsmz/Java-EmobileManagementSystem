/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hnd
 */
public class ManPaymentsUI extends javax.swing.JFrame {
     Connection conn=null; 
     ResultSet rs =null; 
     PreparedStatement pst=null; 
    
    
    /**
     * Creates new form PaymentsUI
     */
    public ManPaymentsUI() {
        initComponents();
        distable();
        
    }
    
     private void distable() { 
    
        try { 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd";
        Connection conn= DriverManager.getConnection(url);
        
        String sql ="select * from Payments"; 
        pst=conn.prepareStatement(sql); 
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
        } 
        
        catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e); 
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldInvoiceNo = new javax.swing.JTextField();
        jTextFielditemCode = new javax.swing.JTextField();
        jTextFieldItemName = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jTextFieldUnitPrice = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Invoice No");

        jLabel2.setText("Item Code");

        jLabel4.setText("Quantity");

        jLabel5.setText("Unit Price");

        jLabel6.setText("Total");

        jTextFieldItemName.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldItemName.setText("    Select Menu List");
        jTextFieldItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemNameActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Sales Details");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "eMobile X1", "eMobile X2", "eMobile X3", "eMobile E1", "eMobile E2" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Item Code", "Item Name", "Quantity ", "Unit Price", "Total"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emobile/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldUnitPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldItemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jTextFielditemCode, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldInvoiceNo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(19, 19, 19)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFielditemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton1)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        String s = ((String) jComboBox2.getSelectedItem());
        JOptionPane.showMessageDialog(this, "You have Selected "+s);
       
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextFieldItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldItemNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Select row when mouse click
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        jTextFieldInvoiceNo.setText(model.getValueAt(selectedRowIndex, 0 ).toString());
        jTextFielditemCode.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
        jTextFieldItemName.setText(model.getValueAt(selectedRowIndex, 2 ).toString());
        jTextFieldQuantity.setText(model.getValueAt(selectedRowIndex, 3 ).toString());
        jTextFieldUnitPrice.setText(model.getValueAt(selectedRowIndex, 4 ).toString());
        jTextFieldTotal.setText(model.getValueAt(selectedRowIndex, 5 ).toString());

        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
          try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd";
        Connection conn= DriverManager.getConnection(url);

        String value1=jTextFieldInvoiceNo.getText();
        String value2=jTextFielditemCode.getText();
        String value3=jTextFieldItemName.getText();
        String value4=jTextFieldQuantity.getText();
        String value5=jTextFieldUnitPrice.getText();
        String value6=jTextFieldTotal.getText();

        String sql= "UPDATE Payments SET InvoiceNo='"+value1+"', ItemCode='"+value2+"',ItemName='"+value3+"',Quantity='"+value4+"',UnitPrice='"+value5+"',Total='"+value6+"' where InvoiceNo='"+value1+"'";
        pst=conn.prepareStatement(sql);
        pst.execute();
        if (jTextFieldInvoiceNo.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Invoice No", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFielditemCode.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Item Code", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldItemName.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Item Enter", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldQuantity.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Quantity", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldUnitPrice.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Unit Price", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldTotal.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Total", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
       
     
        else {
        
        JOptionPane.showMessageDialog(null, "Updated Successfully");
        
        
        }
        
        }catch(Exception e){;
        JOptionPane.showMessageDialog(null, e);
        }
        distable();
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd";
        Connection conn= DriverManager.getConnection(url);
        String sql="delete from Payments where InvoiceNo=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1, jTextFieldInvoiceNo.getText());
        pst.executeUpdate();// 
        JOptionPane.showMessageDialog(null, "Successfully Deleted");


        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }

        distable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        ManageUI frm = new ManageUI();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManPaymentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManPaymentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManPaymentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManPaymentsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManPaymentsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldInvoiceNo;
    private javax.swing.JTextField jTextFieldItemName;
    private javax.swing.JTextField jTextFieldQuantity;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldUnitPrice;
    private javax.swing.JTextField jTextFielditemCode;
    // End of variables declaration//GEN-END:variables
}