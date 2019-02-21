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
public class StrayAnimal {
    private String strayAnimalName;
    private int strayAnimalID;
    private String strayAnimalSpecies;
    private String strayAnimalFindLocation;
    private String strayAnimalDisease;
    
    public StrayAnimal()
    {
        
    }

    public StrayAnimal(String strayAnimalName, int strayAnimalID, String strayAnimalSpecies, String strayAnimalFindLocation, String strayAnimalDisease) {
        this.strayAnimalName = strayAnimalName;
        this.strayAnimalID = strayAnimalID;
        this.strayAnimalSpecies = strayAnimalSpecies;
        this.strayAnimalFindLocation = strayAnimalFindLocation;
        this.strayAnimalDisease = strayAnimalDisease;
    }

    public String getStrayAnimalName() {
        return strayAnimalName;
    }

    public void setStrayAnimalName(String strayAnimalName) {
        this.strayAnimalName = strayAnimalName;
    }

    public int getStrayAnimalID() {
        return strayAnimalID;
    }

    public void setStrayAnimalID(int strayAnimalID) {
        this.strayAnimalID = strayAnimalID;
    }

    public String getStrayAnimalSpecies() {
        return strayAnimalSpecies;
    }

    public void setStrayAnimalSpecies(String strayAnimalSpecies) {
        this.strayAnimalSpecies = strayAnimalSpecies;
    }

    public String getStrayAnimalFindLocation() {
        return strayAnimalFindLocation;
    }

    public void setStrayAnimalFindLocation(String strayAnimalFindLocation) {
        this.strayAnimalFindLocation = strayAnimalFindLocation;
    }

    public String getStrayAnimalDisease() {
        return strayAnimalDisease;
    }

    public void setStrayAnimalDisease(String strayAnimalDisease) {
        this.strayAnimalDisease = strayAnimalDisease;
    }
}
