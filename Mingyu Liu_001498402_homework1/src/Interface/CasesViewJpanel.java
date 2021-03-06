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
public class CasesViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CasesViewJpanel
     */ 
    public CasesViewJpanel(Person person) {
        initComponents();
        Displaycases(person);
        
    }
    private void Displaycases(Person person){
        String casesnum = person.getCases().getCasesnum();
        CasesNumTxt.setText(casesnum);
        
        String alergy1 = person.getCases().getAlergy1();
        Alergy1Txt.setText(alergy1);
        
        String alergy2 = person.getCases().getAlergy2();
        Alergy2Txt.setText(alergy2);
        
        String alergy3 = person.getCases().getAlergy3();
        Alergy3Txt.setText(alergy3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CasesNumTxt = new javax.swing.JTextField();
        Alergy1Txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Alergy3Txt = new javax.swing.JTextField();
        Alergy2Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "CaseView Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 0, 20), new java.awt.Color(255, 204, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(CasesNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 200, -1));

        Alergy1Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy1TxtActionPerformed(evt);
            }
        });
        add(Alergy1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 200, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Alergy1:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 159, 30));

        Alergy3Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy3TxtActionPerformed(evt);
            }
        });
        add(Alergy3Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, -1));

        Alergy2Txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alergy2TxtActionPerformed(evt);
            }
        });
        add(Alergy2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 200, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Alergy2:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 159, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Cases Num:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 159, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Alergy3:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 159, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("   View Cases");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 210, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void Alergy1TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy1TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy1TxtActionPerformed

    private void Alergy3TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy3TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy3TxtActionPerformed

    private void Alergy2TxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alergy2TxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alergy2TxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alergy1Txt;
    private javax.swing.JTextField Alergy2Txt;
    private javax.swing.JTextField Alergy3Txt;
    private javax.swing.JTextField CasesNumTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
