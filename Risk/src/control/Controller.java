package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Funtions;
import view.Window;

public class Controller implements ActionListener {
    private Funtions model;
    private Window view;

    public Controller(Funtions m, Window v){
        this.model = m;
        this.view = v;
        this.view.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent action) {
        if (action.getActionCommand().equals("Play")) {
            model.countriesCreation();
        }
        if (action.getActionCommand().equals("Attack")) {
            view.getCountry1().setText(view.getInputCountry1().getText());
            view.getCountry2().setText(view.getInputCountry2().getText());
            view.getMove().setText(view.getInputMove().getText());
            int move = Integer.valueOf(view.getInputMove().getText());
            model.playerTurn(view.getInputCountry1().getText(), view.getInputCountry2().getText(), move);
            System.out.println(view.getInputCountry1().getText());
            System.out.println(view.getInputCountry2().getText());
            System.out.println(move);
        }
        
    }
}
