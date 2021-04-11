package Transport;

public class Train extends PublicTransport{
    public Train(String name, int maxPassengers) {
        super(name, maxPassengers);
    }

    @Override
    protected void go() {
        System.out.printf("Train %s is going%n", name);
    }
}
