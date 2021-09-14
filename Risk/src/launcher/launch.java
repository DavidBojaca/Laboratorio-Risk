package launcher;

import control.Controller;
import model.Funtions;
import view.Window;

public class launch {
    public static void main(String[] args) {
        Window window = new Window();
        Funtions model = new Funtions(window);
        Controller control = new Controller(model, window);
    }
}
