/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.RescueCenter;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class ModifiedCenterEmplyeeJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifiedEmplyeeJpanel
     */
    private JPanel rightpanel;
    public ModifiedCenterEmplyeeJpanel(JPanel rightpanel) {
        initComponents();
        this.rightpanel = rightpanel;
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
        UserNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordTxt1 = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(249, 246, 246));
        setPreferredSize(new java.awt.Dimension(881, 614));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("UserName：");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 154, 108, 32));
        add(UserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 150, 197, 40));

        jLabel2.setText("Password：");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 212, 100, 33));
        add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 208, 197, 40));

        jLabel3.setText("Re_Password：");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 264, 119, 33));
        add(PasswordTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 260, 197, 40));

        UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 324, 112, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("Save");
        add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 324, 110, -1));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back<<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.rightpanel.remove(this);
        CardLayout cardlayout =  (CardLayout)this.rightpanel.getLayout();
        cardlayout.previous(rightpanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JTextField PasswordTxt1;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
