/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgency;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author liumingyu
 */
public class FlightDirectory {
    
    private ArrayList<Flight>flightdirectory;
    
    public FlightDirectory(){
        flightdirectory = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(ArrayList<Flight> flightdirectory) {
        this.flightdirectory = flightdirectory;
    }
    public Flight addFlight(){
        Flight newFlight = new Flight();
        flightdirectory.add(newFlight);
        return newFlight;
    }
    
    public void deleteFlight(Flight flight){
        flightdirectory.remove(flight);
    }
   
   public Flight searchFlight(String name){
        for(Flight flight : this.flightdirectory){
            if(flight.getName().equalsIgnoreCase(name)){
                return flight;
            }
        }
        JOptionPane.showMessageDialog(null, "AirPlane Name doesn't exist!");
        return null;
}
   public ArrayList<Flight> SearchFlight(String depaturedate, String depaturetime, String from, String to,int timetype){
       ArrayList<Flight> searchresult = new ArrayList<Flight>();
       SimpleDateFormat ymd = new SimpleDateFormat( "yyyy-MM-dd" );
       SimpleDateFormat hm = new SimpleDateFormat( "HH:mm" );
       SimpleDateFormat hh = new SimpleDateFormat("HH");
       for(Flight fl :flightdirectory){
           if((to.isEmpty()|| fl.getTo().equals(to))&& (from.isEmpty()|| fl.getFrom().equals(from))
                   && (depaturedate.isEmpty()|| ymd.format(fl.getDate()).equals(depaturedate))
                   && (timetype==0 ||(fl.getDateType())==timetype))
                 
               searchresult.add(fl);
       }
       return searchresult;
   }
}
