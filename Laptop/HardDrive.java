package Laptop;

public class HardDrive {
    private String name;
    private String type;
    private int capacity;


    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public static HardDrive cloneHardDrive(HardDrive another){
        return new HardDrive(another.name, another.type, another.capacity);
    }

}
