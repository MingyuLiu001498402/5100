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
public class CenterManagerDirectory {
    private ArrayList<RescueCenterManager> centerManagerDirectory;
    
    public CenterManagerDirectory()
    {
        centerManagerDirectory = new ArrayList<RescueCenterManager>();
    }

    public ArrayList<RescueCenterManager> getCenterManagerDirectory() {
        return centerManagerDirectory;
    }

    public void setCenterManagerDirectory(ArrayList<RescueCenterManager> centerManagerDirectory) {
        this.centerManagerDirectory = centerManagerDirectory;
    }
}
