/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import TravelAgency.Airliner;
import TravelAgency.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author liumingyu
 */
public class ManageAirliner extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerManageJpanel
     */
    private JPanel rightpanel;
    private AirlinerDirectory aird;
    public ManageAirliner(JPanel rightpanel, AirlinerDirectory aird) {
        initComponents();
        this.aird=aird;
        this.rightpanel=rightpanel;
        populate();
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblAirlinerDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : aird.getAirlinerDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAddress();
            row[2]=a.getCountry();
            
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

        ViewBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirlinerDirectory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CreateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View Airliner ");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 346, 136, -1));

        tblAirlinerDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Address", "Country"
            }
        ));
        jScrollPane1.setViewportView(tblAirlinerDirectory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 83, 554, 194));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText("Manage Airliners");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        CreateBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("New Airliner");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });
        add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 346, 136, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, 110, -1));

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete Airliner ");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 346, 136, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirlinerDirectory.getSelectedRow();

        if(selectedRow >= 0){
            Airliner airliner = (Airliner)tblAirlinerDirectory.getValueAt(selectedRow, 0);
            ViewAirlinerJpanel viewPanel = new ViewAirlinerJpanel(rightpanel,airliner,aird);
            this.rightpanel.add(viewPanel);
            CardLayout layout = (CardLayout)this.rightpanel.getLayout();
            layout.next(rightpanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_ViewBtnActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        CreateAirlinerJpanel createPanel = new CreateAirlinerJpanel (rightpanel,aird);
        
        this.rightpanel.add(createPanel);

        CardLayout layout = (CardLayout)this.rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirlinerDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)tblAirlinerDirectory.getValueAt(selectedRow, 0);
                aird.deleteAirliner(airliner);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.rightpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.rightpanel.getLayout();
        Component[] comps = this.rightpanel.getComponents();
        
        for(Component comp : comps){
            if(comp instanceof ManageAirliner){
                ManageAirliner maPanel = (ManageAirliner)comp;
                maPanel.populate();
            }
        }
        
        cardlayout.previous(rightpanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAirlinerDirectory;
    // End of variables declaration//GEN-END:variables
}
