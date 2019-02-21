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
public class AdopterDirectory {
    private ArrayList<Adopter> adopterDirectory;
    
    public AdopterDirectory()
    {
        adopterDirectory = new ArrayList<Adopter>();
    }

    public ArrayList<Adopter> getAdopterDirectory() {
        return adopterDirectory;
    }

    public void setAdopterDirectory(ArrayList<Adopter> adopterDirectory) {
        this.adopterDirectory = adopterDirectory;
    }
}
