package Transport;

public class Airplane extends PublicTransport{
    public Airplane(String name, int maxPassengers) {
        super(name, maxPassengers);
    }

    @Override
    protected void sound() {
        System.out.println("no sound");
    }

    @Override
    protected void go() {
        System.out.printf("Airplane %s is flying%n", name);
    }
}
