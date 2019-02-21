/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Person;

/**
 *
 * @author liumingyu
 */
public class AddressViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdressViesJpanel
     */
    //private Person person ;
    public AddressViewJpanel(Person person) {
        initComponents();
        //this.person=person;
        DisplayAddress(person);
    }
    private void DisplayAddress(Person person){
        String line1 = person.getAddress().getStreetLine1();
        Line1Txt.setText(line1);
        
        String line2 = person.getAddress().getStreetLine2();
        Line2Txt.setText(line2);
        
        String city = person.getAddress().getCity();
        Citytxt.setText(city);
        
        String state = person.getAddress().getState();
        StateTxt.setText(state);
        
        String zipcode = person.getAddress().getZipcode();
        ZipCodeTxt.setText(zipcode);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        StateTxt = new javax.swing.JTextField();
        Citytxt = new javax.swing.JTextField();
        Line1Txt = new javax.swing.JTextField();
        Line2Txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ZipCodeTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "AddressView Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 0, 20), new java.awt.Color(255, 204, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 0, 20))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 98, 25));

        StateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateTxtActionPerformed(evt);
            }
        });
        add(StateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 220, 30));

        Citytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitytxtActionPerformed(evt);
            }
        });
        add(Citytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, 30));
        add(Line1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 220, 30));

        Line2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Line2TxtActionPerformed(evt);
            }
        });
        add(Line2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 220, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Zip Code:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 98, -1));

        ZipCodeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipCodeTxtActionPerformed(evt);
            }
        });
        add(ZipCodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 220, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Line 1:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 98, 25));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("State:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 98, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("   View Adress");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 188, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Line 2:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 98, 25));
    }// </editor-fold>//GEN-END:initComponents

    private void StateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StateTxtActionPerformed

    private void CitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitytxtActionPerformed

    private void Line2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Line2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Line2TxtActionPerformed

    private void ZipCodeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ZipCodeTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Citytxt;
    private javax.swing.JTextField Line1Txt;
    private javax.swing.JTextField Line2Txt;
    private javax.swing.JTextField StateTxt;
    private javax.swing.JTextField ZipCodeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}