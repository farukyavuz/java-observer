package simple_observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Data was changed as " + arg);
    }
}
