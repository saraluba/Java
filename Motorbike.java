package Transport;

public class Motorbike extends Transport {
    public Motorbike(String name) {
        super(name);
    }

    @Override
    protected void sound() {
        System.out.println("Beep!");
    }

    @Override
    protected void go() {
        System.out.printf("Motorbike %s is going%n", name);
    }
}