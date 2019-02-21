/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author liumingyu
 */
public class CustomerDirectory {
    private ArrayList<Customer>customerdirectory;
    //CustomerDirectory csdir = new CustomerDirectory();
    public CustomerDirectory(){
        customerdirectory = new ArrayList<Customer>();
        
    }

    public ArrayList<Customer> getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(ArrayList<Customer> customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerdirectory.add(customer);
        return customer;
    }
    public Customer deleteCustomer(){
        Customer customer = new Customer();
        customerdirectory.remove(customer);
        return customer;
    }
    public Customer searchCustomer(String name){
        for(Customer customer : this.customerdirectory){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        JOptionPane.showMessageDialog(null, "AirPlane Name doesn't exist!");
        return null;
}
}


