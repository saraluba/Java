package Laptop;

public class TestClass {
    public static void main(String[] args) {
        Processor core = new Processor("Core i7",3.5,4);
        HardDrive aura = new HardDrive("Aura", "SSD", 480);
        Laptop apple = new Laptop("Macbook Pro", core, aura, 13.3,1.37, 8);
        Laptop china = Laptop.deepCloning(apple);
        System.out.println(china.getDisplaySize());
        System.out.println(china.getProcessor());
        System.out.println(apple.getProcessor());
        System.out.println(china.getName());
        System.out.println(china.getWeight());
    }
}
