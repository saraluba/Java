public class CarTester {
    public static void main(String[] args) {
        FuelCar toyota = new FuelCar("Toyota", "Yaris");
        ElectricCar nissan = new ElectricCar("Nissan", "Leaf");
        HybridCar honda = new HybridCar("Honda", "CR-V");
        Car[] cars = {toyota, nissan, honda};
        for (Car car : cars) {
            if(car instanceof Tankable){
                ((Tankable) car).tank();
            }
            if(car instanceof Chargable){
                ((Chargable) car).charge();
            }
        }
    }
}

