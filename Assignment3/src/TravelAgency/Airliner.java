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
public class Airliner {
    private String name;
    private String address;
    private String country;
    private String tel;
    private String id;
    private AirPlaneDirectory airplanedirectory;
    
    public Airliner(){
        airplanedirectory =  new AirPlaneDirectory();
    }
    

    public AirPlaneDirectory getAirplanedirectory() {
        return airplanedirectory;
    }

    public void setAirplanedirectory(AirPlaneDirectory airplanedirectory) {
        this.airplanedirectory = airplanedirectory;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
}
