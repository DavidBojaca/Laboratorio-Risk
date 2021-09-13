package model;

import java.util.ArrayList;

public class Country {
    private String id;
    private boolean State;
    private ArrayList<Soldier> redSoldiersList;
    private ArrayList<Soldier> blueSoldiersList;
    private ArrayList<Country> NeighbortList;
    


    private int x;
    private int y;
    /**
     * 
     * @param state
     * 
     */
    public Country(String id, int x, int y) {

        this.State = false;
        this.id= id;
        this.redSoldiersList= new ArrayList<>();
        this.blueSoldiersList= new ArrayList<>();
        this.NeighbortList = new ArrayList<>();
        this.x= x;
        this.y=y;

    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the state
     */
    public boolean isState() {
        return State;
    }
    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        State = state;
    }
    /**
     * @return the redSoldiersList
     */
    public ArrayList<Soldier> getRedSoldiersList() {
        return redSoldiersList;
    }
    /**
     * @param redSoldiersList the redSoldiersList to set
     */
    public void setRedSoldiersList(ArrayList<Soldier> redSoldiersList) {
        this.redSoldiersList = redSoldiersList;
    }
    /**
     * @return the blueSoldiersList
     */
    public ArrayList<Soldier> getBlueSoldiersList() {
        return blueSoldiersList;
    }
    /**
     * @param blueSoldiersList the blueSoldiersList to set
     */
    public void setBlueSoldiersList(ArrayList<Soldier> blueSoldiersList) {
        this.blueSoldiersList = blueSoldiersList;
    }
    /**
     * @return the neighbortList
     */
    public ArrayList<Country> getNeighbortList() {
        return NeighbortList;
    }
    /**
     * @param neighbortList the neighbortList to set
     */
    public void setNeighbortList(ArrayList<Country> neighbortList) {
        NeighbortList = neighbortList;
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Country [NeighbortList=" + NeighbortList + ", State=" + State + ", blueSoldiersList=" + blueSoldiersList
                + ", id=" + id + ", redSoldiersList=" + redSoldiersList + ", x=" + x + ", y=" + y + "]";
    }

    
    
    
}
