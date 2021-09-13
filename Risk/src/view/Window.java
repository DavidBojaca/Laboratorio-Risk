package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import control.Controller;

public class Window extends JFrame{
    private Controller control;
    private Panel panel = new Panel();
<<<<<<< HEAD
    private int i;
=======
    private JButton play = new JButton("Play");
>>>>>>> jesus

    public Window(){
        this.setBounds(10, 10, 1500, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setExtendedState(6);
        this.setVisible(true);
    }

    public void initComponents() {
        this.play.setBounds(1300, 100, 100, 50);
        this.add(play);
        this.panel.setBounds(0, 0, 1200, 700);
        this.setBackground(new Color(133, 193, 233));
        this.add(panel);
    }

    public void setController(Controller c){
        this.control = c;
    }

    public Panel getPanel(){
        return panel;
    }
}
