package Transport;

public class Bus extends PublicTransport{
    public Bus(String name, int maxPassengers) {
        super(name, maxPassengers);
    }

    @Override
    protected void sound() {
        System.out.println("Beep");
    }

    @Override
    protected void go() {
        System.out.printf("Bus %s is going%n", name);
    }
}
