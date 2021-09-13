package view;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


import java.awt.Graphics;


public class Panel extends JPanel{
    
    public Panel(){
        this.setVisible(true);
    }


    @Override
    public void paint(Graphics graph) {
        
        ImageIcon background = new ImageIcon(getClass().getResource("../pics/mapa.jpeg"));
        graph.clearRect(0, 0, 1200, 700);
        graph.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
        
    }
}
