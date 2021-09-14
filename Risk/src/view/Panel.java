package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.Country;
import model.Map;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.util.ArrayList;


public class Panel extends JPanel{
    private ArrayList<Country> countriesList = new ArrayList<>();
    
    public Panel(){
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics graph) {
        ImageIcon background = new ImageIcon(getClass().getResource("../pics/mapa.jpeg"));
        graph.clearRect(0, 0, 1200, 700);
        graph.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
        System.out.println(" cantidad :" + countriesList.size());
        if (!countriesList.isEmpty()) {
            drawMap(graph);
        }
    }

    public void drawMap(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke gross = new BasicStroke(2);
        g2d.setStroke(gross);
        g2d.setColor(new Color(255,128,0));
        g2d.drawLine(335, 425, 425, 465);
        g2d.drawLine(335, 425, 190, 195);
        g2d.drawLine(335, 425, 360, 565);
        g2d.drawLine(335, 425, 665, 205);
        g2d.drawLine(190, 195, 295, 275);
        g2d.drawLine(295, 275, 665, 205);
        g2d.drawLine(665, 205, 575, 355);
        g2d.drawLine(425, 465, 575, 355);
        g2d.drawLine(645, 505, 575, 355);
        g2d.drawLine(645, 505, 360, 565);
        g2d.drawLine(665, 405, 575, 355);
        g2d.drawLine(665, 405, 845, 285);
        g2d.drawLine(665, 405, 985, 515);
        g2d.drawLine(985, 515, 845, 285);
        g2d.drawLine(985, 515, 645, 505);
        g2d.drawLine(965, 175, 845, 285);
        g2d.drawLine(965, 175, 665, 205);

        for (int i = 0; i < countriesList.size(); i++) {
<<<<<<< HEAD
            g2d.drawOval(countriesList.get(i).getX()-1, countriesList.get(i).getY()-1, 32, 32);
            if (!countriesList.get(i).getBlueSoldiersList().isEmpty()) {
                g.setColor(Color.BLUE);
                g.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
                
                String cantidadA = countriesList.get(i).getBlueSoldiersList().size() + "";
=======
            if (countriesList.get(i).getTeam().equals("b")) {
                g.setColor(Color.BLUE);
                g.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
                String cantidadA = countriesList.get(i).getSoldiers()+ "";
>>>>>>> David#3
                g.drawString(cantidadA, countriesList.get(i).getX(), countriesList.get(i).getY());
            }

            if (countriesList.get(i).getTeam().equals("r")) {
                g.setColor(Color.RED);
                g.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
                String cantidadR = countriesList.get(i).getSoldiers() + "";
                g.drawString(cantidadR, countriesList.get(i).getX(), countriesList.get(i).getY());
            }
            
            g.setColor(Color.BLACK);
            g.drawString(countriesList.get(i).getId(), countriesList.get(i).getX()+10, countriesList.get(i).getY()+18);
        }
        
        /*
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
        L.getNeighbortList().add(H);*/
    }


    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }
}
