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
public class PetHospital {
    private String hospitalName;
    private String hospitalCity;
    private String hospitalLocation;
    private String hospitalCurableAnimal;  //Use list
    private String hospitalCurableDisease;  //Use list
    private int hospitalSuccessRate;  //Use hashmap
    private int hospitalLevel;
    private int hospitalCapacity;
    
    public PetHospital()
    {
        
    }

    public PetHospital(String hospitalName, String hospitalCity, String hospitalLocation, String hospitalCurableAnimal, String hospitalCurableDisease, int hospitalSuccessRate, int hospitalLevel, int hospitalCapacity) {
        this.hospitalName = hospitalName;
        this.hospitalCity = hospitalCity;
        this.hospitalLocation = hospitalLocation;
        this.hospitalCurableAnimal = hospitalCurableAnimal;
        this.hospitalCurableDisease = hospitalCurableDisease;
        this.hospitalSuccessRate = hospitalSuccessRate;
        this.hospitalLevel = hospitalLevel;
        this.hospitalCapacity = hospitalCapacity;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalLocation() {
        return hospitalLocation;
    }

    public void setHospitalLocation(String hospitalLocation) {
        this.hospitalLocation = hospitalLocation;
    }

    public String getHospitalCurableAnimal() {
        return hospitalCurableAnimal;
    }

    public void setHospitalCurableAnimal(String hospitalCurableAnimal) {
        this.hospitalCurableAnimal = hospitalCurableAnimal;
    }

    public String getHospitalCurableDisease() {
        return hospitalCurableDisease;
    }

    public void setHospitalCurableDisease(String hospitalCurableDisease) {
        this.hospitalCurableDisease = hospitalCurableDisease;
    }

    public int getHospitalSuccessRate() {
        return hospitalSuccessRate;
    }

    public void setHospitalSuccessRate(int hospitalSuccessRate) {
        this.hospitalSuccessRate = hospitalSuccessRate;
    }

    public int getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(int hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public int getHospitalCapacity() {
        return hospitalCapacity;
    }

    public void setHospitalCapacity(int hospitalCapacity) {
        this.hospitalCapacity = hospitalCapacity;
    }
}
