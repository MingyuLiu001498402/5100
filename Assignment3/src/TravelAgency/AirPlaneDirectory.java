/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author liumingyu
 */
public class AirPlaneDirectory {
    
    private ArrayList<AirPlane> airplanedirectory;
    
    public AirPlaneDirectory(){
    airplanedirectory = new ArrayList<AirPlane>();
}

    public ArrayList<AirPlane> getAirplanedirectory() {
        return airplanedirectory;
    }

    public void setAirplanedirectory(ArrayList<AirPlane> airplanedirectory) {
        this.airplanedirectory = airplanedirectory;
    }
    
    public AirPlane addAirPlane(){
        AirPlane newAirplane = new AirPlane();
        airplanedirectory.add(newAirplane);
        return newAirplane;
    }
    
    public void deleteAirPlane(AirPlane airplane){
        airplanedirectory.remove(airplane);
    }
   
   public AirPlane searchAirPlane(String name){
        for(AirPlane airplane : this.airplanedirectory){
            if(airplane.getName().equalsIgnoreCase(name)){
                return airplane;
            }
        }
        JOptionPane.showMessageDialog(null, "AirPlane Name doesn't exist!");
        return null;
}

    
   
}
