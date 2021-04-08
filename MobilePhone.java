public class MobilePhone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePhone(String brand, int batteryCapacity, int memory){
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public void charge(){
        batteryAmount = batteryCapacity;
        System.out.println(brand + " has been charged. Remain battery capacity: " + batteryAmount + " mAh");
    }

    public void installAplication(String applicationName, int memory1){
        if(batteryAmount > 0 && memory>memory1) {
            if (freeMemory - memory1 > 0) {
                freeMemory = freeMemory - memory1;
                System.out.printf("Application %s has been installed on %s. Remain memory: %d MB %n", applicationName, brand, freeMemory);
            } else {
                System.out.printf("Application %s can't be installed on %s.There are no enough memory. %n", applicationName, brand);
            }
        } else{
            System.out.println("Phone discharged!");
        }
    }

    public void use(String appName, int hours){
        if(batteryAmount>0) {
                int battery = 100 * hours;
                if (batteryAmount - battery > 0) {
                    batteryAmount = batteryAmount - battery;
                    System.out.printf("Application %s has been ran for %d hours on %s. Remain battery capacity: %d mAh %n", appName, hours, brand, batteryAmount);
                } else {
                    System.out.printf("Application %s has been run for %d hours on %s. Phone has been discharged. %n", appName, batteryAmount / 100, brand);
                    batteryAmount = 0;
                }
        } else{
            System.out.println("Phone discharged!");
        }
    }
}
