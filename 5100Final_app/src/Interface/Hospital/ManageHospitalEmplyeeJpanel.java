/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Hospital;

import Entity.Account.Account;
import Entity.Hospital.PetHospital;
import Entity.Hospital.PetHospitalDirectory;
import Entity.System.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class ManageHospitalEmplyeeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalEmplyeeJpanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    private PetHospital petHospital;
    private Account account;
    
    public ManageHospitalEmplyeeJpanel(JPanel rightpanel, EcoSystem ecoSystem, PetHospital petHospital) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        this.petHospital = petHospital;
        SaveBtn.setEnabled(false);
        
        populate();
    }
    
    public void populate()
    {
        int rowCount = HospitalEmplyeeTbl.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)HospitalEmplyeeTbl.getModel();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        for(Account a : this.petHospital.getEmployeeaccountDir().getAccountList())
        {
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getPassword();                      
            dtm.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CreateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalEmplyeeTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RepasswordTxt = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Hospital/Hospital.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, -1));

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 284, 124, -1));

        HospitalEmplyeeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(HospitalEmplyeeTbl);
        if (HospitalEmplyeeTbl.getColumnModel().getColumnCount() > 0) {
            HospitalEmplyeeTbl.getColumnModel().getColumn(0).setResizable(false);
            HospitalEmplyeeTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, 353, 192));

        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel1.setText("UserName：");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 100, 108, 32));
        jPanel2.add(UserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 97, 197, 40));

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel2.setText("Password：");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 158, 100, 33));
        jPanel2.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 155, 197, 40));

        jLabel3.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel3.setText("Re_Password：");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 213, 131, 33));
        jPanel2.add(RepasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 213, 197, 40));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BackBtn.setText("Back <<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel2.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 27, 124, -1));

        jLabel6.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel6.setText("Manage Hospital Employee");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 450, 38));

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 295, 124, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        SaveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel2.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 284, 124, -1));

        EditBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 295, 124, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.rightpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.rightpanel.getLayout();
        cardlayout.previous(rightpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        if(UserNameTxt.getText().isEmpty() || PasswordTxt.getText().isEmpty() || RepasswordTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some input text is empty!");
            UserNameTxt.setText("");
            PasswordTxt.setText("");
            RepasswordTxt.setText("");
            return;
        }
        
        if(!this.ecoSystem.newName(UserNameTxt.getText())){
            JOptionPane.showMessageDialog(null, "User name has existed!");
            return;
        }
        
        if(RepasswordTxt.getText().equalsIgnoreCase(PasswordTxt.getText()))
        {
            account = this.petHospital.getEmployeeaccountDir().createAccount();
            account.setName(UserNameTxt.getText());
            account.setPassword(PasswordTxt.getText());
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Something Wrong, Please Check!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Create Pet Hospital Employee Successfully!");
        
        UserNameTxt.setText("");
        PasswordTxt.setText("");
        RepasswordTxt.setText("");
            
        populate();
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int row = HospitalEmplyeeTbl.getSelectedRow();
        
        if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select any row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Account a = (Account)HospitalEmplyeeTbl.getValueAt(row, 0);
        petHospital.getEmployeeaccountDir().deleteAccount(a);
        populate();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        SaveBtn.setEnabled(false);
        CreateBtn.setEnabled(true);

        if(UserNameTxt.getText().isEmpty() || PasswordTxt.getText().isEmpty() || RepasswordTxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Some input text is empty!");
            UserNameTxt.setText("");
            PasswordTxt.setText("");
            RepasswordTxt.setText("");
            return;
        }
        
//        if(!this.ecoSystem.newName(UserNameTxt.getText())){
//            JOptionPane.showMessageDialog(null, "User name has existed!");
//            return;
//        }

        if(RepasswordTxt.getText().equalsIgnoreCase(PasswordTxt.getText()))
        {
            int selectedRow = HospitalEmplyeeTbl.getSelectedRow();
            if(selectedRow >= 0)
            {
                Account account = (Account)HospitalEmplyeeTbl.getValueAt(selectedRow, 0);
                if(!this.ecoSystem.newName(UserNameTxt.getText()) && !UserNameTxt.getText().equals(account.getName())){
                    JOptionPane.showMessageDialog(null, "User name has existed!");
                    return;
                }
                account.setName(UserNameTxt.getText());
                account.setPassword(PasswordTxt.getText());
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Something Wrong, Please Check!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Update Pet Hospital Employee Successfully!");

        UserNameTxt.setText("");
        PasswordTxt.setText("");
        RepasswordTxt.setText("");
        SaveBtn.setEnabled(false);
        
        populate();
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = HospitalEmplyeeTbl.getSelectedRow();

        if(selectedRow >= 0)
        {
            Account account = (Account)HospitalEmplyeeTbl.getValueAt(selectedRow, 0);
            SaveBtn.setEnabled(true);
            CreateBtn.setEnabled(false);
            UserNameTxt.setText(account.getName());
            PasswordTxt.setText(account.getPassword());
            RepasswordTxt.setText(account.getPassword());
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_EditBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTable HospitalEmplyeeTbl;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField RepasswordTxt;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
