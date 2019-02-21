/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class StrayAnimalDirectory {
    private ArrayList<StrayAnimal> strayAnimalDirectory;
    
    public StrayAnimalDirectory()
    {
        strayAnimalDirectory = new ArrayList<StrayAnimal>();
    }

    public ArrayList<StrayAnimal> getStrayAnimalDirectory() {
        return strayAnimalDirectory;
    }

    public void setStrayAnimalDirectory(ArrayList<StrayAnimal> strayAnimalDirectory) {
        this.strayAnimalDirectory = strayAnimalDirectory;
    }
}
