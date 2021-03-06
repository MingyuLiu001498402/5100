/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import TravelAgency.*;
import UserInterface.Airliner.AirlinerLoginJpanel;
import UserInterface.Customer.CustomerLoginJpanel;
import UserInterface.Customer.ManageCustomerJpanel;
import UserInterface.TravelAgency.ManageAirliner;
import UserInterface.TravelAgency.ManageTravelAgency;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author liumingyu
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private AirlinerDirectory aird;
    private FlightDirectory fltDir;
    private Airliner airliner;
    private Flight flight;
    private CustomerDirectory csdir;
    private Customer customer;
    
    public MainJFrame() {
        initComponents();
        aird =  new AirlinerDirectory();
        csdir = new CustomerDirectory();
        //customer = csdir.addCustomer();
        //customer = new Customer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftpanel = new javax.swing.JPanel();
        TravelAgencyBtn = new javax.swing.JButton();
        CustomerBtn = new javax.swing.JButton();
        AirlinerBtn = new javax.swing.JButton();
        rightpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 153), 2, true));
        jSplitPane1.setForeground(new java.awt.Color(255, 255, 255));

        leftpanel.setBackground(new java.awt.Color(255, 204, 204));
        leftpanel.setPreferredSize(new java.awt.Dimension(200, 604));

        TravelAgencyBtn.setBackground(new java.awt.Color(255, 255, 255));
        TravelAgencyBtn.setText("TravelAgency");
        TravelAgencyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelAgencyBtnActionPerformed(evt);
            }
        });

        CustomerBtn.setBackground(new java.awt.Color(255, 255, 255));
        CustomerBtn.setText("Customer");
        CustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerBtnActionPerformed(evt);
            }
        });

        AirlinerBtn.setBackground(new java.awt.Color(255, 255, 255));
        AirlinerBtn.setText("Mange Airliner");
        AirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlinerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftpanelLayout = new javax.swing.GroupLayout(leftpanel);
        leftpanel.setLayout(leftpanelLayout);
        leftpanelLayout.setHorizontalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AirlinerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TravelAgencyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftpanelLayout.setVerticalGroup(
            leftpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftpanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(TravelAgencyBtn)
                .addGap(57, 57, 57)
                .addComponent(AirlinerBtn)
                .addGap(62, 62, 62)
                .addComponent(CustomerBtn)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftpanel);

        rightpanel.setBackground(new java.awt.Color(255, 204, 204));
        rightpanel.setPreferredSize(new java.awt.Dimension(800, 650));
        rightpanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TravelAgencyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelAgencyBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.removeAll();
        ManageTravelAgency mtapanel = new ManageTravelAgency(rightpanel,aird);
        this.rightpanel.add(mtapanel);
        ((java.awt.CardLayout)rightpanel.getLayout()).next(rightpanel);
    }//GEN-LAST:event_TravelAgencyBtnActionPerformed

    private void AirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlinerBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.removeAll();
        AirlinerLoginJpanel alpanel = new AirlinerLoginJpanel(rightpanel,aird);
        this.rightpanel.add(alpanel);
        ((java.awt.CardLayout)rightpanel.getLayout()).next(rightpanel);
    }//GEN-LAST:event_AirlinerBtnActionPerformed

    private void CustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.removeAll();
        CustomerLoginJpanel clpanel = new CustomerLoginJpanel(rightpanel,csdir,fltDir,aird,customer);
        this.rightpanel.add(clpanel);
        ((java.awt.CardLayout)rightpanel.getLayout()).next(rightpanel);       
    }//GEN-LAST:event_CustomerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AirlinerBtn;
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton TravelAgencyBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JPanel rightpanel;
    // End of variables declaration//GEN-END:variables
}
