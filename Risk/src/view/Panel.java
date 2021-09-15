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
        g2d.setColor(new Color(150, 75, 0));
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
            g2d.setColor(new Color(150, 75, 0));
            g2d.drawOval(countriesList.get(i).getX() - 1, countriesList.get(i).getY() - 1, 32, 32);
            if (countriesList.get(i).getTeam() != null && countriesList.get(i).getTeam().equals("b")) {
                g.setColor(Color.BLUE);
                g.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
                String cantidadA = countriesList.get(i).getSoldiers()+ "";
                g.drawString(cantidadA, countriesList.get(i).getX(), countriesList.get(i).getY());
            }

            if (countriesList.get(i).getTeam() != null && countriesList.get(i).getTeam().equals("r")) {
                g.setColor(Color.RED);
                g.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
                String cantidadR = countriesList.get(i).getSoldiers() + "";
                g.drawString(cantidadR, countriesList.get(i).getX(), countriesList.get(i).getY());
            }
            
            g.setColor(Color.BLACK);
            g.drawString(countriesList.get(i).getId(), countriesList.get(i).getX()+10, countriesList.get(i).getY()+18);
        }
    }


    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }
}
