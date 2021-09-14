package model;

import java.util.ArrayList;

public class Map {
    private ArrayList<Country> countriesList;
    private ArrayList<Soldier> blueTeam;
    private ArrayList<Soldier> redTeam;

    
    public Map() {
        countriesList = new ArrayList<>();
        blueTeam = new  ArrayList<>();
        redTeam= new ArrayList<>();
    }


    /**
     * @return the countriesList
     */
    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }


    /**
     * @param countriesList the countriesList to set
     */
    


    /**
     * @return the blueTeam
     */
    public ArrayList<Soldier> getBlueTeam() {
        return blueTeam;
    }


    public void setCountriesList(ArrayList<Country> countriesList) {
        this.countriesList = countriesList;
    }


    /**
     * @param blueTeam the blueTeam to set
     */
    public void setBlueTeam(ArrayList<Soldier> blueTeam) {
        this.blueTeam = blueTeam;
    }


    /**
     * @return the redTeam
     */
    public ArrayList<Soldier> getRedTeam() {
        return redTeam;
    }


    /**
     * @param redTeam the redTeam to set
     */
    public void setRedTeam(ArrayList<Soldier> redTeam) {
        this.redTeam = redTeam;
    }



    
}
