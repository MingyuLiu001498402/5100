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
public class RescueCenterManager {
    private String centerManagerName;
    private String centerManagerPassword;
    private String strayAnimalNumber;
    
    public RescueCenterManager()
    {
        
    }

    public RescueCenterManager(String centerManagerName, String centerManagerPassword, String strayAnimalNumber) {
        this.centerManagerName = centerManagerName;
        this.centerManagerPassword = centerManagerPassword;
        this.strayAnimalNumber = strayAnimalNumber;
    }

    public String getCenterManagerName() {
        return centerManagerName;
    }

    public void setCenterManagerName(String centerManagerName) {
        this.centerManagerName = centerManagerName;
    }

    public String getCenterManagerPassword() {
        return centerManagerPassword;
    }

    public void setCenterManagerPassword(String centerManagerPassword) {
        this.centerManagerPassword = centerManagerPassword;
    }

    public String getStrayAnimalNumber() {
        return strayAnimalNumber;
    }

    public void setStrayAnimalNumber(String strayAnimalNumber) {
        this.strayAnimalNumber = strayAnimalNumber;
    }
}
