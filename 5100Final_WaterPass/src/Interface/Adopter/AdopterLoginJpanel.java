/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Adopter;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class AdopterLoginJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdopterLoginJpanel
     */
    private JPanel rightpanel;
    public AdopterLoginJpanel(JPanel rightpanel) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(881, 614));

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel4.setText("     Adopter Login Panel");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 439, 67));

        jLabel2.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel2.setText("UserName：");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, 33));
        jPanel2.add(UserNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 226, 39));

        jLabel3.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel3.setText("      Password：");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, 33));
        jPanel2.add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 226, 39));

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 230, -1));

        RegisterBtn.setBackground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("Click Here to Register a new Adopter！");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 430, -1));

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Adopter/AdopterLogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        InformationJpanel infojpanel = new InformationJpanel(rightpanel);
        rightpanel.add(infojpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        AdopterRegisterJpanel arJpanel = new AdopterRegisterJpanel(rightpanel);
        rightpanel.add(arJpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_RegisterBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField UserNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}