package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import model.Country;
import model.Map;

import java.awt.Color;
import java.awt.Graphics;
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
        graph.setColor(Color.GREEN);

        if (!countriesList.isEmpty()) {
            for (int i = 0; i < countriesList.size(); i++) {
                graph.fillOval(countriesList.get(i).getX(), countriesList.get(i).getY(), 30, 30);
            }
        }
        
        /*
        graph.fillOval(175, 180, 30, 30);
        graph.fillOval(250, 280, 30, 30);
        graph.fillOval(320, 410, 30, 30);
        graph.fillOval(410, 450, 30, 30);
        graph.fillOval(345, 550, 30, 30);
        graph.fillOval(650, 190, 30, 30);
        graph.fillOval(950, 160, 30, 30);
        graph.fillOval(830, 270, 30, 30);
        graph.fillOval(560, 340, 30, 30);
        graph.fillOval(650, 390, 30, 30);
        graph.fillOval(630, 490, 30, 30);
        graph.fillOval(970, 500, 30, 30);*/
    }

    public ArrayList<Country> getCountriesList() {
        return countriesList;
    }
}
