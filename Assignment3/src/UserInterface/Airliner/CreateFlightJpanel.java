/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Airliner;

import TravelAgency.AirPlane;
import TravelAgency.AirPlaneDirectory;
import TravelAgency.Airliner;
import TravelAgency.Flight;
import TravelAgency.FlightDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author liumingyu
 */
public class CreateFlightJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightJpanel
     */
    private JPanel rightpanel;
    private Airliner airliner;
    private AirPlane airplane;
    private FlightDirectory fdir;
    private AirPlaneDirectory aripd;
    public CreateFlightJpanel(JPanel rightpanel,Airliner airliner,AirPlane airplane) {
        initComponents();
        //Flight flight =  new Flight();
        this.airliner = airliner;
        this.airplane = airplane;
        this.rightpanel = rightpanel;
        this.fdir = fdir;
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
        NumberTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DateTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DepatureTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FromTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ToTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ArriveTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FlightTimeTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PriceTxt = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        CreateBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 1, 28)); // NOI18N
        jLabel1.setText("Create Flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 200, 48));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Flight Number:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 138, 129, 30));
        add(NumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 140, 135, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setText("Flight Date:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 186, 129, 30));
        add(DateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 188, 135, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Depature Time:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 90, 129, 30));
        add(DepatureTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 92, 135, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setText("Flight From:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 234, 129, 30));
        add(FromTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 236, 135, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Flight To:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 282, 129, 30));
        add(ToTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 284, 135, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel7.setText("Arrive Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 138, 129, 30));
        add(ArriveTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 135, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel8.setText("Total Flight Time:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 186, 140, 30));
        add(FlightTimeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 188, 135, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel9.setText("Ticket Price:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 234, 140, 30));
        add(PriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 236, 135, -1));

        BackBtn.setBackground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back<<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 364, 140, -1));

        CreateBtn.setBackground(new java.awt.Color(255, 255, 255));
        CreateBtn.setText("Create");
        CreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBtnActionPerformed(evt);
            }
        });
        add(CreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 370, 140, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel10.setText("Flight Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 90, 129, 30));
        add(NameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 92, 135, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBtnActionPerformed
        // TODO add your handling code here:
        Date dd = new Date();
        Date dt = new Date();
        Date at = new Date();
        SimpleDateFormat date = new SimpleDateFormat ("yyyy-MM-dd");
        SimpleDateFormat time = new SimpleDateFormat ("HH:mm");
        String depaturedate = DateTxt.getText();
        String depaturetime = DepatureTxt.getText();
        String arrivetime = ArriveTxt.getText();
        
        if(DateTxt.getText().isEmpty()||DepatureTxt.getText().isEmpty()||FlightTimeTxt.getText().isEmpty()||
                FromTxt.getText().isEmpty()||NumberTxt.getText().isEmpty()||PriceTxt.getText().isEmpty()||ToTxt.getText().isEmpty()
                || NameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Can not be empty");
            DepatureTxt.setText("");
            DateTxt.setText("");
            ArriveTxt.setText("");
            FromTxt.setText("");
            NameTxt.setText("");
            ToTxt.setText("");
            FlightTimeTxt.setText("");
            NumberTxt.setText("");
            PriceTxt.setText("");
            return;
        
        }
        try {
            date.parse(depaturedate+" ");
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Please use the format: yyyy-MM-dd");
            DepatureTxt.setText("");
            DateTxt.setText("");
            ArriveTxt.setText("");
            FromTxt.setText("");
            NameTxt.setText("");
            ToTxt.setText("");
            FlightTimeTxt.setText("");
            NumberTxt.setText("");
            PriceTxt.setText("");
            return;
        }
        try {
            time.parse(arrivetime+" "+depaturetime);
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Please use the format:HH:mm");
            DepatureTxt.setText("");
            DateTxt.setText("");
            ArriveTxt.setText("");
            FromTxt.setText("");
            NameTxt.setText("");
            ToTxt.setText("");
            FlightTimeTxt.setText("");
            NumberTxt.setText("");
            PriceTxt.setText("");
            return;
        }
        Flight flight = airplane.getFlightDirectory().addFlight();
        
        int price;
        try{
            price = Integer.parseInt(PriceTxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"price must be a number");  
            DepatureTxt.setText("");
            DateTxt.setText("");
            ArriveTxt.setText("");
            FromTxt.setText("");
            NameTxt.setText("");
            ToTxt.setText("");
            FlightTimeTxt.setText("");
            NumberTxt.setText("");
            PriceTxt.setText("");
            return;
        }
        
        int number;
        try{
            number = Integer.parseInt(NumberTxt.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Flight Number must be a number"); 
            DepatureTxt.setText("");
            DateTxt.setText("");
            ArriveTxt.setText("");
            FromTxt.setText("");
            NameTxt.setText("");
            ToTxt.setText("");
            FlightTimeTxt.setText("");
            NumberTxt.setText("");
            PriceTxt.setText("");
            return;
        }
        
        
   
        dd = flight.time(DepatureTxt.getText());
        dt = flight.date(DateTxt.getText());
        at = flight.time(ArriveTxt.getText());
        
        flight.setArrivetime(at);
        flight.setDate(dt);
        flight.setDepaturetime(dd);
        flight.setFrom(FromTxt.getText());
        flight.setName(NameTxt.getText());
        flight.setNum(number);
        flight.setPrice(price);
        flight.setTo(ToTxt.getText());
        flight.setTotaltime(flight.time(FlightTimeTxt.getText()));
        flight.setDateType(flight.datetype(dd));
        
        JOptionPane.showMessageDialog(null, "Create Plane sucessful");
        
        DepatureTxt.setText("");
        DateTxt.setText("");
        ArriveTxt.setText("");
        FromTxt.setText("");
        NameTxt.setText("");
        ToTxt.setText("");
        FlightTimeTxt.setText("");
        NumberTxt.setText("");
        PriceTxt.setText("");
        
    }//GEN-LAST:event_CreateBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightpanel.remove(this);
        Component[] componentArray = rightpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightJpanel mfpanel = (ManageFlightJpanel) component;
        mfpanel.populate();
        CardLayout layout = (CardLayout) rightpanel.getLayout();
        layout.previous(rightpanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ArriveTxt;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CreateBtn;
    private javax.swing.JTextField DateTxt;
    private javax.swing.JTextField DepatureTxt;
    private javax.swing.JTextField FlightTimeTxt;
    private javax.swing.JTextField FromTxt;
    private javax.swing.JTextField NameTxt;
    private javax.swing.JTextField NumberTxt;
    private javax.swing.JTextField PriceTxt;
    private javax.swing.JTextField ToTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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