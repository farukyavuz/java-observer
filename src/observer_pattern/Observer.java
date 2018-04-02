package observer_pattern;


abstract class Observer {
    protected Subject subject;
    public abstract void update();
}