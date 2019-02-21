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
public class CreateAirlinerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirliner
     */
    private AirlinerDirectory aird;
    private JPanel rightpanel;
    
    public CreateAirlinerJpanel(JPanel rightpanel, AirlinerDirectory aird) {
        initComponents();
        this.rightpanel = rightpanel;
        this.aird = aird;
        
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
        Name = new javax.swing.JTextField();
        Tel = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Country = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Backbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText("Create Airliner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 240, 42));

        jLabel2.setText("Airliner Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 115, 28));

        jLabel3.setText("Airliner Tel:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 115, 28));

        jLabel4.setText("Airliner ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 115, 28));

        jLabel5.setText("Airliner Country:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 115, 28));

        jLabel6.setText("Airliner Address:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 115, 28));
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 226, 34));
        add(Tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 226, 34));
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 226, 34));
        add(Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 226, 34));
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 226, 34));

        Backbtn.setBackground(new java.awt.Color(255, 255, 255));
        Backbtn.setText("Back<<");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 114, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 127, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (Name.getText().isEmpty() || Address.getText().isEmpty() || Tel.getText().isEmpty() || ID.getText().isEmpty() || Country.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Can not be empty");
        return;
        }
       Airliner airliner = aird.addAirliner();
       airliner.setName(Name.getText());
       airliner.setAddress(Address.getText());
       airliner.setCountry(Country.getText());
       airliner.setId(ID.getText());
       airliner.setTel(Tel.getText());
       
       JOptionPane.showMessageDialog(null, "Airliner Created Successfully");
       Name.setText("");
       Address.setText("");
       Country.setText("");
       ID.setText("");
       Tel.setText("");
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
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
    }//GEN-LAST:event_BackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Backbtn;
    private javax.swing.JTextField Country;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Tel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}