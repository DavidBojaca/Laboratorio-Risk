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
        //soldiersCreation();
        soldierDistribution();
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

            if (i < 6) {
                riskMap.getCountriesList().get(i).setTeam("b");
                riskMap.getCountriesList().get(i).setSoldiers(1);
                blueCountries++;
            }

            if(i >= 6){
                riskMap.getCountriesList().get(i).setTeam("r");
                riskMap.getCountriesList().get(i).setSoldiers(1);
                redCountries++;
            }
        }
    }


    /*public void attack(Country c1, Country c2 ) {        
        int battleSoldiers = c1.getBlueSoldiersList().size()+ c2.getBlueSoldiersList().size()+
        c1.getRedSoldiersList().size()+c2.getRedSoldiersList().size();

        Random luck = new Random();
        
        // si el equipo rojo tiene menos
        if (c1.getBlueSoldiersList().size()> c2.getRedSoldiersList().size()&& c1.getBlueSoldiersList().isEmpty() && c2.getRedSoldiersList().isEmpty()) {
            if (luck.nextInt(c1.getBlueSoldiersList().size()+ c2.getRedSoldiersList().size())>c2.getRedSoldiersList().size()) {

                for (int i = 0; i <c2.getRedSoldiersList().size() ; i++) {
                    riskMap.getRedTeam().remove(i);
                }

                c2.getRedSoldiersList().clear();
                
                soldierMove(c2,c1 );
                
                       
            }else{

                for (int i = 0; i <c1.getBlueSoldiersList().size() ; i++) {
                    riskMap.getBlueTeam().remove(i);
                }

                c1.getBlueSoldiersList().clear();

                soldierMove(c1,c2 );
                
            }
        }


        //si el equipo azul tiene menos 
        if (c1.getBlueSoldiersList().size()<c2.getRedSoldiersList().size()&& c1.getBlueSoldiersList().isEmpty() && c2.getRedSoldiersList().isEmpty()) {

            if ( luck.nextInt(c1.getBlueSoldiersList().size()+ c2.getRedSoldiersList().size())> c1.getBlueSoldiersList().size()) {
                
                for (int i = 0; i <c1.getBlueSoldiersList().size() ; i++) {
                    riskMap.getBlueTeam().remove(i);
                }

                c1.getBlueSoldiersList().clear();

                soldierMove(c1,c2 );
                   

            }else{
                for (int i = 0; i <c2.getRedSoldiersList().size() ; i++) {
                    riskMap.getRedTeam().remove(i);
                }

                c2.getRedSoldiersList().clear();

                soldierMove(c2,c1 );
               
            }
        }

        // si el equipo rojo tiene menos
        if (c1.getRedSoldiersList().size()> c2.getBlueSoldiersList().size()&& c1.getRedSoldiersList().isEmpty()&& c2.getBlueSoldiersList().isEmpty()) {

            if (luck.nextInt(c1.getRedSoldiersList().size()+c2.getBlueSoldiersList().size())>c2.getBlueSoldiersList().size() ) {

                for (int i = 0; i <c2.getBlueSoldiersList().size() ; i++) {
                    riskMap.getBlueTeam().remove(i);
                }

                c2.getBlueSoldiersList().clear();

                soldierMove(c2,c1 );
                       
            }else{

                for (int i = 0; i <c1.getRedSoldiersList().size() ; i++) {
                    riskMap.getRedTeam().remove(i);
                }

                c1.getRedSoldiersList().clear();

                soldierMove(c1,c2 );
                
            }
        }

        //si el equipo azul tiene menos 
        if (c1.getRedSoldiersList().size()< c2.getBlueSoldiersList().size()&& c1.getRedSoldiersList().isEmpty()&& c2.getBlueSoldiersList().isEmpty()) {

            if (luck.nextInt(c1.getRedSoldiersList().size()+c2.getBlueSoldiersList().size()) > c1.getRedSoldiersList().size() ) {
                 
                for (int i = 0; i <c1.getRedSoldiersList().size() ; i++) {
                    riskMap.getRedTeam().remove(i);
                }

                c1.getRedSoldiersList().clear();

                soldierMove(c1,c2 );
                

            }else{
                for (int i = 0; i <c2.getBlueSoldiersList().size() ; i++) {
                    riskMap.getBlueTeam().remove(i);
                }

                c2.getBlueSoldiersList().clear();
                    
                soldierMove(c2,c1 );
               
            }
        }

       
    }

    public void soldierMove(Country loser, Country winner) {

        if (winner.getBlueSoldiersList().isEmpty()) {

            if(quantityMove<=winner.getBlueSoldiersList().size()-1){
                for (int i = 0; i <quantityMove; i++) {
                    loser.getBlueSoldiersList().add(new Soldier("b"));
                    winner.getBlueSoldiersList().remove(i);
                }
            }
            else{
                setQuantityMove(0);
                soldierMove(loser, winner);

            }
            
        }



        if (winner.getRedSoldiersList().isEmpty()) {

            if(quantityMove<=winner.getRedSoldiersList().size()-1){
                for (int i = 0; i <quantityMove; i++) {
                    loser.getRedSoldiersList().add(new Soldier("r"));
                    winner.getRedSoldiersList().remove(i);
                }

            }
            else{
                setQuantityMove(0);
                soldierMove(loser, winner);

            }
        }
    
    }



    public void machine(){
        Random rmdMachine= new Random();
        ArrayList<Country> machineCountries= new ArrayList<>();
        ArrayList<Country> machinePosibility = new ArrayList<>();
        //ArrayList<Country> playerCountries= new ArrayList<>();

        // iteracion para llenar la lista de machineCountries con los páises que tienen soldados azules
        for (int i = 0; i < riskMap.getCountriesList().size(); i++) {
            if (riskMap.getCountriesList().get(i).getBlueSoldiersList().isEmpty()) {
                machineCountries.add(riskMap.getCountriesList().get(i));
            }
        }

        for (int i = 0; i <machineCountries.size() ; i++) {
            for (int j = 0; j < machineCountries.get(i).getNeighbortList().size(); j++) {
                if (machineCountries.get(i).getNeighbortList().get(j).getRedSoldiersList().isEmpty()&& machineCountries.get(i).isState()== false) {
                    machinePosibility.add(machineCountries.get(i));
                    machineCountries.get(i).setState(true);
                }
            }
         }

        
        Country mostSoldiers = null;

        mostSoldiers= machinePosibility.get(0);

        for (int i = 0; i < machinePosibility.size(); i++) {
            if (machinePosibility.get(i).getBlueSoldiersList().size()>mostSoldiers.getBlueSoldiersList().size()) {
                mostSoldiers = machinePosibility.get(i);
            }
                
        }

        //mostSoldiers= machinePosibility.stream().filter(p->p.getBlueSoldiersList()).max((s1,s2)->Integer.compare(s1, s2)).map(c-> c);
            
        for (int i = 0; i < mostSoldiers.getNeighbortList().size(); i++) {
            if(mostSoldiers.getNeighbortList().get(i).getRedSoldiersList().isEmpty()){
                setQuantityMove(rmdMachine.nextInt(mostSoldiers.getBlueSoldiersList().size()-1));
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
    }*/
    









    
}
