/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import javax.swing.JOptionPane;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
/**
 *
 * @author info
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private ProductDirectory prodDir;
    private Product prod;
    private JPanel rightPanel;
    ViewPanel(Product prod, ProductDirectory accDir, JPanel rightPanel) {
        initComponents();
        this.prod=prod;
        txtAvailablity.setText(String.valueOf(prod.getAvailNum()));
        txtPrice.setText(String.valueOf(prod.getPrice()));
        txtProdName.setText(prod.getName());
        txtDesc.setText(prod.getDescription());
        this.prodDir = accDir;
        this.rightPanel = rightPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrice = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        lblRoutingNo = new javax.swing.JLabel();
        lblAccNo = new javax.swing.JLabel();
        lblHead = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        txtPrice.setEditable(false);

        txtProdName.setEditable(false);

        txtAvailablity.setEditable(false);

        lblBankName.setText("Price");

        lblRoutingNo.setText("Product Name");

        lblAccNo.setText("Availablity");

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("View Product");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setText("Description");

        btnback.setText("back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblHead))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRoutingNo)
                                .addComponent(lblAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBankName)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnback))
                            .addComponent(txtProdName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAvailablity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHead)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNo)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnback))
                .addContainerGap(122, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEditable(true);
            txtPrice.setEditable(true);
            txtProdName.setEditable(true);
            txtDesc.setEnabled(true);
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
            txtAvailablity.setEditable(false);
            txtPrice.setEditable(false);
            txtProdName.setEditable(false);
            txtDesc.setEnabled(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            
            if(txtProdName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "name cannot be empty!");
            return;
        }
        if(txtAvailablity.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Availible number cannot be empty!");
            return;
        }
        if(txtPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Price cannot be empty!");
            return;
        }
       
        
            Double price;
            try{
                price = Double.parseDouble(txtPrice.getText());
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Wrong price type");
                txtPrice.setText("");
                return;
                
            }
            
            int avalinum;
            try{
                avalinum = Integer.parseInt(txtAvailablity.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Wrong Available number type");
                txtAvailablity.setText("");
                return;
            }
            
            
            prod.setName(txtProdName.getText());
            prod.setPrice(price);
            prod.setAvailNum(avalinum);
            prod.setDescription(txtDesc.getText());
        
            JOptionPane.showMessageDialog(null, "Account updated successfully");        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        this.rightPanel.remove(this);
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        Component[] comps = this.rightPanel.getComponents();
        for(Component comp:comps){
            if(comp instanceof ManageProdPanel){
                ManageProdPanel manageP = (ManageProdPanel)comp;
                manageP.populate();
            }
        }
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblRoutingNo;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
}
