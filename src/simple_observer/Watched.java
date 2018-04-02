package simple_observer;

import java.util.Observable;
import java.util.Observer;

public class Watched extends Observable {

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        //super.setChanged();
        //super.notifyObservers(data);
        setChanged();
        notifyObservers(data);
    }

    @Override
    public synchronized void addObserver(Observer o) {
        System.out.println("Watched addObserver : " + " Running");
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        System.out.println("Watched deleteObserver : " + " Running");
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Watched notifyObservers : " + " Running");
        super.notifyObservers();
    }

    @Override
    public void notifyObservers(Object arg) {
        System.out.println("Watched notifyObservers Object arg : " + " Running");
        super.notifyObservers(arg);
    }

    @Override
    public synchronized void deleteObservers() {
        System.out.println("Watched deleteObservers : " + " Running");
        super.deleteObservers();
    }

    @Override
    protected synchronized void setChanged() {
        System.out.println("Watched setChanged : " + " Running");
        super.setChanged();
    }

    @Override
    protected synchronized void clearChanged() {
        System.out.println("Watched clearChanged : " + " Running");
        super.clearChanged();
    }

    @Override
    public synchronized boolean hasChanged() {
        System.out.println("Watched hasChanged : " + " Running");
        return super.hasChanged();
    }

    @Override
    public synchronized int countObservers() {
        System.out.println("Watched countObservers : " + " Running");
        return super.countObservers();
    }
}
