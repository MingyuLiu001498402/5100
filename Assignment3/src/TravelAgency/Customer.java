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
public class Customer {
    private String name;
    private String tel;
    private String Email;
    private String birth;
    private OrderDirectory orderdirectory;
    private Flight flight;

    /*public Customer(){
        CustomerDirectory customerdirectory = new CustomerDirectory();
    }*/
    public Customer(){
    orderdirectory = new OrderDirectory();
}

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public OrderDirectory getOrderdirectory() {
        return orderdirectory;
    }

    public void setOrderdirectory(OrderDirectory orderdirectory) {
        this.orderdirectory = orderdirectory;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
