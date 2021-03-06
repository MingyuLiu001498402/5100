/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliner;

import TravelAgency.Airliner;
import TravelAgency.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class AirlinerLoginJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerLogin
     */
    private JPanel airlinerpanel;
    private AirlinerDirectory aird;
    public AirlinerLoginJpanel(JPanel airlinerpanel,AirlinerDirectory aird) {
        initComponents();
        this.aird = aird;
        this.airlinerpanel = airlinerpanel;
        
        AirlinerComboBox.removeAllItems();
       for(Airliner airliner : aird.getAirlinerDirectory()) {
           AirlinerComboBox.addItem(airliner);
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

        jLabel1 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AirlinerComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel1.setText("Airliner Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, 30));

        SearchBtn.setBackground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("GO>>");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, 30));

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 1, 28)); // NOI18N
        jLabel2.setText("Airliner Login");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 140, -1, -1));

        AirlinerComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AirlinerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlinerComboBoxActionPerformed(evt);
            }
        });
        add(AirlinerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        Airliner airliner = (Airliner)AirlinerComboBox.getSelectedItem();
        ManageAirplaneJpanel mappanel = new ManageAirplaneJpanel(airlinerpanel,airliner);
        airlinerpanel.add(mappanel);
        CardLayout layout = (CardLayout)airlinerpanel.getLayout();
        layout.next(airlinerpanel);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void AirlinerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlinerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlinerComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AirlinerComboBox;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
