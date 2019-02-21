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
public class Adopter {
    private String adopterName;  //Email
    private String adopterPassword;  //Can be an int
    private int adopterAge;
    private String adopterPet;
    private int adopterSalary;
    private String adopterCapacity;
    private String adopterVerifyCode;  //Can be an int
    
    public Adopter()
    {
        
    }

    public Adopter(String adopterName, String adopterPassword, int adopterAge, String adopterPet, int adopterSalary, String adopterCapacity, String adopterVerifyCode) {
        this.adopterName = adopterName;
        this.adopterPassword = adopterPassword;
        this.adopterAge = adopterAge;
        this.adopterPet = adopterPet;
        this.adopterSalary = adopterSalary;
        this.adopterCapacity = adopterCapacity;
        this.adopterVerifyCode = adopterVerifyCode;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public String getAdopterPassword() {
        return adopterPassword;
    }

    public void setAdopterPassword(String adopterPassword) {
        this.adopterPassword = adopterPassword;
    }

    public int getAdopterAge() {
        return adopterAge;
    }

    public void setAdopterAge(int adopterAge) {
        this.adopterAge = adopterAge;
    }

    public String getAdopterPet() {
        return adopterPet;
    }

    public void setAdopterPet(String adopterPet) {
        this.adopterPet = adopterPet;
    }

    public int getAdopterSalary() {
        return adopterSalary;
    }

    public void setAdopterSalary(int adopterSalary) {
        this.adopterSalary = adopterSalary;
    }

    public String getAdopterCapacity() {
        return adopterCapacity;
    }

    public void setAdopterCapacity(String adopterCapacity) {
        this.adopterCapacity = adopterCapacity;
    }

    public String getAdopterVerifyCode() {
        return adopterVerifyCode;
    }

    public void setAdopterVerifyCode(String adopterVerifyCode) {
        this.adopterVerifyCode = adopterVerifyCode;
    }
}
