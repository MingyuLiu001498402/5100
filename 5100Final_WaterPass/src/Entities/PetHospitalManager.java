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
public class PetHospitalManager {
    private String hospitalManagerName;
    private String hospitalManagerPassword;
    
    public PetHospitalManager()
    {
        
    }

    public PetHospitalManager(String hospitalManagerName, String hospitalManagerPassword) {
        this.hospitalManagerName = hospitalManagerName;
        this.hospitalManagerPassword = hospitalManagerPassword;
    }

    public String getHospitalManagerName() {
        return hospitalManagerName;
    }

    public void setHospitalManagerName(String hospitalManagerName) {
        this.hospitalManagerName = hospitalManagerName;
    }

    public String getHospitalManagerPassword() {
        return hospitalManagerPassword;
    }

    public void setHospitalManagerPassword(String hospitalManagerPassword) {
        this.hospitalManagerPassword = hospitalManagerPassword;
    }
}
