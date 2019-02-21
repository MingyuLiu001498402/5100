/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import TravelAgency.AirPlane;
import TravelAgency.AirPlaneDirectory;
import TravelAgency.Airliner;
import TravelAgency.AirlinerDirectory;
import TravelAgency.Customer;
import TravelAgency.CustomerDirectory;
import TravelAgency.Flight;
import TravelAgency.FlightDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class ManageCustomerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJpanel
     */
    private AirlinerDirectory aird;
    private FlightDirectory fld;
    private Airliner airliner;
    private Flight flight;
    private CustomerDirectory csdir;
    private JPanel rightpanel;
    private Customer customer;
    private AirPlaneDirectory airpd;
    private AirPlane airplane;
    public ManageCustomerJpanel(JPanel rightpanel,CustomerDirectory csdir,AirlinerDirectory aird,FlightDirectory fltDir,Customer customer) {
        initComponents();
        this.csdir = csdir;
        this.rightpanel = rightpanel;
        this.aird = aird;
        this.fld = fltDir;
        this.customer = customer;
        System.out.print(customer);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText("Manage Customer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 6, -1, -1));

        jButton1.setFont(new java.awt.Font("Myanmar MN", 1, 13)); // NOI18N
        jButton1.setText("Search Flight Information & Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 97, -1, 45));

        jButton2.setFont(new java.awt.Font("Myanmar MN", 1, 13)); // NOI18N
        jButton2.setText("Manage Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 193, 285, 45));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Customer cm =(Customer)customerComboBox.getSelectedItem();
        SearchFlightJpanel sfpanel = new SearchFlightJpanel(rightpanel,fld,customer,aird,airpd,airliner,airplane);
        this.rightpanel.add(sfpanel);
        CardLayout layout = (CardLayout)this.rightpanel.getLayout();
        layout.next(rightpanel); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        rightpanel.removeAll();
        ManageOrderJpanel mopanel = new ManageOrderJpanel(rightpanel,csdir,aird,customer);
        this.rightpanel.add(mopanel);
        ((java.awt.CardLayout)rightpanel.getLayout()).next(rightpanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
