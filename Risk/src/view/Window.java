package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.Controller;
import utils.Utils;

public class Window extends JFrame{
    private Controller control;
    private Panel panel = new Panel();
    private JButton play = new JButton("Play");
    private JButton attack = new JButton("Attack");
    private JLabel country1 = new JLabel("");
    private JLabel labelCountry1 = new JLabel("Country:");
    private JTextField inputCountry1 = new JTextField("",10);
    private JLabel country2 = new JLabel("");
    private JLabel labelCountry2 = new JLabel("Objective:");
    private JTextField inputCountry2 = new JTextField("",10);
    private JLabel move = new JLabel("");
    private JLabel labelMove = new JLabel("Move:");
    private JTextField inputMove = new JTextField("",10);

    public Window(){
        this.setBounds(10, 10, 1500, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.initComponents();
        this.setVisible(true);
    }

    public void initComponents() {
        this.labelCountry1.setBounds(1300, 200, 80, 40);
        this.add(labelCountry1);
        this.inputCountry1.setBounds(1350, 200, 80, 40);
        this.add(inputCountry1);
        this.labelCountry2.setBounds(1300, 300, 80, 40);
        this.add(labelCountry2);
        this.inputCountry2.setBounds(1360, 300, 80, 40);
        this.add(inputCountry2);
        this.labelMove.setBounds(1300, 500, 80, 40);
        this.add(labelMove);
        this.inputMove.setBounds(1350, 500, 80, 40);
        this.add(inputMove);
        this.attack.setBounds(1300, 400, 100, 50);
        this.add(attack);
        this.play.setBounds(1300, 100, 100, 50);
        this.add(play);
        this.panel.setBounds(0, 0, 1200, 700);
        this.setBackground(new Color(133, 193, 233));
        this.add(panel);
    }

    public void setController(Controller c){
        this.control = c;
        this.play.setActionCommand(Utils.PLAY);
        this.play.addActionListener(this.control);
        this.attack.setActionCommand(Utils.ATTACK);
        this.attack.addActionListener(this.control);
    }

    public Panel getPanel(){
        return panel;
    }

    public JLabel getCountry1() {
        return country1;
    }

    public JLabel getCountry2() {
        return country2;
    }

    public JLabel getMove() {
        return move;
    }

    public JTextField getInputCountry1() {
        return inputCountry1;
    }

    public JTextField getInputCountry2() {
        return inputCountry2;
    }

    public JTextField getInputMove() {
        return inputMove;
    }
}
