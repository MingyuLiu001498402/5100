/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.util.ArrayList;

/**
 *
 * @author liumingyu
 */
public class OrderDirectory {
    private ArrayList<Order> orderdirectory;
    
    
    public OrderDirectory(){
        orderdirectory= new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderdirectory() {
        return orderdirectory;
    }

    public void setOrderdirectory(ArrayList<Order> orderdirectory) {
        this.orderdirectory = orderdirectory;
    }
    

//    public ArrayList<Order> getOrderList() {
//        return orderdirectory;
//    }
//
//    public void setOrderList(ArrayList<Order> orderList) {
//        this.orderdirectory = orderList;
//    }
    
    public Order addOrder(){
        Order order = new Order();
        orderdirectory.add(order);
        return order;
    }
    
    public void removeOrder(Order order){
        orderdirectory.remove(order);
    }
    
}
