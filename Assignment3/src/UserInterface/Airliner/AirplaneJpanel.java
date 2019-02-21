/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliner;

import TravelAgency.AirPlane;
import TravelAgency.AirPlaneDirectory;
import TravelAgency.Airliner;
import TravelAgency.AirlinerDirectory;
import UserInterface.TravelAgency.ManageAirliner;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class AirplaneJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AirplaneJpanel
     */
    private JPanel airlinerpanel;
    private Airliner airliner;
    private AirPlaneDirectory airpd;
  
    
    public AirplaneJpanel(JPanel airlinerpanel,Airliner airliner) {
        initComponents();
        this.airliner = airliner;
        this.airlinerpanel = airlinerpanel;
        Airliner.setText(airliner.getName());
        populate();
    }
    
    
    public void populate(){
        int rowCount = PlaneTable.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)PlaneTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            dtm.removeRow(i);
       }
        
        for(AirPlane aplane : airliner.getAirplanedirectory().getAirplanedirectory()){
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = aplane;
            row[1] = aplane.getID();
            row[2] = aplane.getAvailableseat();
            
            dtm.addRow(row);
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
        jLabel2 = new javax.swing.JLabel();
        Airliner = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlaneTable = new javax.swing.JTable();
        CreateBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText("Manage Airplane");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 250, 41));

        jLabel2.setFont(new java.awt.Font("Menlo", 1, 18)); // NOI18N
        jLabel2.setText("Airliner:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 25));

        Airliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlinerActionPerformed(evt);
            }
        });
        add(Airliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 137, -1));

        PlaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Available seat"
            }
        ));
        jScrollPane1.setViewportView(PlaneTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 87, 613, 254));

        CreateBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create Plane");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });
        add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 359, 114, -1));

        ViewBtn.setBackground(new java.awt.Color(255, 255, 255));
        ViewBtn.setText("View Plane");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });
        add(ViewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 359, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete Plane");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 359, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Manage Flight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 359, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AirlinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AirlinerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = PlaneTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                AirPlane airplane = (AirPlane)PlaneTable.getValueAt(selectedRow, 0);
                airliner.getAirplanedirectory().deleteAirPlane(airplane);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        CreatePlaneJpanel createplane =  new CreatePlaneJpanel(airlinerpanel,airliner,airpd);
        this.airlinerpanel.add(createplane);
        CardLayout layout = (CardLayout)this.airlinerpanel.getLayout();
        layout.next(airlinerpanel);
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = PlaneTable.getSelectedRow();

        if(selectedRow >= 0){
            AirPlane airplane= (AirPlane)PlaneTable.getValueAt(selectedRow, 0);
            ViewPlaneJpanel viewpanel = new ViewPlaneJpanel(airlinerpanel,airplane,airliner);
            this.airlinerpanel.add(viewpanel);
            CardLayout layout = (CardLayout)this.airlinerpanel.getLayout();
            layout.next(airlinerpanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = PlaneTable.getSelectedRow();
        if(selectedRow >= 0){
            
        AirPlane airplane= (AirPlane)PlaneTable.getValueAt(selectedRow, 0);
        ManageFlightJpanel mfjp = new ManageFlightJpanel(airlinerpanel, airliner,airplane);
        airlinerpanel.add("ManageFlightJPanel",mfjp);
        CardLayout layout = (CardLayout)airlinerpanel.getLayout();
        layout.next(airlinerpanel);
        
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Airliner;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTable PlaneTable;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
