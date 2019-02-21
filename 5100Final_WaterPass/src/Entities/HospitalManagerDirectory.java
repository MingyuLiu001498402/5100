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
public class HospitalManagerDirectory {
    private ArrayList<PetHospitalManager> hospitalManagerDirectory;
    
    public HospitalManagerDirectory()
    {
        hospitalManagerDirectory = new ArrayList<PetHospitalManager>();
    }

    public ArrayList<PetHospitalManager> getHospitalManagerDirectory() {
        return hospitalManagerDirectory;
    }

    public void setHospitalManagerDirectory(ArrayList<PetHospitalManager> hospitalManagerDirectory) {
        this.hospitalManagerDirectory = hospitalManagerDirectory;
    }
}
