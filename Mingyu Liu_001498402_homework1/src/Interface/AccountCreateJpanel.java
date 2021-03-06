/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;
import javax.swing.JOptionPane;
/**
 *
 * @author liumingyu
 */
public class AccountCreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckingCreateJpanel
     */
    private Person person;
    
    public AccountCreateJpanel(Person person) {
        initComponents();
        this.person=person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AccountNum1Txt = new javax.swing.JTextField();
        CreateCheckingButton = new javax.swing.JButton();
        BankName1Txt = new javax.swing.JTextField();
        SwiftCode1Txt = new javax.swing.JTextField();
        AccountBalance1Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AccountBalance2Txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AccountNum2Txt = new javax.swing.JTextField();
        BankName2Txt = new javax.swing.JTextField();
        SwiftCode2Txt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "AccountCreate Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 0, 20), new java.awt.Color(255, 204, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Bank Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 237, 166, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Account Num:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 166, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Create Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, 32));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Account Balance:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 166, 27));

        AccountNum1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNum1TxtActionPerformed(evt);
            }
        });
        add(AccountNum1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 211, -1));

        CreateCheckingButton.setBackground(new java.awt.Color(247, 251, 250));
        CreateCheckingButton.setText("Create   Account!");
        CreateCheckingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCheckingButtonActionPerformed(evt);
            }
        });
        add(CreateCheckingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 210, -1));

        BankName1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankName1TxtActionPerformed(evt);
            }
        });
        add(BankName1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 211, -1));

        SwiftCode1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwiftCode1TxtActionPerformed(evt);
            }
        });
        add(SwiftCode1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 211, -1));
        add(AccountBalance1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 211, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Swift Code:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 166, 30));

        jLabel5.setText("Checking Account:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel8.setText("Saving    Account:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));
        add(AccountBalance2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 211, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Swift Code:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 337, 166, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Bank Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 397, 166, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Account Num:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 367, 166, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Account Balance:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 166, 27));

        AccountNum2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountNum2TxtActionPerformed(evt);
            }
        });
        add(AccountNum2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 211, -1));

        BankName2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BankName2TxtActionPerformed(evt);
            }
        });
        add(BankName2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 211, -1));

        SwiftCode2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwiftCode2TxtActionPerformed(evt);
            }
        });
        add(SwiftCode2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 211, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AccountNum1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNum1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNum1TxtActionPerformed

    private void CreateCheckingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateCheckingButtonActionPerformed
        // TODO add your handling code here:
        person.getAccount().setAccountbalance1(AccountBalance1Txt.getText());
        person.getAccount().setAccountbalance2(AccountBalance2Txt.getText());
        person.getAccount().setAccountnum1(AccountNum1Txt.getText());
        person.getAccount().setAccountnum2(AccountNum2Txt.getText());
        person.getAccount().setBankname1(BankName1Txt.getText());
        person.getAccount().setBankname2(BankName2Txt.getText());
        person.getAccount().setSwiftcode1(SwiftCode1Txt.getText());
        person.getAccount().setSwiftcode2(SwiftCode2Txt.getText());
        
        JOptionPane.showMessageDialog(null,"create Address Successfully");
    }//GEN-LAST:event_CreateCheckingButtonActionPerformed

    private void BankName1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankName1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankName1TxtActionPerformed

    private void SwiftCode1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwiftCode1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SwiftCode1TxtActionPerformed

    private void AccountNum2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountNum2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountNum2TxtActionPerformed

    private void BankName2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BankName2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BankName2TxtActionPerformed

    private void SwiftCode2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwiftCode2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SwiftCode2TxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountBalance1Txt;
    private javax.swing.JTextField AccountBalance2Txt;
    private javax.swing.JTextField AccountNum1Txt;
    private javax.swing.JTextField AccountNum2Txt;
    private javax.swing.JTextField BankName1Txt;
    private javax.swing.JTextField BankName2Txt;
    private javax.swing.JButton CreateCheckingButton;
    private javax.swing.JTextField SwiftCode1Txt;
    private javax.swing.JTextField SwiftCode2Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
