/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

/**
 *
 * @author liumingyu
 */
public class Order {
    private String orderNum;
    private Flight flight;
    private Customer customer;
    private Seat seat;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(int row,int column,String columnName){
        Seat seatdemo = new Seat();
        seatdemo.setRow(row+1);
        seatdemo.setColumn(column+1);
        seatdemo.setSeatPosition(String.valueOf(row+1)+columnName);
        this.seat = seatdemo;
    }

    
    @Override
    public String toString() {
        return orderNum;
    }
}
