package model;

import java.util.ArrayList;
import java.util.Random;

public class Funtions {
    private Map riskMap;
    private int quantityMove;


    public void setQuantityMove(int quantity){
        this.quantityMove= quantity;
    }


    // funcion para crear los soldados que estaran en el juego

    public void soldiersCreation() {
    
        for (int i = 0; i < 49; i++) {
            riskMap.getBlueTeam().add(new Soldier("b"));
            riskMap.getRedTeam().add(new Soldier("a"));
        }
    }
    
    public void countriesCreation() {

        Country A = new Country("A",0,0);
        Country B = new Country("B",0,10);
        Country C = new Country("C",0,20);
        Country D = new Country("D",0,30);
        Country E = new Country("E",0,40);
        Country F = new Country("F",0,50);
        Country G = new Country("G",0,60);
        Country H = new Country("H",0,70);
        Country I = new Country("I",0,80);
        Country J = new Country("J",0,90);
        Country K = new Country("K",0,100);
        Country L = new Country("L",0,110);


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



        riskMap.getCountriesList().add(A);
        riskMap.getCountriesList().add(B);
        riskMap.getCountriesList().add(C);
        riskMap.getCountriesList().add(D);
        riskMap.getCountriesList().add(E);
        riskMap.getCountriesList().add(F);
        riskMap.getCountriesList().add(G);
        riskMap.getCountriesList().add(H);
        riskMap.getCountriesList().add(I);
        riskMap.getCountriesList().add(J);
        riskMap.getCountriesList().add(K);
        riskMap.getCountriesList().add(L);
        
    }



    public void soldierDistribution() {
        int blueQuantity= riskMap.getBlueTeam().size();
        int redQuantity= riskMap.getRedTeam().size();
        int blueCountries =0;
        int redCountries = 0;
        Random rmd= new Random();
        //rmd.nextInt(riskMap.getBlueTeam().size()/(riskMap.getCountriesList().size()/2)
        do{    
            for (int i = 0; i < riskMap.getCountriesList().size(); i++) {

                int soldierNum= rmd.nextInt(2); 


                if (blueCountries<=6 && soldierNum ==1) {
                    for (int j = 0; j < 8  ; j++) {
                        riskMap.getCountriesList().get(i).getBlueSoldiersList().add(new Soldier("b"));
                        blueQuantity = blueQuantity-1;
                    }
                    blueCountries++;
                }

                if (redCountries<=6 &&soldierNum==0) {
                    for (int j = 0; j < 8 ; j++) {
                        riskMap.getCountriesList().get(i).getRedSoldiersList().add(new Soldier("a"));
                        redQuantity = redQuantity-1;
                    }
                    redCountries++;
                }
            }
        }while(redQuantity!=0&& blueQuantity!=0);







                 
              

                /*if (riskMap.getCountriesList().get(i)== riskMap.getCountriesList().get(riskMap.getCountriesList().size()-1)) {
                     int recidueBlue = blueQuantity;
                     int recidueRed= redQuantity;
 
                     if (soldierNum==1 || redQuantity==0) {
                         for (int j = 0; j < recidueBlue ; j++) {
                             riskMap.getCountriesList().get(i).getBlueSoldiersList().add(new Soldier("b"));
                             blueQuantity = blueQuantity-1;
                        }
                     }
 
                     if (soldierNum!=1 || blueQuantity==0) {
                         for (int j = 0; j < recidueRed ; j++) {
                             riskMap.getCountriesList().get(i).getRedSoldiersList().add(new Soldier("a"));
                             redQuantity = redQuantity-1;
                        }
                     }


               
                }
                if (riskMap.getCountriesList().get(i)== riskMap.getCountriesList().get(riskMap.getCountriesList().size())) {
                    int recidueBlue = blueQuantity;
                    int recidueRed= redQuantity;

                    if (soldierNum==1 || redQuantity==0) {
                        for (int j = 0; j < recidueBlue ; j++) {
                            riskMap.getCountriesList().get(i).getBlueSoldiersList().add(new Soldier("b"));
                            blueQuantity = blueQuantity-1;
                       }
                    }

                    if (soldierNum!=1 || blueQuantity==0) {
                        for (int j = 0; j < recidueRed ; j++) {
                            riskMap.getCountriesList().get(i).getRedSoldiersList().add(new Soldier("a"));
                            redQuantity = redQuantity-1;
                       }
                    }
                }

            }*/
        
        
    }

    public void attack(Country c1, Country c2 ) {        
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
    }
    









    
}
