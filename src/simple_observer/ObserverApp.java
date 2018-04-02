package simple_observer;

public class ObserverApp {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Watched watched = new Watched();
        Watcher watcher = new Watcher();

        watched.addObserver(watcher);
        watched.setData(1);
        watched.setData(2);
    }
}