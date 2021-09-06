package view;

import java.awt.Color;

import javax.swing.JFrame;

import control.Controller;

public class Window extends JFrame{
    private Controller control;
    private Panel panel = new Panel();
    private int i;

    public Window(){
        this.setBounds(10, 10, 1500, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents() {
        this.panel.setBounds(50, 100, 1200, 700);
        this.setBackground(new Color(133, 193, 233));
        this.add(panel);
    }

    public Panel getPanel(){
        return panel;
    }
}
