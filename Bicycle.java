package Transport;

public class Bicycle extends Transport{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    protected void sound() {
        System.out.println("Beep!");
    }

    @Override
    protected void go() {
        System.out.printf("Bike %s is going%n", name);
    }
}
