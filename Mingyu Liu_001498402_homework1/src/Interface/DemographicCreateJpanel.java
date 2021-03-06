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
public class DemographicCreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJpanel
     */
    private Person person;
    public DemographicCreateJpanel(Person person) {
        initComponents();
        this.person = person;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastNameTxt = new javax.swing.JTextField();
        TelNumTxt = new javax.swing.JTextField();
        DOBTxt = new javax.swing.JTextField();
        AgeTxt = new javax.swing.JTextField();
        HeightTxt = new javax.swing.JTextField();
        WeightTxt = new javax.swing.JTextField();
        SSNTxt = new javax.swing.JTextField();
        CreatePersonButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)), "DemographicCreate Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Al Bayan", 0, 20), new java.awt.Color(255, 204, 0))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Create Demographic");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 394, 43));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("First  Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, 38));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("Last   Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 100, 38));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Tel Number:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, 38));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("DOB(dd/mm/yy):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Age:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Height:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 90, 20));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Weight:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 90, 20));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("SSN:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 90, 20));
        add(FirstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 282, -1));

        LastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtActionPerformed(evt);
            }
        });
        add(LastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 282, -1));
        add(TelNumTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 279, -1));
        add(DOBTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 280, -1));
        add(AgeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 279, -1));
        add(HeightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 279, -1));
        add(WeightTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 279, -1));
        add(SSNTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 279, -1));

        CreatePersonButton.setBackground(new java.awt.Color(247, 251, 250));
        CreatePersonButton.setText("Create Demographic!");
        CreatePersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePersonButtonActionPerformed(evt);
            }
        });
        add(CreatePersonButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 279, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTxtActionPerformed

    private void CreatePersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePersonButtonActionPerformed
        // TODO add your handling code here:
        person.getDemographic().setAge(AgeTxt.getText());
        person.getDemographic().setBirthdate(DOBTxt.getText());
        person.getDemographic().setHight(HeightTxt.getText());
        person.getDemographic().setFirstname(FirstNameTxt.getText());
        person.getDemographic().setLastname(LastNameTxt.getText());
        person.getDemographic().setSsn(SSNTxt.getText());
        person.getDemographic().setTelnum(TelNumTxt.getText());
        person.getDemographic().setWeight(WeightTxt.getText());
        
        JOptionPane.showMessageDialog(null,"create Demographic Successfully");
        
        
        
    }//GEN-LAST:event_CreatePersonButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTxt;
    private javax.swing.JButton CreatePersonButton;
    private javax.swing.JTextField DOBTxt;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JTextField HeightTxt;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JTextField SSNTxt;
    private javax.swing.JTextField TelNumTxt;
    private javax.swing.JTextField WeightTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
