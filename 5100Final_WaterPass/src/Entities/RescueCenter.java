/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author dell
 */
public class RescueCenter {
    private String centerName;
    private String centerCity;
    private String centerLocation;
    private int centerCapacity;
    
    public RescueCenter()
    {
        
    }

    public RescueCenter(String centerName, String centerCity, String centerLocation, int centerCapacity) {
        this.centerName = centerName;
        this.centerCity = centerCity;
        this.centerLocation = centerLocation;
        this.centerCapacity = centerCapacity;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCity() {
        return centerCity;
    }

    public void setCenterCity(String centerCity) {
        this.centerCity = centerCity;
    }

    public String getCenterLocation() {
        return centerLocation;
    }

    public void setCenterLocation(String centerLocation) {
        this.centerLocation = centerLocation;
    }

    public int getCenterCapacity() {
        return centerCapacity;
    }

    public void setCenterCapacity(int centerCapacity) {
        this.centerCapacity = centerCapacity;
    }
}
