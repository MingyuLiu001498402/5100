/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Adopter;

import Entity.Adopter.Adopter;
import Entity.System.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liumingyu
 */
public class CheckStatusJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckStatusJpanel
     */
    private JPanel rightpanel;
    private EcoSystem ecoSystem;
    private Adopter adopter;
    
    public CheckStatusJpanel(JPanel rightpanel, EcoSystem ecoSystem, Adopter adopter) {
        initComponents();
        this.rightpanel = rightpanel;
        this.ecoSystem = ecoSystem;
        this.adopter = adopter;
        
        if(adopter.getStatus().equals("Permitted"))
        {
            FindBtn.setEnabled(true);
        }
        
        else
        {
            FindBtn.setEnabled(false);
        }
        
        populate();
    }
    
    public void populate()
    {
        int rowCount = adopterTble.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel)adopterTble.getModel();
        jScrollPane1.getViewport().setBackground(new Color(249,246,246));
        for(int i = rowCount - 1; i >= 0; i--)
        {
            dtm.removeRow(i);
        }
        
        if(adopter.getStatus().toString() != "Default")
        {
            Object row[] = new Object[dtm.getColumnCount()];
            row[0] = adopter;
            row[1] = adopter.getUserInfo().getEmail();
            row[2] = adopter.getUserInfo().getSalary();
            row[3] = adopter.getStatus();
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

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adopterTble = new javax.swing.JTable();
        FindBtn = new javax.swing.JButton();
        InformationBtn = new javax.swing.JButton();
        KeptAnimalBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(249, 246, 246));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Adopter/AdopterLogin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 600));

        jPanel2.setBackground(new java.awt.Color(249, 246, 246));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        adopterTble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adopter Name", "Adopter Email", "Adopter Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(adopterTble);
        if (adopterTble.getColumnModel().getColumnCount() > 0) {
            adopterTble.getColumnModel().getColumn(0).setResizable(false);
            adopterTble.getColumnModel().getColumn(1).setResizable(false);
            adopterTble.getColumnModel().getColumn(2).setResizable(false);
            adopterTble.getColumnModel().getColumn(3).setResizable(false);
        }

        FindBtn.setBackground(new java.awt.Color(255, 255, 255));
        FindBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        FindBtn.setText("Find Animal");
        FindBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBtnActionPerformed(evt);
            }
        });

        InformationBtn.setBackground(new java.awt.Color(255, 255, 255));
        InformationBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        InformationBtn.setText("Click here to add more personal information!");
        InformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationBtnActionPerformed(evt);
            }
        });

        KeptAnimalBtn.setBackground(new java.awt.Color(255, 255, 255));
        KeptAnimalBtn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        KeptAnimalBtn.setText("Check Adopted Animal");
        KeptAnimalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeptAnimalBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 36)); // NOI18N
        jLabel4.setText("Adopter Status Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(KeptAnimalBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FindBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(InformationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeptAnimalBtn)
                    .addComponent(FindBtn))
                .addGap(53, 53, 53)
                .addComponent(InformationBtn)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 690, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void FindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBtnActionPerformed
        // TODO add your handling code here:
        SearchAnimalJpanel sajpanel = new SearchAnimalJpanel(rightpanel, ecoSystem, adopter);
        rightpanel.add(sajpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_FindBtnActionPerformed

    private void InformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationBtnActionPerformed
        // TODO add your handling code here
        InformationJpanel infojpanel = new InformationJpanel(rightpanel, ecoSystem, adopter);
        rightpanel.add(infojpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_InformationBtnActionPerformed

    private void KeptAnimalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeptAnimalBtnActionPerformed
        // TODO add your handling code here:
        ViewAdopterAnimalJpanel viewjpanel = new ViewAdopterAnimalJpanel(rightpanel, ecoSystem, adopter);
        rightpanel.add(viewjpanel);
        CardLayout layout = (CardLayout)rightpanel.getLayout();
        layout.next(rightpanel);
    }//GEN-LAST:event_KeptAnimalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FindBtn;
    private javax.swing.JButton InformationBtn;
    private javax.swing.JButton KeptAnimalBtn;
    private javax.swing.JTable adopterTble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
