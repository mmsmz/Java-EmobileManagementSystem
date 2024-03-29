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
public class CasCustomerUI extends javax.swing.JFrame {
     Connection conn=null; 
     ResultSet rs =null; 
     PreparedStatement pst=null; 
    /**
     * Creates new form CustomerUI
     */
    public CasCustomerUI() {
        initComponents();
        distable();
        

    }
    //viewing the content
    private void distable() { 
    
        try { 
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd";
        Connection conn= DriverManager.getConnection(url);
        
        String sql ="select * from Customer"; 
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

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCustomerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldContactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldInvoiceNo = new javax.swing.JTextField();
        jTextFieldHomeAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setText("Customer Name");

        jLabel3.setText("NIC");

        jTextFieldNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNICActionPerformed(evt);
            }
        });

        jLabel4.setText("Email Address");

        jLabel5.setText("Contact No");

        jTextFieldContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContactNoActionPerformed(evt);
            }
        });

        jLabel6.setText("Home Address");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Add New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Invoice No");

        jTextFieldInvoiceNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInvoiceNoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Customer Name", "Home Address", "NIC", "Email Address", "Contact No", "Invoice No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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

        jLabel8.setText("Id");

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Emobile\\back.png")); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldContactNo)
                                            .addComponent(jTextFieldEmailAddress)
                                            .addComponent(jTextFieldNIC)
                                            .addComponent(jTextFieldHomeAddress)
                                            .addComponent(jTextFieldInvoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(jTextFieldCustomerName)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5))
                            .addComponent(jTextFieldContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton3))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        if (jTextFieldId.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Enter the ID number", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        
        if (jTextFieldCustomerName.getText() .isEmpty())
        {
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Customer Name", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldHomeAddress.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Home Address", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
          
        else if(jTextFieldNIC.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the NIC", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldEmailAddress.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Email Address", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
          else if(jTextFieldContactNo.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Contact No", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
        else if(jTextFieldInvoiceNo.getText() .isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "Enter the Invoice No", "Dialog", JOptionPane.ERROR_MESSAGE);
        }
            
       else{
        Customer obj=new Customer();
        obj.setId(Integer.parseInt(jTextFieldId.getText()));
        obj.setCustomerName(jTextFieldCustomerName.getText());
        obj.setHomeAddress(jTextFieldHomeAddress.getText());
        obj.setNIC(jTextFieldNIC.getText());
        obj.setEmailAddress(jTextFieldEmailAddress.getText());
        obj.setContactNo(Integer.parseInt(jTextFieldContactNo.getText()));
        obj.setInvoiceNo(jTextFieldInvoiceNo.getText());
        JOptionPane.showMessageDialog(new JFrame(), "Successfully Inserted", "Dialog", JOptionPane.ERROR_MESSAGE);
         try{
            obj.addCustomer(obj);
           } catch (Exception ex) {
           System.out.println(" "+ex.toString());
           }
        distable(); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNICActionPerformed

    private void jTextFieldContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContactNoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jTextFieldId.setText("");
        jTextFieldCustomerName.setText("");
        jTextFieldHomeAddress.setText("");
        jTextFieldNIC.setText("");
        jTextFieldEmailAddress.setText("");
        jTextFieldContactNo.setText("");
        jTextFieldInvoiceNo.setText("");
        JOptionPane.showMessageDialog(new JFrame(), "Add New Data", "Dialog", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldInvoiceNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInvoiceNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInvoiceNoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        jTextFieldId.setText(model.getValueAt(selectedRowIndex, 0 ).toString());
        jTextFieldCustomerName.setText(model.getValueAt(selectedRowIndex, 1 ).toString());
        jTextFieldHomeAddress.setText(model.getValueAt(selectedRowIndex, 2 ).toString());
        jTextFieldNIC.setText(model.getValueAt(selectedRowIndex, 3 ).toString());
        jTextFieldEmailAddress.setText(model.getValueAt(selectedRowIndex, 4 ).toString());
        jTextFieldContactNo.setText(model.getValueAt(selectedRowIndex, 5 ).toString());
        jTextFieldInvoiceNo.setText(model.getValueAt(selectedRowIndex, 6 ).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://localhost:1433;databaseName=77OOP062;user=sa;password=hnd";
        Connection conn= DriverManager.getConnection(url);

        String value1=jTextFieldId.getText();
        String value2=jTextFieldCustomerName.getText();
        String value3=jTextFieldHomeAddress.getText();
        String value4=jTextFieldNIC.getText();
        String value5=jTextFieldEmailAddress.getText();
        String value6=jTextFieldContactNo.getText();
        String value7=jTextFieldInvoiceNo.getText();

        String sql= "UPDATE Customer SET Id='"+value1+"',CustomerName='"+value2+"',HomeAddress='"+value3+"',NIC='"+value4+"',EmailAddress='"+value5+"',ContactNo='"+value6+"',InvoiceNo='"+value7+"' where Id='"+value1+"'";
        pst=conn.prepareStatement(sql);
        pst.execute();
              
        JOptionPane.showMessageDialog(null, "Updated");
 
        }catch(Exception e){;
        JOptionPane.showMessageDialog(null, e);
        }
        distable();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        CashierUI frm = new CashierUI();
        frm.setVisible(true);

        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(CasCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasCustomerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasCustomerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldContactNo;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldEmailAddress;
    private javax.swing.JTextField jTextFieldHomeAddress;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldInvoiceNo;
    private javax.swing.JTextField jTextFieldNIC;
    // End of variables declaration//GEN-END:variables
    
}
