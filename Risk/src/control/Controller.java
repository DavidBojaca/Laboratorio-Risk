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
        
    }
}
