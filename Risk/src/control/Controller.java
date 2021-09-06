package control;

import model.Operations;
import view.Window;

public class Controller {
    private Operations model;
    private Window view;

    public Controller(Operations m, Window v){
        this.model = m;
        this.view = v;
    }
}
