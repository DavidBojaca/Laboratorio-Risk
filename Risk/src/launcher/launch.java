package launcher;

import control.Controller;
import model.Operations;
import view.Window;

public class launch {
    public static void main(String[] args) {
        Window window = new Window();
        Operations model = new Operations(window);
        Controller control = new Controller(model, window);
    }
}
