package model;

import java.util.ArrayList;

public class Country {
    private String id;
    private boolean State;
    private int soldiers;
    private String team;
    private ArrayList<Country> NeighbortList;
    private int x;
    private int y;
    /**
     * @param id
     * @param neighbortList
     */
    public Country(String id, int x, int y) {
        this.id = id;
        NeighbortList = new ArrayList<>();
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
     * @return the soldiers
     */
    public int getSoldiers() {
        return soldiers;
    }
    /**
     * @param soldiers the soldiers to set
     */
    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }
    /**
     * @return the team
     */
    public String getTeam() {
        return team;
    }
    /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
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


   
    
    
    
}
