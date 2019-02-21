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
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinerDirectory;
   
    
    public AirlinerDirectory()
    {
        airlinerDirectory = new ArrayList<Airliner>();

        
    }

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    
    public Airliner addAirliner(){
        Airliner newAirliner = new Airliner();
        airlinerDirectory.add(newAirliner);
        return newAirliner;
    }
    
    public void deleteAirliner(Airliner airliner){
        airlinerDirectory.remove(airliner);
    }
   
   public Airliner searchAirliner(String name){
        for(Airliner airliner : this.airlinerDirectory){
            if(airliner.getName().equalsIgnoreCase(name)){
                return airliner;
            }
        }
        JOptionPane.showMessageDialog(null, "Airline Name doesn't exist!");
        return null;
        
    }
    

    
    
}