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
public class Person {
    
    private Address address;
    private Cases cases;
    private Account account;    
    private Demographic demographic;
    private DriverLicense driverlicense;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Cases getCases() {
        return cases;
    }

    public void setCases(Cases cases) {
        this.cases = cases;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public DriverLicense getDriverlicense() {
        return driverlicense;
    }

    public void setDriverlicense(DriverLicense driverlicense) {
        this.driverlicense = driverlicense;
    }
    
    


    
    
    
    
    
}
