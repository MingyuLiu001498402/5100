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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class ViewAirlinerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirliner
     */
    private JPanel viewairpanel;
    private AirlinerDirectory airdir;
    private Airliner airliner;
    public ViewAirlinerJpanel(JPanel viewairpanel,Airliner airliner,AirlinerDirectory airdir) {
        initComponents();
        this.airdir=airdir;
        this.airliner=airliner;
        this.viewairpanel=viewairpanel;
        Name.setText(airliner.getName());
        Address.setText(airliner.getAddress());
        Country.setText(airliner.getCountry());
        ID.setText(airliner.getId());
        Tel.setText(airliner.getTel());
        
        Name.setEnabled(false);
        Address.setEnabled(false);
        Country.setEnabled(false);
        ID.setEnabled(false);
        Tel.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        Country = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Tel = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Backbtn.setBackground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("Back<<");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 401, 114, -1));

        jLabel3.setText("Airliner Tel:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 144, 115, 28));

        jLabel4.setText("Airliner ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 196, 115, 28));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText(" View Airliner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, 42));

        jLabel2.setText("Airliner Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 92, 115, 28));
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 89, 226, 34));

        jLabel5.setText("Airliner Country:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 248, 115, 28));

        jLabel6.setText("Airliner Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 300, 115, 28));
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 297, 226, 34));
        add(Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 245, 226, 34));
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 193, 226, 34));
        add(Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 141, 226, 34));

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 357, 115, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 357, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        this.viewairpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.viewairpanel.getLayout();
        Component[] comps = this.viewairpanel.getComponents();

        for(Component comp : comps){
            if(comp instanceof ManageAirliner){
                ManageAirliner maPanel = (ManageAirliner)comp;
                maPanel.populate();
            }
        }

        cardlayout.previous(viewairpanel);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        Name.setEnabled(true);
        Address.setEnabled(true);
        Country.setEnabled(true);
        ID.setEnabled(true);
        Tel.setEnabled(true);
         Name.setEditable(true);
        Address.setEditable(true);
        Country.setEditable(true);
        ID.setEditable(true);
        Tel.setEditable(true);
        UpdateBtn.setEnabled(false);
        SaveBtn.setEnabled(true);
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        airliner.setAddress(Address.getText());
        airliner.setCountry(Country.getText());
        airliner.setId(ID.getText());
        airliner.setName(Name.getText());
        airliner.setTel(Tel.getText());
        Name.setEnabled(false);
        Address.setEnabled(false);
        Country.setEnabled(false);
        ID.setEnabled(false);
        Tel.setEnabled(false);
        UpdateBtn.setEnabled(true);
        SaveBtn.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Account updated successfully"); 
        
    }//GEN-LAST:event_SaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Backbtn;
    private javax.swing.JTextField Country;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField Tel;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}