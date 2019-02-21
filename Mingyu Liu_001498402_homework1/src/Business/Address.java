/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author liumingyu
 */
public class Address{
   private String StreetLine1;
   private String StreetLine2;
   private String city;
   private String state;
   private String zipcode;

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetLine1() {
        return StreetLine1;
    }

    public void setStreetLine1(String StreetLine1) {
        this.StreetLine1 = StreetLine1;
    }

    public String getStreetLine2() {
        return StreetLine2;
    }

    public void setStreetLine2(String StreetLine2) {
        this.StreetLine2 = StreetLine2;
    }
   
   
   
    
}
