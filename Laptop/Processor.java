package Laptop;

public class Processor {
    private String name;
    private double frequency;
    private int numberOfCores;

    public Processor(String name, double frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public static Processor cloneProcessor(Processor another){
        return new Processor(another.name, another.frequency, another.numberOfCores);
    }

}
