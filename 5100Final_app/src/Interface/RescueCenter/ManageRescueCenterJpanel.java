/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.RescueCenter;

import Entity.Center.RescueCenter;
import Entity.Hospital.PetHospitalDirectory;
import Entity.StrayAnimal.StrayAnimal;
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
public class ManageRescueCenterJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRescueCenterJpanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    private RescueCenter res;
    private PetHospitalDirectory petHospitalDirectory;
    
    public ManageRescueCenterJpanel(JPanel rightpanel,EcoSystem ecoSystem, RescueCenter res, PetHospitalDirectory petHospitalDirectory ) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        this.res = res;
        this.petHospitalDirectory = petHospitalDirectory;
  
        populate();
    }
    
    public void populate(){
        int rowCount = RescueCenterTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)RescueCenterTable.getModel();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
        }
        
        for(StrayAnimal s  : res.getStrayanimalDir().getStrayAnimalDirectory()){
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = s;
            row[1] = s.getSpecies();
            row[2] = s.getAddress();
            row[3] = s.getStatus();
            row[4] = s.getTraceStatus();
            
            dtm.addRow(row);
        }
        
        if(res.getRequestDir().getRequestList().size() != 0)
        {
            ManageApplicationBtn.setEnabled(true);
        }
        
        else
        {
            ManageApplicationBtn.setEnabled(false);
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
        RescueCenterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ManageApplicationBtn = new javax.swing.JButton();
        CreateAnimalBtn = new javax.swing.JButton();
        TreatAnimalBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RescueCenterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Species", "Address", "Healthy Status", "Trace Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RescueCenterTable);
        if (RescueCenterTable.getColumnModel().getColumnCount() > 0) {
            RescueCenterTable.getColumnModel().getColumn(0).setResizable(false);
            RescueCenterTable.getColumnModel().getColumn(1).setResizable(false);
            RescueCenterTable.getColumnModel().getColumn(2).setResizable(false);
            RescueCenterTable.getColumnModel().getColumn(3).setResizable(false);
            RescueCenterTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 830, 282));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Rescue Center Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 55));

        ManageApplicationBtn.setBackground(new java.awt.Color(255, 255, 255));
        ManageApplicationBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        ManageApplicationBtn.setText("Manage Adopter Application");
        ManageApplicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageApplicationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ManageApplicationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 240, -1));

        CreateAnimalBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateAnimalBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        CreateAnimalBtn.setText("Create Animal");
        CreateAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAnimalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(CreateAnimalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 148, -1));

        TreatAnimalBtn.setBackground(new java.awt.Color(255, 255, 255));
        TreatAnimalBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        TreatAnimalBtn.setText("Treat Animal");
        TreatAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatAnimalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TreatAnimalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 147, -1));

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete Animal");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 430));

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/RescueCenter/Label.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 120));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 850, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAnimalBtnActionPerformed
        // TODO add your handling code here:
        CreateAnimalJpanel caJpanel = new CreateAnimalJpanel(rightpanel,res);
        rightpanel.add(caJpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_CreateAnimalBtnActionPerformed

    private void ManageApplicationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageApplicationBtnActionPerformed
        // TODO add your handling code here:
        ManageApplicationJpanel mapanel = new ManageApplicationJpanel(rightpanel, ecoSystem, this.res);
        rightpanel.add(mapanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_ManageApplicationBtnActionPerformed

    private void TreatAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatAnimalBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = RescueCenterTable.getSelectedRow();
        
        if(selectedRow >= 0)
        {
            StrayAnimal s = (StrayAnimal)RescueCenterTable.getValueAt(selectedRow, 0);
            if(s.getStatus().equals("Healthy")){
                JOptionPane.showMessageDialog(null, "Healthy status, no need to cure!");
                return;
            }else{
                HospitalSelectJpanel hsjp = new HospitalSelectJpanel(rightpanel, petHospitalDirectory, s, ecoSystem);
                this.rightpanel.add(hsjp);
                CardLayout layout = (CardLayout)this.rightpanel.getLayout();
                layout.next(rightpanel);
            }
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_TreatAnimalBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = RescueCenterTable.getSelectedRow();
        
        if(selectedRow1 >= 0)
        {
            
            StrayAnimal sah1 = (StrayAnimal)RescueCenterTable.getValueAt(selectedRow1, 0);
                       
            this.res.getStrayanimalDir().deleteStrayAnimal(sah1);
            
            populate();
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAnimalBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ManageApplicationBtn;
    private javax.swing.JTable RescueCenterTable;
    private javax.swing.JButton TreatAnimalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
