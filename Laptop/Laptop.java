package Laptop;

public class Laptop {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private double displaySize;
    private double weight;
    private int ramAmount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, double displaySize, double weight, int ramAmount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.ramAmount = ramAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public static Laptop deepCloning(Laptop another){
        return new Laptop(another.name, Processor.cloneProcessor(another.processor), HardDrive.cloneHardDrive(another.hardDrive), another.displaySize, another.weight, another.ramAmount);
    }

}
