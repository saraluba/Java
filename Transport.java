package Transport;

public abstract class Transport {
    protected String name;
    protected abstract void sound();
    protected abstract void go();

    public Transport(String name){
        this.name = name;
    }


}
