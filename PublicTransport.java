package Transport;

public abstract class PublicTransport extends Transport{
    protected int maxPassengers;
    protected int seats;

    public PublicTransport(String name, int maxPassengers) {
        super(name);
        this.maxPassengers = maxPassengers;
        this.seats = maxPassengers;
    }


    public int getMaxPassengers(){
        return maxPassengers;
    }

    protected void numberOfFreeSeats(int passengers){ //how many seats left when ... passengers came to the bus/train/airplane
        if(passengers < seats){
            seats = seats - passengers;
            System.out.printf("We have %d free seats!%n", seats);
        } else if(passengers == seats){
            seats = 0;
            System.out.println("There is not a seat left!");
        } else{
            System.out.printf("We can't take %d passengers. There is not enough seats!%n", passengers - seats);
            seats = 0;
        }
    }
}
