package model;

import java.util.ArrayList;

public class Map {
    private ArrayList<Country> countriesList;
    private int redSoldiers;
    private int blueSoldiers;
    

    
    public Map(ArrayList<Country> countriesList) {
        this.countriesList =countriesList;
        
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
    public void setCountriesList(ArrayList<Country> countriesList) {
        this.countriesList = countriesList;
    }



    /**
     * @return the redSoldiers
     */
    public int getRedSoldiers() {
        return redSoldiers;
    }



    /**
     * @param redSoldiers the redSoldiers to set
     */
    public void setRedSoldiers(int redSoldiers) {
        this.redSoldiers = redSoldiers;
    }



    /**
     * @return the blueSoldiers
     */
    public int getBlueSoldiers() {
        return blueSoldiers;
    }



    /**
     * @param blueSoldiers the blueSoldiers to set
     */
    public void setBlueSoldiers(int blueSoldiers) {
        this.blueSoldiers = blueSoldiers;
    }
    

    


    
}
