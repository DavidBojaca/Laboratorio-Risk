package model;

import java.util.ArrayList;
import java.util.Random;

import utils.Utils;
import view.Window;

public class Funtions {
    private Map riskMap;
    private int quantityMove;
    private Window window = null;

    public Funtions(Window w){
        this.window = w;
    }
        


    public void setQuantityMove(int quantity){
        this.quantityMove= quantity;

    }
    
    public void countriesCreation() {

        Country C = new Country("C", 175, 180);
        Country B = new Country("B", 280, 260);
        Country A = new Country("A", 320, 410);
        Country D = new Country("D", 410, 450);
        Country E = new Country("E", 345, 550);
        Country G = new Country("G", 650, 190);
        Country I = new Country("I", 950, 160);
        Country H = new Country("H", 830, 270);
        Country F = new Country("F", 560, 340);
        Country J = new Country("J", 650, 390);
        Country K = new Country("K", 630, 490);
        Country L = new Country("L", 970, 500);

        A.getNeighbortList().add(C);
        A.getNeighbortList().add(D);
        A.getNeighbortList().add(E);
        A.getNeighbortList().add(G);

        B.getNeighbortList().add(G);
        B.getNeighbortList().add(C);

        C.getNeighbortList().add(A);
        C.getNeighbortList().add(B);

        D.getNeighbortList().add(A);
        D.getNeighbortList().add(F);

        E.getNeighbortList().add(A);
        E.getNeighbortList().add(K);

        F.getNeighbortList().add(D);
        F.getNeighbortList().add(G);
        F.getNeighbortList().add(J);
        F.getNeighbortList().add(K);

        G.getNeighbortList().add(A);
        G.getNeighbortList().add(F);
        G.getNeighbortList().add(B);
        G.getNeighbortList().add(I);

        H.getNeighbortList().add(I);
        H.getNeighbortList().add(J);
        H.getNeighbortList().add(L);

        I.getNeighbortList().add(G);
        I.getNeighbortList().add(H);

        J.getNeighbortList().add(F);
        J.getNeighbortList().add(H);
        J.getNeighbortList().add(L);

        K.getNeighbortList().add(E);
        K.getNeighbortList().add(F);
        K.getNeighbortList().add(L);

        L.getNeighbortList().add(K);
        L.getNeighbortList().add(J);
        L.getNeighbortList().add(H);
        ArrayList<Country> countriesList = new ArrayList<>();
        countriesList.add(A);
        countriesList.add(B);
        countriesList.add(C);
        countriesList.add(D);
        countriesList.add(E);
        countriesList.add(F);
        countriesList.add(G);
        countriesList.add(H);
        countriesList.add(I);
        countriesList.add(J);
        countriesList.add(K);
        countriesList.add(L);
        System.out.println(countriesList.size());
        riskMap = new Map(countriesList);
        soldiersCreation();
        //soldierDistribution();
        updateUI();
    }

    public void updateUI() {
        window.getPanel().getCountriesList().addAll(riskMap.getCountriesList());
        window.repaint();
    }

    

    public void soldiersCreation() {
        riskMap.setRedSoldiers(48);
        riskMap.setBlueSoldiers(48);
    }

    public void soldierDistribution() {
        int blueCountries = 0;
        int redCountries=0;
        int rmd;

        for (int i = 0; i < riskMap.getCountriesList().size(); i++) {
            rmd = Utils.RANDOM.nextInt(2);

            if (i <6) {
                riskMap.getCountriesList().get(i).setTeam("b");
                riskMap.getCountriesList().get(i).setSoldiers(8);
                blueCountries++;
            }

            if(i >=6){
                riskMap.getCountriesList().get(i).setTeam("r");
                riskMap.getCountriesList().get(i).setSoldiers(8);
                redCountries++;
            }
        }

    }

       


    

    public void attack(Country c1, Country c2 ) {        
        int battleSoldiers = c1.getSoldiers()+ c2.getSoldiers();
        int redGlobal=riskMap.getRedSoldiers();
        int blueGlobal=riskMap.getBlueSoldiers();

        Random luck = new Random();
        
        // si c1 tiene mas soldados que c2
        if (c1.getSoldiers()> c2.getSoldiers()) {
            if (luck.nextInt(battleSoldiers)>c2.getSoldiers()) {

                for (int i = 0; i <c2.getSoldiers() ; i++) {
                    if (c2.getTeam().equals("r")) {
                        redGlobal= redGlobal-1;
                    }
                    else{
                        blueGlobal = blueGlobal-1;
                    }
                }

                c2.setSoldiers(0);
                soldierMove(c2,c1 );
                       
            }else{

                for (int i = 0; i <c1.getSoldiers() ; i++) {
                    if (c1.getTeam().equals("r")) {
                        redGlobal= redGlobal-1;
                    }
                    else{
                        blueGlobal = blueGlobal-1;
                    }
                }

                c1.setSoldiers(0);

                soldierMove(c1,c2 );
                
            }
        }

        // si c2 tiene más soldados que c1
        if (c2.getSoldiers()> c1.getSoldiers()) {
            if (luck.nextInt(battleSoldiers)>c1.getSoldiers()) {

                for (int i = 0; i <c1.getSoldiers() ; i++) {
                    if (c1.getTeam().equals("r")) {
                        redGlobal= redGlobal-1;
                    }
                    else{
                        blueGlobal = blueGlobal-1;
                    }
                }

                c1.setSoldiers(0);
                soldierMove(c1,c2 );
                
                       
            }else{

                for (int i = 0; i <c2.getSoldiers() ; i++) {
                    if (c2.getTeam().equals("r")) {
                        redGlobal= redGlobal-1;
                    }
                    else{
                        blueGlobal = blueGlobal-1;
                    }
                }
                c2.setSoldiers(0);

                soldierMove(c2,c1 );
                
            }
        }


    }

    public void soldierMove(Country loser, Country winner) {

        if(quantityMove<=winner.getSoldiers()-1){
            loser.setTeam(winner.getTeam());
            loser.setSoldiers(quantityMove);
            winner.setSoldiers(winner.getSoldiers()-quantityMove);
        }
        else{

            setQuantityMove(0);
            soldierMove(loser, winner);

        }

    }



    public void machine(){
        Random rmdMachine= new Random();
        ArrayList<Country> machineCountries= new ArrayList<>();
        ArrayList<Country> machinePosibility = new ArrayList<>();
        

        // iteracion para llenar la lista de machineCountries con los páises que tienen soldados azules
        for (int i = 0; i < riskMap.getCountriesList().size(); i++) {
            if (riskMap.getCountriesList().get(i).getTeam().equals("b")) {
                machineCountries.add(riskMap.getCountriesList().get(i));
            }
        }

        for (int i = 0; i <machineCountries.size() ; i++) {
            for (int j = 0; j < machineCountries.get(i).getNeighbortList().size(); j++) {
                if (machineCountries.get(i).getNeighbortList().get(j).getTeam().equals("r")&& machineCountries.get(i).isState()== false) {
                    machinePosibility.add(machineCountries.get(i));
                    machineCountries.get(i).setState(true);
                }
            }
         }

        
        Country mostSoldiers = null;

        mostSoldiers= machinePosibility.get(0);

        for (int i = 0; i < machinePosibility.size(); i++) {
            if (machinePosibility.get(i).getSoldiers()>mostSoldiers.getSoldiers()) {
                mostSoldiers = machinePosibility.get(i);
            }
                
        }

        
            
        for (int i = 0; i < mostSoldiers.getNeighbortList().size(); i++) {
            if(mostSoldiers.getNeighbortList().get(i).getSoldiers()!=0){
                setQuantityMove(rmdMachine.nextInt(mostSoldiers.getSoldiers()-1)+1);
                attack(mostSoldiers, mostSoldiers.getNeighbortList().get(i));
                
                break;
            }
        }

    }

    public void playerTurn(Country c1, Country c2, int quantity) {
        setQuantityMove(quantity);
        attack(c1, c2);
        
    }

    public void machineTurn() {
        machine();

    }

    public void stardGame(){
        soldiersCreation();
        soldierDistribution();
    }
    









    
}
