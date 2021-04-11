package Transport;

public class Testing {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota");
        Bicycle kross = new Bicycle("Kross");
        Train train = new Train("Train", 15);
        Airplane a123 = new Airplane("A123",100);
        toyota.go();
        kross.go();
        a123.go();
        toyota.sound();
        listen(toyota);
        listen(kross);
        passengers(train);
        passengers(train);
        passengers(a123);
        a123.numberOfFreeSeats(90);
        System.out.println(a123.getMaxPassengers());

    }

    private static void listen(Transport transport){
        transport.sound();
    }

    private static void passengers(PublicTransport publicTransport){
        publicTransport.numberOfFreeSeats(10);
    }

}
