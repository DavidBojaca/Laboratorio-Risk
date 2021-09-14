package model;

import java.util.ArrayList;

public class Map {
    private ArrayList<Country> CountriesList;
    private ArrayList<Soldier> blueTeam;
    private ArrayList<Soldier> redTeam;

    
    public Map() {
        CountriesList = new ArrayList<>();
        blueTeam = new  ArrayList<>();
        redTeam= new ArrayList<>();
    }


    /**
     * @return the countriesList
     */
    public ArrayList<Country> getCountriesList() {
        return CountriesList;
    }


    /**
     * @param countriesList the countriesList to set
     */
    public void setCountriesList(ArrayList<Country> countriesList) {
        CountriesList = countriesList;
    }


    /**
     * @return the blueTeam
     */
    public ArrayList<Soldier> getBlueTeam() {
        return blueTeam;
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