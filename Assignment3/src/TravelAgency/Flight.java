/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author liumingyu
 */
public class Flight {
    private String name;
    private int num;
    private String from;
    private String to;
    private int price;
    private Date date;
    private Date depaturetime;
    private Date arrivetime;
    private Date totaltime;
    private int DateType;
    private CustomerDirectory customerdirectory;
    private SeatList seatlist;
    
    public Flight(){
        customerdirectory = new CustomerDirectory();
        seatlist = new SeatList();
    }

    public SeatList getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(SeatList seatlist) {
        this.seatlist = seatlist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDepaturetime() {
        return depaturetime;
    }

    public void setDepaturetime(Date depaturetime) {
        this.depaturetime = depaturetime;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    public Date getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Date totaltime) {
        this.totaltime = totaltime;
    }

    public int getDateType() {
        return DateType;
    }

    public void setDateType(int DateType) {
        this.DateType = DateType;
    }
    
    public Date date(String date){
       SimpleDateFormat dat = new SimpleDateFormat ("yyyy-MM-dd");
       String input = date; 
       Date t =new Date(); 
       
        try { 
          t = dat.parse(input);
          
          
        }catch (ParseException e) { 
          JOptionPane.showMessageDialog(null, "Please use the format: yyyy-MM-dd");
        }
//        
        return t;
      }
    



      public Date time(String time){
       SimpleDateFormat ti= new SimpleDateFormat ("HH:mm");
       String input = time; 

       Date t =new Date(); 
        try { 
          t = ti.parse(input); 
          
        }catch (ParseException e) { 
          JOptionPane.showMessageDialog(null, "Please use the format: HH:mm");
        }
        return t;
      }
      
      public int datetype(Date time){
            System.out.println(time);
            SimpleDateFormat hh = new SimpleDateFormat ("HH");
          
            int dt;
            dt = Integer.parseInt(hh.format(time));
            System.out.println(dt);
            if(dt <= 12 && dt>=6){
                return 1; // 1-morning
            }else if(dt >= 12& dt<=18){
                return 2; // 3-evening
            }else{
                return 3; // 2-day time
            }
      }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
