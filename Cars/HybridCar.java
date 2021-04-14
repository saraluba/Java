public class HybridCar extends Car implements Tankable, Chargable{
    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.printf("Hybrid car %s %s is charged.%n", manufacturer, model);
    }

    @Override
    public void tank() {
        System.out.printf("Hybrid car %s %s is tanked.%n", manufacturer, model);
    }
}
