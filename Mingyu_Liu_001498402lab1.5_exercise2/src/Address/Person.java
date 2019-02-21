/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Address;

/**
 *
 * @author liumingyu
 */
public class Person {
    String lastname;
    String firstname;   
    String dob;
    String addressline1;
    String addressline2;
    
    private WorkAddress workaddress;
    private LocalAddress localaddress;
    private SweethomeAddress sweethomeaddress;
    
    /*public void person(String lastname, String firstname, String dob, WorkAddress workaddress,LocalAddress sweethomeaddress,SweethomeAddress localaddress){
        this.firstname =firstname;
        this.lastname = lastname;
        this.dob =dob;
        this.localaddress= sweethomeaddress;
        this.sweethomeaddress =localaddress;
        this.workaddress = workaddress;
    }*/

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    
    

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    
    
    


    public WorkAddress getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(WorkAddress workaddress) {
        this.workaddress = workaddress;
    }

    public LocalAddress getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(LocalAddress localaddress) {
        this.localaddress = localaddress;
    }

    public SweethomeAddress getSweethomeaddress() {
        return sweethomeaddress;
    }

    public void setSweethomeaddress(SweethomeAddress sweethomeaddress) {
        this.sweethomeaddress = sweethomeaddress;
    }


    
    
}
