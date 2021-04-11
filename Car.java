package Transport;

public class Car extends Transport{
    public Car(String name) {
        super(name);
    }

    @Override
    protected void sound() {
        System.out.println("Beep!");
    }

    @Override
    protected void go() {
        System.out.printf("Car %s is going%n",name);
    }
}
