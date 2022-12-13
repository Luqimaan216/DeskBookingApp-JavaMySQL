/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskbookingapp;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luqim
 */


public class ManageSpacesForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageSpacesForm
     */
    
    SPACES space = new SPACES();
    
    
    public ManageSpacesForm() {
        initComponents();
        
        //display space types id in combobox
        space.fillSpaces_Type_JComboboxSpaceType(jComboBoxType);
        
        //show all spaces in the jtable
        space.fillSpacesJTable(jTable1);
        
        
        //set a height to the jtable
        jTable1.setRowHeight(40);
        
        
        //create a button group for the radiobuttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonYES);
        bg.add(jRadioButtonNO);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSpaceNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCapacity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEditSpace = new javax.swing.JButton();
        jButtonAddSpace = new javax.swing.JButton();
        jButtonRemoveSpace = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButtonRefreshTable = new javax.swing.JButton();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonShowSpaceType = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonNO = new javax.swing.JRadioButton();
        jRadioButtonYES = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1144, 581));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Manage Spaces");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(481, 481, 481)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        jLabel2.setText("Space Number");

        jLabel3.setText("Type");

        jLabel4.setText("Capacity");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Space Number", "Type", "Capacity", "Reserved"
            }
        )
        //makw the jtable cells not editable
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jButtonEditSpace.setText("Edit");
    jButtonEditSpace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonEditSpace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonEditSpace.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditSpaceActionPerformed(evt);
        }
    });

    jButtonAddSpace.setText("Add Space");
    jButtonAddSpace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonAddSpace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonAddSpace.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddSpaceActionPerformed(evt);
        }
    });

    jButtonRemoveSpace.setText("Remove");
    jButtonRemoveSpace.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButtonRemoveSpace.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonRemoveSpace.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveSpaceActionPerformed(evt);
        }
    });

    jButtonClearFields.setText("Clear Fields");
    jButtonClearFields.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonClearFieldsActionPerformed(evt);
        }
    });

    jButtonRefreshTable.setText("Refresh");
    jButtonRefreshTable.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRefreshTableActionPerformed(evt);
        }
    });

    jButtonShowSpaceType.setText("Show Types");
    jButtonShowSpaceType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonShowSpaceTypeActionPerformed(evt);
        }
    });

    jLabel5.setText("Reserved");

    jRadioButtonNO.setText("NO");

    jRadioButtonYES.setText("YES");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jRadioButtonYES, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(jRadioButtonNO)
            .addGap(73, 73, 73))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(10, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jRadioButtonNO)
                .addComponent(jRadioButtonYES))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(272, Short.MAX_VALUE)
                    .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jButtonAddSpace)
                    .addGap(101, 101, 101)
                    .addComponent(jButtonEditSpace)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemoveSpace)
                    .addGap(117, 117, 117))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldSpaceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonShowSpaceType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButtonRefreshTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
            .addGap(38, 38, 38))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonRefreshTable))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldSpaceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonShowSpaceType))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEditSpace)
                        .addComponent(jButtonAddSpace)
                        .addComponent(jButtonRemoveSpace))
                    .addGap(53, 53, 53)
                    .addComponent(jButtonClearFields)))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         //display the selected row data in the jtextfeidls
        
        //get the jtable model
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        //get the selected row index
        int rIndex = jTable1.getSelectedRow();
        
        //display data
        jTextFieldSpaceNumber.setText(model.getValueAt(rIndex, 0).toString());
        jComboBoxType.setSelectedItem(model.getValueAt(rIndex, 1));
        jTextFieldCapacity.setText(model.getValueAt(rIndex, 2).toString());
        
        String isReserved = model.getValueAt(rIndex, 3).toString();
        
        if(isReserved.equals("Yes"))
        {
            jRadioButtonYES.setSelected(true);
        }
        else if(isReserved.equals("No"))
        {
            jRadioButtonNO.setSelected(true);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonEditSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditSpaceActionPerformed
       //edit the selected space
        
        //get data from fields
        int spaceNumber = 0;
        int type = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
        String isReserved = "No";
        
        if(jRadioButtonYES.isSelected())
        {
            isReserved = "Yes";
        }
        
        try{//this try is here to check that the capacity is an integer
            int capacity = Integer.valueOf(jTextFieldCapacity.getText());
        if(capacity <= 0)
        {
            JOptionPane.showMessageDialog(rootPane, "Enter The Space Capacity", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        }else
        {
            try{
            spaceNumber = Integer.valueOf(jTextFieldSpaceNumber.getText());
                if(space.editSpace(spaceNumber, type, capacity, isReserved))
                {
                    JOptionPane.showMessageDialog(rootPane, "Space Data Updated Successfully", "Edit Space", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(rootPane, "Space Data Not Updated", "Edit Space Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
              JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Space Number", "Space Number Error",JOptionPane.ERROR_MESSAGE);
            }
        }
            
        }catch(NumberFormatException exNum)
        {
            JOptionPane.showMessageDialog(rootPane, exNum.getMessage() + " - Enter The Capacity Number", "Capacity Number Error",JOptionPane.ERROR_MESSAGE);
        }
        

    }//GEN-LAST:event_jButtonEditSpaceActionPerformed

    private void jButtonAddSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSpaceActionPerformed
        
        try{
            int spaceNumber = Integer.valueOf(jTextFieldSpaceNumber.getText());
            int spaceType = Integer.valueOf(jComboBoxType.getSelectedItem().toString());
            int capacity = Integer.parseInt(jTextFieldCapacity.getText());
            
            if(space.addSpace(spaceNumber, spaceType, capacity))
            {
                JOptionPane.showMessageDialog(rootPane, "New Space Added Successfully", "Add Space", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Space NOT Added", "Add Space Error", JOptionPane.ERROR_MESSAGE);

            }
            
            
        }catch(NumberFormatException ex)
            {
              JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Space Number", "Space Number Error",JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_jButtonAddSpaceActionPerformed

    private void jButtonRemoveSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveSpaceActionPerformed
       
         //delete the selected space form database
        try{
            int spaceNumber = Integer.valueOf(jTextFieldSpaceNumber.getText());
                if(space.removeSpace(spaceNumber))
                {
                    JOptionPane.showMessageDialog(rootPane, "Space Deleted Successfully", "Delete Space", JOptionPane.INFORMATION_MESSAGE);

                }else{
                    JOptionPane.showMessageDialog(rootPane, "Space Data Not Deleted", "Delete Space Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException ex)
            {
              JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Space Number", "Space Number Error",JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_jButtonRemoveSpaceActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        // remove text from all jtextfields
        jTextFieldSpaceNumber.setText("");
        jTextFieldCapacity.setText("");
        jComboBoxType.setSelectedIndex(0);
        jRadioButtonNO.setSelected(true);

    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshTableActionPerformed
        //to refresh the table

        //clear the table first
        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Space Number", "Type", "Capacity", "Reserved"}));

        //populate the table
        space.fillSpacesJTable(jTable1);
    }//GEN-LAST:event_jButtonRefreshTableActionPerformed

    private void jButtonShowSpaceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowSpaceTypeActionPerformed
        // TODO add your handling code here:
        ALL_SPACES_TYPE_FORM spaceTypesForm = new ALL_SPACES_TYPE_FORM();
        spaceTypesForm.setVisible(true);
        spaceTypesForm.pack();
        spaceTypesForm.setLocationRelativeTo(null);
        spaceTypesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButtonShowSpaceTypeActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSpacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSpacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSpacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSpacesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSpacesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddSpace;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEditSpace;
    private javax.swing.JButton jButtonRefreshTable;
    private javax.swing.JButton jButtonRemoveSpace;
    private javax.swing.JButton jButtonShowSpaceType;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonNO;
    private javax.swing.JRadioButton jRadioButtonYES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCapacity;
    private javax.swing.JTextField jTextFieldSpaceNumber;
    // End of variables declaration//GEN-END:variables
}
